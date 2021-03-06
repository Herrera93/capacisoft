package mx.edu.cobach.persistencia.entidades;
// Generated May 26, 2015 1:34:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoEvento generated by hbm2java
 */
public class TipoEvento  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set<Evento> eventos = new HashSet<Evento>(0);

    public TipoEvento() {
    }

	
    public TipoEvento(String descripcion) {
        this.descripcion = descripcion;
    }
    public TipoEvento(String descripcion, Set<Evento> eventos) {
       this.descripcion = descripcion;
       this.eventos = eventos;
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
    public Set<Evento> getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }

    public String toString(){
        return this.descripcion;
    }


}


