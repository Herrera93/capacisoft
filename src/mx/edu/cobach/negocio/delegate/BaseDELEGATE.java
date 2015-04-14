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

    @Override
    public void saveOrUpdate(T t) {
        ((BaseFACADE<T>) ServiceLocatorFACADE.getInstance()).saveOrUpdate(t);
    }

    @Override
    public T find(int id) {
        return ((BaseFACADE<T>) ServiceLocatorFACADE.getInstance()).find(id);
    }

    @Override
    public List<T> findAll() {
        return ((BaseFACADE<T>) ServiceLocatorFACADE.getInstance()).findAll();
    }

    @Override
    public void delete(T t) {
        ((BaseFACADE<T>) ServiceLocatorFACADE.getInstance()).delete(t);
    }

    @Override
    public void setEntity(Class<T> cl) {
        ((BaseFACADE<T>) ServiceLocatorFACADE.getInstance()).setEntity(cl);
    }   
    
}
