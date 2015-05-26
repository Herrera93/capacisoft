package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Evento generated by hbm2java
 */
public class Evento implements java.io.Serializable {
    //Identidicacion de la entidad
    private Integer id;
    //tipo del evento
    private TipoEvento tipoEvento;
    //Nombre del evento
    private String nombre;
    //Descripcion del evento
    private String descripcion;
    //eventos implementados que se utilizo el catalogo evento
    private Set<ImplementacionEvento> implementacionEventos =
            new HashSet<ImplementacionEvento>(0);
    /**
     * Contructor de la clase evento
     */
    public Evento() {
    }
    /**
     * * Contructor de la clase evento que obtiene la siguiente informacion 
     * al ser instanciado
     * @param tipoEvento
     * @param nombre
     * @param descripcion 
     */
    public Evento(TipoEvento tipoEvento, String nombre, String descripcion) {
        this.tipoEvento = tipoEvento;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    /**
     * * Contructor de la clase evento que obtiene la siguiente informacion 
     * al ser instanciado
     * @param tipoEvento
     * @param nombre
     * @param descripcion
     * @param implementacionEventos 
     */
    public Evento(TipoEvento tipoEvento, String nombre, String descripcion, Set<ImplementacionEvento> implementacionEventos) {
        this.tipoEvento = tipoEvento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.implementacionEventos = implementacionEventos;
    }
    /**
     * Manda la id del evento
     * @return manda la id
     */
    public Integer getId() {
        return this.id;
    }
    /**
     * Obtiene la id del evento
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Manda el tipoEvento del evento
     * @return manda el tipoEvento
     */
    public TipoEvento getTipoEvento() {
        return this.tipoEvento;
    }
    /**
     * Obtiene el tipoEvento del evento
     * @param tipoEvento 
     */
    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    /**
     * Manda el nombre del evento
     * @return 
     */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * Obtiene el nombre del evento
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * manda la descripcion del evento
     * @return manda descripcion
     */
    public String getDescripcion() {
        return this.descripcion;
    }
    /**
     * Obtiene la descripcion del evento
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Manda un HashSet de la implementaciondeEventos de los eventos
     * @return manda HashSet de implementacionEventos
     */
    public Set<ImplementacionEvento> getImplementacionEventos() {
        return this.implementacionEventos;
    }
    /**
     * Obtiene un HashSet de la implementacionEventos de los eventos
     * @param implementacionEventos 
     */
    public void setImplementacionEventos(Set<ImplementacionEvento> implementacionEventos) {
        this.implementacionEventos = implementacionEventos;
    }
    /**
     * Manda la descripcion del Evento como representacion de la clase
     * @return manda nombre del evento
     */
    @Override
    public String toString() {
        return nombre;
    }
}
