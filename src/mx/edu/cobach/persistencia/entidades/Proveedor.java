package mx.edu.cobach.persistencia.entidades;
// Generated Apr 13, 2015 12:14:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer id;
     private TipoProveedor tipoProveedor;
     private String primerNombre;
     private String segundoNombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String correoElectronico;
     private String telefono;
     private double calificacion;
     private Set<ImplementacionEvento> implementacionEventos = new HashSet<ImplementacionEvento>(0);
     private Set<Evento> eventos = new HashSet<Evento>(0);

    public Proveedor() {
    }

    public Proveedor(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

	
    public Proveedor(TipoProveedor tipoProveedor, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,String telefono, String correoElectronico, double calificacion) {
        this.tipoProveedor = tipoProveedor;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.calificacion = calificacion;
        this.telefono=telefono;
    }
    public Proveedor(TipoProveedor tipoProveedor, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,String telefono, String correoElectronico, double calificacion, Set<ImplementacionEvento> implementacionEventos) {
       this.tipoProveedor = tipoProveedor;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.correoElectronico = correoElectronico;
       this.calificacion = calificacion;
       this.implementacionEventos = implementacionEventos;
       this.telefono = telefono;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TipoProveedor getTipoProveedor() {
        return this.tipoProveedor;
    }
    
    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }
    public String getPrimerNombre() {
        return this.primerNombre;
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return this.segundoNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public double getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public Set<ImplementacionEvento> getImplementacionEventos() {
        return this.implementacionEventos;
    }
    
    public void setImplementacionEventos(Set<ImplementacionEvento> implementacionEventos) {
        this.implementacionEventos = implementacionEventos;
    }
    
    public Set<Evento> getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String toString(){
        return this.primerNombre+" "+this.segundoNombre+" "+this.apellidoPaterno
                +this.apellidoMaterno;
    }


}


