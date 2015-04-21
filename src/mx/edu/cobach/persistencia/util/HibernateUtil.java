/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;

/**
 *Hibernate Util es una clase con un metodo conveniente para obtener un objeto 
 *de la fabrica de sesiones
 */
public class HibernateUtil {
    //Fabrica de sesiones
    private static SessionFactory sessionFactory;
    //Sesion con la base de datos
    private static Session session;
    //Transaccion actual donde se hacen operaciones
    private static Transaction tx;
    
    /**
     * Inicializacion de la fabrica de sesiones
     */
    static {
        Configuration config = new Configuration();
        config.configure();
        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties()).build();
        config.setSessionFactoryObserver(new SessionFactoryObserver(){

            @Override
            public void sessionFactoryCreated(SessionFactory sf) {
            }

            @Override
            public void sessionFactoryClosed(SessionFactory sf) {
                ((StandardServiceRegistryImpl) sr).destroy();
            }
            
        });
        sessionFactory = config.buildSessionFactory(sr);        
    }
    
    /**
     * Metodo para la obtencion de la sesion actual con la base de datos, si 
     * esta no se encuentra abierta, la abrira.
     * @return Sesion con la base de datos
     */
    public static Session getSession(){
        if(session == null){
            openSession();
        }
        return session;
    }
    
    /**
     * Crea y abre la sesion con la base de datos.
     */
    public static void openSession(){
        if(session == null){
            session = sessionFactory.openSession();
        }
    }
    
    /**
     * Limpia y cierra la sesion actual, si esta esta abierta.
     */
    public static void closeSession(){
        if(session != null && session.isOpen()){
            session.flush();
            session.close();
        }
        session=null;
    }
    
    /**
     * Se comienza una transaccion en la sesion actual
     */
    public static void beginTransaction(){
        if(tx == null && session.isOpen()){
            tx = session.beginTransaction();
        }
    }
    
    /**
     * Metodo para cometer la transaccion, haciendo los cambios en la 
     * base de datos
     */
    public static void commitTransaction(){
        if(tx != null && !tx.wasCommitted() && !tx.wasRolledBack()){
            tx.commit();
            tx = null;
        }
    }
    
    /**
     * Metodo para retroceder a la transaccion, eliminando los cambios que se
     * llevaron a cabo en la transaccion
     */
    public static void rollbackTransaction(){
        if(tx != null && !tx.wasCommitted() && !tx.wasRolledBack()){
            tx.rollback();
            tx = null;
        }        
    }
    
    /**
     * Cierra la fabrica de sesiones
     */
    public static void closeFactory(){
        sessionFactory.close();
    }
}

