package mx.edu.cobach.persistencia.entidades;
// Generated May 26, 2015 1:34:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Zona generated by hbm2java
 */
public class Zona  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set<Plantel> plantels = new HashSet<Plantel>(0);

    public Zona() {
    }

	
    public Zona(String nombre) {
        this.nombre = nombre;
    }
    public Zona(String nombre, Set<Plantel> plantels) {
       this.nombre = nombre;
       this.plantels = plantels;
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
    public Set<Plantel> getPlantels() {
        return this.plantels;
    }
    
    public void setPlantels(Set<Plantel> plantels) {
        this.plantels = plantels;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}


