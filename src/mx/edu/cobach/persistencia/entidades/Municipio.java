package mx.edu.cobach.persistencia.entidades;
// Generated May 26, 2015 1:34:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Municipio generated by hbm2java
 */
public class Municipio  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set<Sede> sedes = new HashSet<Sede>(0);

    public Municipio() {
    }

	
    public Municipio(String nombre) {
        this.nombre = nombre;
    }
    public Municipio(String nombre, Set<Sede> sedes) {
       this.nombre = nombre;
       this.sedes = sedes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Sede> getSedes() {
        return this.sedes;
    }
    
    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }




}


