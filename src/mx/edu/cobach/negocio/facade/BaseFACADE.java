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
    
    @Override
    public void setEntity(Class<T> cl){
        ((BaseDAO<T>) ServiceLocator.getInstance()).setEntity(cl);
    }

    @Override
    public void saveOrUpdate(T t) {
        ((BaseDAO<T>) ServiceLocator.getInstance()).saveOrUpdate(t);
    }

    @Override
    public T find(int id) {
        return ((BaseDAO<T>) ServiceLocator.getInstance()).find(id);
    }

    @Override
    public List<T> findAll() {
        return ((BaseDAO<T>) ServiceLocator.getInstance()).findAll();
    }

    @Override
    public void delete(T t) {
        ((BaseDAO<T>) ServiceLocator.getInstance()).delete(t);
    }
    
}
