/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.cobach.persitencia;

import java.util.List;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Alex
 * @param <T>
 */
public class BaseDAO<T> implements InterfaceDAO<T> {
    
    protected Class<T> entityClass;
    protected Session session;
    protected Transaction tx;
    
    public BaseDAO(){
    }
    
    @Override
    public void setEntity(Class<T> entityClass){
        this.entityClass = entityClass;
    }
    
    @Override
    public void saveOrUpdate(T t) {
        try{
            startOperation();
            session.saveOrUpdate(t);
            tx.commit();
            System.out.println("Guardado exitoso");
        }catch(HibernateException e){
            tx.rollback();
        }finally{
            session.close();
        }
    }

    @Override
    public T find(int id) {
        T t = null;
        try{
            startOperation();
            t = (T) session.load(entityClass, id);
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
        }finally{
            session.close();
        }
        return t;
    }

    @Override
    public List<T> findAll() {
        List<T> ts = null;        
        try{
            startOperation();
            Query query = session.createQuery("from " + entityClass.getName());
            ts = query.list();
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
        }finally{
            session.close();
        }
        return ts;
    }

    @Override
    public void delete(T t) {        
        try{
            startOperation();
            session.delete(t);
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
        }finally{
            session.close();
        }
    }
    
    protected void startOperation() throws HibernateException{
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
    
}
