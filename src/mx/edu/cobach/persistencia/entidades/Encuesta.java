package mx.edu.cobach.persistencia.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 * Entidad Encuesta perteneciente a la tabla del mismo nombre. Este clase 
 * es utilizada para la representacion de la tabla como clase, con los mismos
 * atributos y relaciones.
 */
public class Encuesta  implements java.io.Serializable {
    
    //Idetificador de Encuesta
     private Integer id;
     //Identificador de JotForm de la encuesta antes del evento
     private Long jotformIdAntes;
     //Identificador de JotForm la encuesta despues del evento
     private Long jotformIdDespues;
     //Implementacion de evento relacionada con la Encuesta
     private ImplementacionCurso implementacionCurso;
     //Conjunto de respuestas de la encuesta
     private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);
     //Conjunto de aspectos de la encuesta
     private Set<Aspecto> aspectos = new HashSet<Aspecto>(0);

     /**
      * Constructor vacio
      */
    public Encuesta() {
    }
	
    /**
     * Contructor donde se asignan todos lo atributos y relaciones de la entidad
     * @param implementacionCurso Implementacion de curso
     * @param jotformIdAntes Identificador JotForm antes de evento
     * @param jotformIdDespues Identificador JotForm antes de evento
     */
    public Encuesta(ImplementacionCurso implementacionCurso, Long jotformIdAntes, Long jotformIdDespues) {
        this.implementacionCurso = implementacionCurso;
        this.jotformIdAntes = jotformIdAntes;
        this.jotformIdDespues = jotformIdDespues;
    }
    
    /**
     * Contructor donde se asignan todos lo atributos y relaciones de la entidad
     * @param implementacionCurso Implementacion de curso
     * @param jotformIdAntes Identificador JotForm antes de evento
     * @param jotformIdDespues Identificador JotForm antes de evento
     * @param respuestas Conjunto de respuestas
     * @param aspectos Conjunto de aspectos
     */
    public Encuesta(ImplementacionCurso implementacionCurso, Long jotformIdAntes, Long jotformIdDespues, Set<Respuesta> respuestas, Set<Aspecto> aspectos) {
       this.implementacionCurso = implementacionCurso;
        this.jotformIdAntes = jotformIdAntes;
        this.jotformIdDespues = jotformIdDespues;
       this.respuestas = respuestas;
       this.aspectos = aspectos;
    }
   
    /**
     * Obtencion del identificador de Encuesta
     * @return El identificador
     */
    public Integer getId() {
        return this.id;
    }
    
    /**
     * Asignacion del identificador de la Encuesta
     * @param id El identificador
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Obtencion de la implementacion del evento
     * @return La implementacion del evento
     */
    public ImplementacionCurso getImplementacionCurso() {
        return this.implementacionCurso;
    }
    
    /**
     * Asignacion de la implementacion de evento
     * @param implementacionCurso La implementacion de evento
     */
    public void setImplementacionCurso(ImplementacionCurso implementacionCurso) {
        this.implementacionCurso = implementacionCurso;
    }
    
    /**
     * Obtencion del conjunto de respuestas
     * @return Conjunto de respuestas
     */
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }
    
    /**
     * Asignacion del conjunto de respuestas
     * @param respuestas Conjunto de respuestas
     */
    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    /**
     * Obtencion del conjunto de aspectos
     * @return Conjunto de aspectos
     */
    public Set<Aspecto> getAspectos() {
        return this.aspectos;
    }
    
    /**
     * Asignacion del conjunto de aspectos
     * @param aspectos Conjunto de aspectos
     */
    public void setAspectos(Set<Aspecto> aspectos) {
        this.aspectos = aspectos;
    }

    /**
     * Obtencion del identificador de JotForm de la encuesta antes del evento
     * @return Identificador de JotForm antes del evento
     */
    public Long getJotformIdAntes() {
        return jotformIdAntes;
    }

    /**
     * Asignacion del identificador de JotForm de la encuesta antes del evento
     * @param jotformIdAntes Identificador de JotForm de la encuesta antes del evento
     */
    public void setJotformIdAntes(Long jotformIdAntes) {
        this.jotformIdAntes = jotformIdAntes;
    }

    /**
     * Obtencion del identificador de JotForm de la encuesta depues del evento
     * @return Identificador de JotForm despue del evento
     */
    public Long getJotformIdDespues() {
        return jotformIdDespues;
    }

     /**
     * Asignacion del identificador de JotForm de la encuesta despues del evento
     * @param jotformIdDespues Identificador de JotForm de la encuesta despues del evento
     */
    public void setJotformIdDespues(Long jotformIdDespues) {
        this.jotformIdDespues = jotformIdDespues;
    }
}


