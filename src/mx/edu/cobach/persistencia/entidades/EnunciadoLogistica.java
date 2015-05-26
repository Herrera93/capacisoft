package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Clase entidad que que sirve para almacenar la informacion de la tabla 
 * EnunciadoLogistica
 */
public class EnunciadoLogistica implements java.io.Serializable {
    //Identificacion de la entidad
    private Integer id;
    //Tipo de enunciado del enunciadoEvento
    private TipoEnunciado tipoEnunciado;
    //La descripcion del evento
    private String descripcion;
    //se manda la calificacion de eventoImplementado
    private Set<ImplementacionEventoEnunciadoLogistica> 
            implementacionEventoEnunciadoLogisticas = 
            new HashSet<ImplementacionEventoEnunciadoLogistica>(0);

    /**
     * Contructor de la clase EnunciadoLogistica
     */
    public EnunciadoLogistica() {
    }

    /**
     * Contructor de la clase EnunciadoLogistica que obtiene la siguiente
     * informacion
     *
     * @param tipoEnunciado
     * @param descripcion
     */
    public EnunciadoLogistica(TipoEnunciado tipoEnunciado, String descripcion) {
        this.tipoEnunciado = tipoEnunciado;
        this.descripcion = descripcion;
    }

    /**
     * Contructor de la clase EnunciadoLogistica que obtiene la siguiente
     * informacion
     *
     * @param tipoEnunciado
     * @param descripcion
     * @param implementacionEventoEnunciadoLogisticas
     */
    public EnunciadoLogistica(TipoEnunciado tipoEnunciado, String descripcion, Set<ImplementacionEventoEnunciadoLogistica> implementacionEventoEnunciadoLogisticas) {
        this.tipoEnunciado = tipoEnunciado;
        this.descripcion = descripcion;
        this.implementacionEventoEnunciadoLogisticas = implementacionEventoEnunciadoLogisticas;
    }

    /**
     * Manda id de enunciadoLogistica
     *
     * @return manda id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Obtiene id de enunciadoLogistica
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Manda TipoEnunciado de enunciadoLogistica
     * @return
     */
    public TipoEnunciado getTipoEnunciado() {
        return this.tipoEnunciado;
    }
    /**
     * Obtiene el TipoEnunciado de enunciadoLogistica
     * @param tipoEnunciado 
     */
    public void setTipoEnunciado(TipoEnunciado tipoEnunciado) {
        this.tipoEnunciado = tipoEnunciado;
    }
    /**
     * Manda la descripcion de enunciadoLogistica
     * @return manda descripcion
     */
    public String getDescripcion() {
        return this.descripcion;
    }
    /**
     * Obtiene la descripcion de enunciadoLogistica
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Manda HashSet de la calificacion de la implementacionEventoEnunciadoLogistica
     * @return manda HashSet de implementacionEventoEnunciadoLogistica
     */
    public Set<ImplementacionEventoEnunciadoLogistica> getImplementacionEventoEnunciadoLogisticas() {
        return this.implementacionEventoEnunciadoLogisticas;
    }
    /**
     * Obtiene HashSet de la calificacion de la implementacionEnunciadoLogistica 
     * @param implementacionEventoEnunciadoLogisticas 
     */
    public void setImplementacionEventoEnunciadoLogisticas(Set<ImplementacionEventoEnunciadoLogistica> implementacionEventoEnunciadoLogisticas) {
        this.implementacionEventoEnunciadoLogisticas = implementacionEventoEnunciadoLogisticas;
    }
    /**
     * Manda la descripcion del EnunciadoLogistica como representacion de la
     * clase
     * @return manda id de implementacionLogistica
     */
    public String toString() {
        return this.id + "";
    }
}
