package mx.edu.cobach.persistencia.entidades;
// Generated May 26, 2015 1:34:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Alerta generated by hbm2java
 */
public class Alerta  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private int periodo;
     private Set<ImplementacionEvento> implementacionEventos = new HashSet<ImplementacionEvento>(0);

    public Alerta() {
    }

	
    public Alerta(String descripcion, int periodo) {
        this.descripcion = descripcion;
        this.periodo = periodo;
    }
    public Alerta(String descripcion, int periodo, Set<ImplementacionEvento> implementacionEventos) {
       this.descripcion = descripcion;
       this.periodo = periodo;
       this.implementacionEventos = implementacionEventos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public Set<ImplementacionEvento> getImplementacionEventos() {
        return this.implementacionEventos;
    }
    
    public void setImplementacionEventos(Set<ImplementacionEvento> implementacionEventos) {
        this.implementacionEventos = implementacionEventos;
    }




}


