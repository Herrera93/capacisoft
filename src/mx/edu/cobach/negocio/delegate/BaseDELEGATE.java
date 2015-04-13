/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.BaseFACADE;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;

/**
 *
 * @author Alex
 */
public class BaseDELEGATE<T> implements InterfaceDELEGATE<T>{
    
    private BaseFACADE<T> facade;

    @Override
    public void saveOrUpdate(T t) {
        facade.saveOrUpdate(t);
    }

    @Override
    public T find(int id) {
        return facade.find(id);
    }

    @Override
    public List<T> findAll() {
        return facade.findAll();
    }

    @Override
    public void delete(T t) {
        facade.delete(t);
    }

    @Override
    public void setEntity(Class<T> cl) {
        facade = ServiceLocatorFACADE.getInstance();
        facade.setEntity(cl);
    }   
    
}
