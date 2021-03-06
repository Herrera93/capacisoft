/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

/**
 * Clase para localizacion de servicios DELEGATE
 * @author Alex
 */
public class ServiceLocatorDELEGATE {
    
    //DELEGATE generico
    private static BaseDELEGATE delegate;
    //DELEGATE especificos
    private static PuestoDELEGATE puestoDelegate;
    private static EventoDELEGATE eventoDelegate;
    private static EmpleadoDELEGATE empleadoDelegate;
    private static UsuarioDELEGATE usuarioDelegate;
    private static DepartamentoDELEGATE departamentoDelegate;
    private static SedeDELEGATE sedeDelegate;
    private static ReporteDELEGATE reporteDelegate;
    private static EncuestaDELEGATE encuestaDelegate;
    private static ImplementarEventoDELEGATE implementarEventoDelegate;
    private static ProveedorDELEGATE proveedorDelegate;
    private static PlantelDELEGATE plantelDelegate;
    private static AlertaDELEGATE alertaDelegate;
    private static DireccionDELEGATE direccionDelegate;
    
    /**
     * Obtiene el DELEGATE generico, si este no ha sido inicilizado se instanciara.
     * Este metodo utiliza el aptron de diseno Singleton.
     * @return Regresa DELEGATE generico
     */
    public static BaseDELEGATE getInstance(){
        if(delegate == null){
            delegate = new BaseDELEGATE();
        }        
        return delegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Usuario, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Usuario
     */
    public static UsuarioDELEGATE getUsuario(){
        if(usuarioDelegate == null){
            usuarioDelegate = new UsuarioDELEGATE();
        }
        return usuarioDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Sede, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Sede
     */
    public static SedeDELEGATE getSede(){
        if(sedeDelegate == null){
            sedeDelegate = new SedeDELEGATE();
        }
        return sedeDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Empleado, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Empleado
     */
    public static EmpleadoDELEGATE getEmpleado(){
        if(empleadoDelegate == null){
            empleadoDelegate = new EmpleadoDELEGATE();
        }
        return empleadoDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Puesto, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Puesto
     */
    public static PuestoDELEGATE getPuesto(){
        if(puestoDelegate == null){
            puestoDelegate = new PuestoDELEGATE();
        }        
        return puestoDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Direccion, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Direccion
     */
    public static DireccionDELEGATE getDireccion(){
        if(direccionDelegate == null){
            direccionDelegate = new DireccionDELEGATE();
        }        
        return direccionDelegate;
    }
        
    /**
     * Obtiene el DELEGATE especifico de la entidad Proveedor, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Proveedor
     */
    public static ProveedorDELEGATE getProveedorDelegate(){
        if(proveedorDelegate == null){
            proveedorDelegate = new ProveedorDELEGATE();
        }        
        return proveedorDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Plantel, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Plantel
     */
    public static PlantelDELEGATE getPlantelDelegate(){
        if(plantelDelegate == null){
            plantelDelegate = new PlantelDELEGATE();
        }        
        return plantelDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad evento, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Evento
     */
    public static EventoDELEGATE getEvento(){
        if(eventoDelegate == null){
            eventoDelegate = new EventoDELEGATE();
        }
        return eventoDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Departamento, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Departamento
     */
    public static DepartamentoDELEGATE getDepartamento(){
        if(departamentoDelegate == null){
            departamentoDelegate = new DepartamentoDELEGATE();
        }
        return departamentoDelegate;
    }
    /**
     * Obtiene el DELEGATE especifico de la entidad ImplementacionEvento, si este
     * no ha sido inicializado se instanciara. Este metodo utiliza el patron de
     * diseno Singleton.
     * @return Regresa el DELEGATE de Programar
     */
    public static ImplementarEventoDELEGATE getImplementarEvento(){
        if(implementarEventoDelegate == null){
            implementarEventoDelegate = new ImplementarEventoDELEGATE();
        }
        return implementarEventoDelegate;
    }

    /**
     * Obtiene el DELEGATE especifico de la entidad Encuesta, si este
     * no ha sido inicializado se instanciara. Este metodo utiliza el patron de
     * diseno Singleton.
     * @return Regresa el DELEGATE de encuesta
     */
    public static EncuestaDELEGATE getEncuesta() {
        if(encuestaDelegate == null){
            encuestaDelegate = new EncuestaDELEGATE();
        }
        return encuestaDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico para el caso de uso Generar Reporte, si este
     * no ha sido inicializado se instanciara. Este metodo utiliza el patron de
     * diseno Singleton.
     * @return Regresa el DELEGATE de Geenerar Reporte
     */
    public static ReporteDELEGATE getReporte() {
        if(reporteDelegate == null){
            reporteDelegate = new ReporteDELEGATE();
        }
        return reporteDelegate;
    }
    
    public static AlertaDELEGATE getAlerta(){
        if(alertaDelegate == null){
            alertaDelegate = new AlertaDELEGATE();
        }
        return alertaDelegate;
    }
    
}
