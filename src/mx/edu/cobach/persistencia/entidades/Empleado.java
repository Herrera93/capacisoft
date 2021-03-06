package mx.edu.cobach.persistencia.entidades;
// Generated May 26, 2015 1:34:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Adscripcion adscripcion;
     private Departamento departamento;
     private Plantel plantel;
     private Direccion direccion;
     private Puesto puesto;
     private String numero;
     private String primerNombre;
     private String segundoNombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String correo;
     private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);
     private Set<ImplementacionEvento> implementacionEventos = new HashSet<ImplementacionEvento>(0);

    public Empleado() {
    }

	
    public Empleado(Adscripcion adscripcion, Puesto puesto, String numero, String primerNombre, String apellidoPaterno, String apellidoMaterno, String correo) {
        this.adscripcion = adscripcion;
        this.puesto = puesto;
        this.numero = numero;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
    }
    public Empleado(Adscripcion adscripcion, Departamento departamento, Plantel plantel, Puesto puesto, Direccion direccion, String numero, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String correo, Set<Respuesta> respuestas, Set<ImplementacionEvento> implementacionEventos) {
       this.adscripcion = adscripcion;
       this.departamento = departamento;
       this.plantel = plantel;
       this.puesto = puesto;
       this.direccion = direccion;
       this.numero = numero;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.correo = correo;
       this.respuestas = respuestas;
       this.implementacionEventos = implementacionEventos;
    }
   
    public Adscripcion getAdscripcion() {
        return this.adscripcion;
    }
    
    public void setAdscripcion(Adscripcion adscripcion) {
        this.adscripcion = adscripcion;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Plantel getPlantel() {
        return this.plantel;
    }
    
    public void setPlantel(Plantel plantel) {
        this.plantel = plantel;
    }
    public Puesto getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
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
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    public Set<ImplementacionEvento> getImplementacionEventos() {
        return this.implementacionEventos;
    }
    
    public void setImplementacionEventos(Set<ImplementacionEvento> implementacionEventos) {
        this.implementacionEventos = implementacionEventos;
    }

    @Override
    public String toString(){
        System.out.println("Seg: " + segundoNombre);
        if(segundoNombre == null || segundoNombre.isEmpty()){
            return primerNombre + " " + apellidoPaterno + " " + apellidoMaterno;
        }else{
            return primerNombre + " " + segundoNombre + " " + apellidoPaterno +
                    " " + apellidoMaterno;
        }
    }
}


