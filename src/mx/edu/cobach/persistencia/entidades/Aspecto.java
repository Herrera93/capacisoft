package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Aspecto generated by hbm2java
 */
public class Aspecto  implements java.io.Serializable {


     private Integer id;
     private Competencia competencia;
     private String aspecto;
     private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);

    public Aspecto() {
    }

	
    public Aspecto(Competencia competencia, String aspecto) {
        this.competencia = competencia;
        this.aspecto = aspecto;
    }
    public Aspecto(Competencia competencia, String aspecto, Set<Respuesta> respuestas) {
       this.competencia = competencia;
       this.aspecto = aspecto;
       this.respuestas = respuestas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Competencia getCompetencia() {
        return this.competencia;
    }
    
    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    public String getAspecto() {
        return this.aspecto;
    }
    
    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    @Override
    public String toString(){
        return aspecto;
    }
}

