package mx.edu.cobach.persistencia.entidades;

/**
 * Clase entidad que que sirve para almacenar la informacion de la tabla 
 * ImplementacionEventoEnunciadoLogistica
 */
public class ImplementacionEventoEnunciadoLogistica implements java.io.Serializable {
    //El Identificado de la identidad
    private Integer id;
    //Pregunta de logistica de EnunciadoLogistica
    private EnunciadoLogistica enunciadoLogistica;
    //Evento donde se relacion la calificacion
    private ImplementacionEvento implementacionEvento;
    //Calificacion del enunciadoLogistica
    private int calificacion;

    /**
     * Contructor de la clase ImplementacionEvento
     */
    public ImplementacionEventoEnunciadoLogistica() {
    }
    /**
     * Contructor de la clase ImplementacionEvento que obtiene la siguiente
     * informacion
     * @param enunciadoLogistica
     * @param implementacionEvento
     * @param calificacion 
     */
    public ImplementacionEventoEnunciadoLogistica(EnunciadoLogistica enunciadoLogistica, ImplementacionEvento implementacionEvento, int calificacion) {
        this.enunciadoLogistica = enunciadoLogistica;
        this.implementacionEvento = implementacionEvento;
        this.calificacion = calificacion;
    }
    /**
     * Manda id del ImplementacionEventoEnunciadoLogistica
     * @return manda id de ImplementacionEventoEnunciadoLogistica
     */
    public Integer getId() {
        return this.id;
    }
    /**
     * Obtiene id de ImplementacionEventoEnunciadoLogistica
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Manda EnunciadoLogistica del ImplementacionEventoEnunciadoLogistica
     * @return manda EnunciadoLogistica de
     * ImplementacionEventoEnunciadoLogistica
     */
    public EnunciadoLogistica getEnunciadoLogistica() {
        return this.enunciadoLogistica;
    }
    /**
     * Obtiene EnunciadoLogistica de ImplementacionEventoEnunciadoLogistica
     * @param enunciadoLogistica 
     */
    public void setEnunciadoLogistica(EnunciadoLogistica enunciadoLogistica) {
        this.enunciadoLogistica = enunciadoLogistica;
    }
    /**
     * Manda ImplementacionEvento del ImplementacionEventoEnunciadoLogistica
     * @return manda ImplementacionEvento de
     * ImplementacionEventoEnunciadoLogistica
     */
    public ImplementacionEvento getImplementacionEvento() {
        return this.implementacionEvento;
    }
    /**
     * Obtiene ImplementacionEvento de ImplementacionEventoEnunciadoLogistica
     * @param implementacionEvento 
     */
    public void setImplementacionEvento(ImplementacionEvento implementacionEvento) {
        this.implementacionEvento = implementacionEvento;
    }
    /**
     * Manda calificacion del ImplementacionEventoEnunciadoLogistica
     * @return manda id de ImplementacionEventoEnunciadoLogistica
     */
    public int getCalificacion() {
        return this.calificacion;
    }
    /**
     * Obtiene caligicacion de ImplementacionEventoEnunciadoLogistica
     * @param calificacion 
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
