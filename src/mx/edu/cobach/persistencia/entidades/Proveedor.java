package mx.edu.cobach.persistencia.entidades;
// Generated May 26, 2015 1:34:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer id;
     private Evento evento;
     private TipoProveedor tipoProveedor;
     private String primerNombre;
     private String segundoNombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String telefono;
     private String correoElectronico;
     private double calificacion;
     private Set<ImplementacionEvento> implementacionEventos = new HashSet<ImplementacionEvento>(0);

    public Proveedor() {
    }

	
    public Proveedor(Evento evento, TipoProveedor tipoProveedor, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, double calificacion) {
        this.evento = evento;
        this.tipoProveedor = tipoProveedor;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.calificacion = calificacion;
    }
    public Proveedor(Evento evento, TipoProveedor tipoProveedor, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, double calificacion, Set<ImplementacionEvento> implementacionEventos) {
       this.evento = evento;
       this.tipoProveedor = tipoProveedor;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.telefono = telefono;
       this.correoElectronico = correoElectronico;
       this.calificacion = calificacion;
       this.implementacionEventos = implementacionEventos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
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
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String toString(){
        return this.primerNombre+" "+this.segundoNombre+" "
                + this.apellidoPaterno + this.apellidoMaterno;
    }


}


