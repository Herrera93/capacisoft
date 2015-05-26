package mx.edu.cobach.persistencia.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 * Entidad Competencia perteneciente a la tabla del mismo nombre. Este clase 
 * es utilizada para la representacion de la tabla como clase, con los mismos
 * atributos y relaciones.
 */
public class Competencia  implements java.io.Serializable {

    //Identificador de Competencia
     private Integer id;
     //Nombre de la competencia
     private String nombre;
     //Conjunto de aspectos de la competencia
     private Set<Aspecto> aspectos = new HashSet<Aspecto>(0);

     /**
      * Constructor vacio
      */
    public Competencia() {
    }

    /**
     * Contructor donde se asignan los atributos
     * @param nombre Nombre de la competencia
     */
    public Competencia(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Constructor donde se asginan los atributos y las relaciones de la entidad
     * @param nombre Nombre de la competencia
     * @param aspectos Conjunto de aspectos
     */
    public Competencia(String nombre, Set<Aspecto> aspectos) {
       this.nombre = nombre;
       this.aspectos = aspectos;
    }
   
    /**
     * Obtencion del identificador de Competencia
     * @return El identificador
     */
    public Integer getId() {
        return this.id;
    }
    
    /**
     * Asignacion del identificador de Competencia
     * @param id Identificador de Competencia
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Obtencion del nombre de la competencia
     * @return El nombre de la competencia
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Asignacion del nombre de la competencia
     * @param nombre Nombre de la competencia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtencion del conjunto de aspectos
     * @return Conjunto de aspectos
     */
    public Set<Aspecto> getAspectos() {
        return this.aspectos;
    }
    
    /**
     * Asignacion del conjunto aspectos de la competencia
     * @param aspectos Conjunto aspectos de la competencia
     */
    public void setAspectos(Set<Aspecto> aspectos) {
        this.aspectos = aspectos;
    }

    /**
     * Se muestra el elemento en String, mostrando su nombre.
     * @return Regresa el nombre del aspecto
     */
    @Override
    public String toString(){
        return nombre;
    }
}


