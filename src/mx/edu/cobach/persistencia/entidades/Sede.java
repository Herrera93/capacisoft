package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sede generated by hbm2java
 */
public class Sede  implements java.io.Serializable {


     private Integer id;
     private Municipio municipio;
     private String nombre;
     private int capacidad;
     private String calle;
     private String numeroDireccion;
     private String colonia;
     private String lugar;
     private Set<ImplementacionCurso> implementacionCursos = new HashSet<ImplementacionCurso>(0);

    public Sede() {
    }

	
    public Sede(Municipio municipio, String nombre, int capacidad, String calle, String numeroDireccion, String colonia, String lugar) {
        this.municipio = municipio;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.calle = calle;
        this.numeroDireccion = numeroDireccion;
        this.colonia = colonia;
        this.lugar = lugar;
    }
    public Sede(Municipio municipio, String nombre, int capacidad, String calle, String numeroDireccion, String colonia, String lugar, Set<ImplementacionCurso> implementacionCursos) {
       this.municipio = municipio;
       this.nombre = nombre;
       this.capacidad = capacidad;
       this.calle = calle;
       this.numeroDireccion = numeroDireccion;
       this.colonia = colonia;
       this.lugar = lugar;
       this.implementacionCursos = implementacionCursos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumeroDireccion() {
        return this.numeroDireccion;
    }
    
    public void setNumeroDireccion(String numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Set<ImplementacionCurso> getImplementacionCursos() {
        return this.implementacionCursos;
    }
    
    public void setImplementacionCursos(Set<ImplementacionCurso> implementacionCursos) {
        this.implementacionCursos = implementacionCursos;
    }




}


