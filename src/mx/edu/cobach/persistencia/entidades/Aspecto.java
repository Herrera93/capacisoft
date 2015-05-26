package mx.edu.cobach.persistencia.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 * Entidad Aspecto perteneciente a la tabla del mismo nombre. Este clase 
 * es utilizada para la representacion de la tabla como clase, con los mismos
 * atributos y relaciones.
 */
public class Aspecto  implements java.io.Serializable {

    //Identificador de Aspectoo
     private Integer id;
     //Competencia de aspecto
     private Competencia competencia;
     //Nombre de aspecto
     private String aspecto;
     //Respuestas de este aspecto
     private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);

     /**
      * Constructor vacio
      */
    public Aspecto() {
    }
    
    /**
     * Constructor de los atributos
     * @param competencia Competencia del aspecto
     * @param aspecto Nombre del aspecto
     */
    public Aspecto(Competencia competencia, String aspecto) {
        this.competencia = competencia;
        this.aspecto = aspecto;
    }
    
    /**
     * Constructor de los atributos y conjuntos
     * @param competencia Competencia del aspecto
     * @param aspecto Nombre del aspecto
     * @param respuestas Respuestas de este aspecto
     */
    public Aspecto(Competencia competencia, String aspecto, Set<Respuesta> respuestas) {
       this.competencia = competencia;
       this.aspecto = aspecto;
       this.respuestas = respuestas;
    }
   
    /**
     * Obtencion del identificador de Aspecto
     * @return El identificador
     */
    public Integer getId() {
        return this.id;
    }
    
    /**
     * Asignacion del identificador de la Aspecto
     * @param id El identificador
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Obtencion de la competencia
     * @return Competencia de aspecto
     */
    public Competencia getCompetencia() {
        return this.competencia;
    }
    
    /**
     * Asignacion de la competencia
     * @param competencia Competencia de aspecto
     */
    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    
    /**
     * Obtencion del nombre del aspecto
     * @return Nombre de aspecto
     */
    public String getAspecto() {
        return this.aspecto;
    }
    
    /**
     * Asignacion del nombre del aspecto
     * @param aspecto Nombre del aspecto
     */
    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }
    
    /**
     * Obtencion de las respuestas del aspecto
     * @return Las respuestas del aspecto
     */
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }
    
    /**
     * Asignacion de las respuestas del aspecto
     * @param respuestas Las respuestas del aspecto
     */
    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    /**
     * Se muestra el elemento en String, mostrando su nombre.
     * @return Regresa el nombre del aspecto
     */
    @Override
    public String toString(){
        return aspecto;
    }
}


