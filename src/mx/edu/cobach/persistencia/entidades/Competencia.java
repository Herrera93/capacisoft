package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Competencia generated by hbm2java
 */
public class Competencia  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set<Aspecto> aspectos = new HashSet<Aspecto>(0);

    public Competencia() {
    }

	
    public Competencia(String nombre) {
        this.nombre = nombre;
    }
    public Competencia(String nombre, Set<Aspecto> aspectos) {
       this.nombre = nombre;
       this.aspectos = aspectos;
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
    public Set<Aspecto> getAspectos() {
        return this.aspectos;
    }
    
    public void setAspectos(Set<Aspecto> aspectos) {
        this.aspectos = aspectos;
    }

    @Override
    public String toString(){
        return nombre;
    }
}


