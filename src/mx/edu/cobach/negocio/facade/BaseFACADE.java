/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persitencia.BaseDAO;
import mx.edu.cobach.persitencia.ServiceLocator;

/**
 *
 * @author Alex
 */
public class BaseFACADE<T> implements InterfaceFACADE<T>{
    
    private BaseDAO<T> dao;
    
    @Override
    public void setEntity(Class<T> cl){
        dao = ServiceLocator.getInstance();
        dao.setEntity(cl);
    }

    @Override
    public void saveOrUpdate(T t) {
        dao.saveOrUpdate(t);
    }

    @Override
    public T find(int id) {
        return dao.find(id);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(T t) {
        dao.delete(t);
    }
    
}
