/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

/**
 * Clase para localizacion de servicios FACADE
 * @author Alex
 */
public class ServiceLocatorFACADE {
    
    //FACADE generico
    private static BaseFACADE facade;
    private static PuestoFACADE puestoFacade;
    private static CursoFACADE cursoFacade;
    private static EmpleadoFACADE empleadoFacade;
    private static UsuarioFACADE usuarioFacade;
    private static DepartamentoFACADE departamentoFacade;
    private static SedeFACADE sedeFacade;
    private static ReporteFACADE reporteFacade;
    /**
     * Obtiene el FACADE generico, si este no ha sido inicilizado se instanciara
     * @return Regresa FACADE generico
     */
    public static BaseFACADE getInstance(){
        if(facade == null){
            facade = new BaseFACADE();
        }
        return facade;
    }
    
    public static EmpleadoFACADE getEmpleadoFacade(){
        if(empleadoFacade == null){
            empleadoFacade = new EmpleadoFACADE();
        }
        return empleadoFacade;
    }
    
    public static PuestoFACADE getPuesto(){
        if(puestoFacade == null){
            puestoFacade = new PuestoFACADE();
        }
        return puestoFacade;
    }
    
    public static CursoFACADE getCurso(){
        if(cursoFacade == null){
            cursoFacade = new CursoFACADE();
        }
        return cursoFacade;
    }
    
    public static UsuarioFACADE getUsuario(){
        if(usuarioFacade==null){
            usuarioFacade = new UsuarioFACADE();
        }
        return usuarioFacade;
    }
    
    public static SedeFACADE getSede(){
        if(sedeFacade==null){
            sedeFacade = new SedeFACADE();
        }
        return sedeFacade;
    }
    
    public static DepartamentoFACADE getDepartamento(){
        if(departamentoFacade == null){
            departamentoFacade = new DepartamentoFACADE();
        }
        return departamentoFacade;
    }
    public static ReporteFACADE getReporteFacade(){
        if(reporteFacade == null){
            reporteFacade = new ReporteFACADE();
        }
        return reporteFacade;
    }
}
