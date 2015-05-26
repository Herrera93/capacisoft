package mx.edu.cobach.persistencia.entidades;

/**
 * Entidad Respuesta perteneciente a la tabla del mismo nombre. Este clase 
 * es utilizada para la representacion de la tabla como clase, con los mismos
 * atributos y relaciones.
 */
public class Respuesta  implements java.io.Serializable {

    //Identificador de Respuesta
     private Integer id;
     //Aspecto que se responde
     private Aspecto aspecto;
     //Empleado que contesta
     private Empleado empleado;
     //Encuesta a la que pertenece
     private Encuesta encuesta;
     //Respuesta antes del evento
     private int antesEvento;
     //Respuesta despues del evennto
     private int despuesEvento;

     /**
      * Constructor vacio
      */
    public Respuesta() {
    }

    /**
     * Contructor donde se asignan todos los atributos y relaciones de la entidad
     * @param aspecto Aspecto que se responde
     * @param empleado Empleado que contesta
     * @param encuesta Encuesta a la que pertenece
     * @param antesEvento Respuesta antes del evento
     * @param despuesEvento Respuesta despues del evento
     */
    public Respuesta(Aspecto aspecto, Empleado empleado, Encuesta encuesta, int antesEvento, int despuesEvento) {
       this.aspecto = aspecto;
       this.empleado = empleado;
       this.encuesta = encuesta;
       this.antesEvento = antesEvento;
       this.despuesEvento = despuesEvento;
    }
   
    /**
     * Obtencion del identificador de Respuesta
     * @return El identificador
     */
    public Integer getId() {
        return this.id;
    }
    
    /**
     * Asignacion del identificador de la Respuesta
     * @param id El identificador
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Obtencion del aspecto de Respuesta
     * @return El aspecto
     */
    public Aspecto getAspecto() {
        return this.aspecto;
    }
    
    /**
     * Asignacion del aspecto de la Respuesta
     * @param aspecto El aspecto
     */
    public void setAspecto(Aspecto aspecto) {
        this.aspecto = aspecto;
    }
    
    /**
     * Obtencion del empleado de Respuesta
     * @return El empleado
     */
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    /**
     * Asignacion del empleado de la Respuesta
     * @param empleado El empleado
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    /**
     * Obtencion del encuesta de Respuesta
     * @return El encuesta
     */
    public Encuesta getEncuesta() {
        return this.encuesta;
    }
    
    /**
     * Asignacion del encuesta de la Respuesta
     * @param encuesta La encuesta
     */
    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }
    
    /**
     * Obtencion de la respuesta antes del evento
     * @return La respuesta antes del evento
     */
    public int getAntesEvento() {
        return antesEvento;
    }

    /**
     * Asignacion de la respuesta antes del evento
     * @param antesEvento La respuesta antes del evento
     */
    public void setAntesEvento(int antesEvento) {
        this.antesEvento = antesEvento;
    }

    /**
     * Obtencion de la respuesta despues del evento
     * @return La respuesta despues del evento
     */
    public int getDespuesEvento() {
        return despuesEvento;
    }

    /**
     * Asignacion de la respuesta despues del evento
     * @param despuesEvento La respuesta despues del evento
     */
    public void setDespuesEvento(int despuesEvento) {
        this.despuesEvento = despuesEvento;
    }
    
    
}


