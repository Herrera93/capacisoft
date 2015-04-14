/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.BaseDELEGATE;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author Alex
 */
public class BaseControlador<T> implements InterfaceControlador<T> {

    private final Comunicador com;
    
    public BaseControlador(Comunicador com){
        this.com = com;
    }
    
    @Override
    public void alta(T t) {
        ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance())
                .saveOrUpdate(t);
        com.setMensaje("Se ha guardado existosamente");
    }

    @Override
    public void baja(T t) {
        ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance()).delete(t);
        com.setMensaje("Se ha eliminado exitosamente");
    }

    @Override
    public void modificacion(T t) {
        ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance())
                .saveOrUpdate(t);
        com.setMensaje("Se ha modificado existosamente");
    }

    @Override
    public void buscar(int id, Class<T> cl) {
        ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance())
                .setEntity(cl);
        T t = ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance()).find(id);
        com.setTabla(HelperEntidad.descomponerObjeto(t));
    }

    @Override
    public void buscarTodos(Class<T> cl) {
        ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance())
                .setEntity(cl);
        List<T> ts = ((BaseDELEGATE<T>) ServiceLocatorDELEGATE.getInstance())
                .findAll();
        com.setTabla(HelperEntidad.descomponerObjetos((List<Object>) ts));
    }
        
}
