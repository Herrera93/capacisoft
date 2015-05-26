package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado implements java.io.Serializable {
    //identificado de la entidad
    private Integer id;
    //adscripcion del empleado
    private Adscripcion adscripcion;
    //departamento del empleado
    private Departamento departamento;
    //plantel del empleado
    private Plantel plantel;
    //puesto del empleado
    private Puesto puesto;
    //numero del empleado de la empresa
    private String numero;
    //primero nombre del empleado
    private String primerNombre;
    //segundo nombre del empleado
    private String segundoNombre;
    //apellido paterno del empleado
    private String apellidoPaterno;
    //apellido materno del empleado
    private String apellidoMaterno;
    //correo del empleado
    private String correo;
    //respuestas de validacion del empleado
    private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);
    //implementacionEventos asociadas al empleado
    private Set<ImplementacionEvento> implementacionEventos = new HashSet<ImplementacionEvento>(0);
    
    /**
     * Contructor de la clase empleado
     */
    public Empleado() {
    }

    /**
     * Contructor de la clase empleado que obtiene la siguiente informacion 
     * al ser instanciado
     *
     * @param adscripcion
     * @param departamento
     * @param plantel
     * @param puesto
     * @param numero
     * @param primerNombre
     * @param segundoNombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param correo
     */
    public Empleado(Adscripcion adscripcion, Departamento departamento, Plantel plantel, Puesto puesto, String numero, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String correo) {
        this.adscripcion = adscripcion;
        this.departamento = departamento;
        this.plantel = plantel;
        this.puesto = puesto;
        this.numero = numero;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
    }

    /**
     * Contructor de la clase empleado que obtiene la siguiente informacion al
     * ser instacionado
     *
     * @param adscripcion
     * @param departamento
     * @param plantel
     * @param puesto
     * @param numero
     * @param primerNombre
     * @param segundoNombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param correo
     * @param respuestas
     * @param implementacionEventos
     */
    public Empleado(Adscripcion adscripcion, Departamento departamento, Plantel plantel, Puesto puesto, String numero, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String correo, Set<Respuesta> respuestas, Set<ImplementacionEvento> implementacionEventos) {
        this.adscripcion = adscripcion;
        this.departamento = departamento;
        this.plantel = plantel;
        this.puesto = puesto;
        this.numero = numero;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.respuestas = respuestas;
        this.implementacionEventos = implementacionEventos;
    }

    /**
     * Manda la id del empleado
     *
     * @return manda id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Obtiene la id del empleado
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Manda la adscripcion del empleado
     *
     * @return manda la adscripcion
     */
    public Adscripcion getAdscripcion() {
        return this.adscripcion;
    }

    /**
     * Obtiene la adscripcion del empleado
     *
     * @param adscripcion
     */
    public void setAdscripcion(Adscripcion adscripcion) {
        this.adscripcion = adscripcion;
    }

    /**
     * Manda el departamento del empleado
     *
     * @return manda el departamento
     */
    public Departamento getDepartamento() {
        return this.departamento;
    }

    /**
     * Obtiene el departamento del empleado
     *
     * @param departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Manda el plantel del empleado
     *
     * @return manda el plantel
     */
    public Plantel getPlantel() {
        return this.plantel;
    }

    /**
     * Obtiene el plantel del empleado
     *
     * @param plantel
     */
    public void setPlantel(Plantel plantel) {
        this.plantel = plantel;
    }

    /**
     * Manda el puesto del empleado
     *
     * @return manda el puesto
     */
    public Puesto getPuesto() {
        return this.puesto;
    }

    /**
     * Manda el puesto del empleado
     *
     * @param puesto
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    /**
     * Manda el numero del empleado
     *
     * @return manda puesto
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * Obtiene el numero del empleado
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Manda el primernombre del empleado
     *
     * @return manda el primernombre
     */
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    /**
     * Obtiene el primernombre del empleado
     *
     * @param primerNombre
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * Manda el segundo nombre del empleado
     *
     * @return manda el segundo nombre
     */
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    /**
     * Obtiene el segundonombre del empleado
     *
     * @param segundoNombre
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * Manda el apellido paterno del empleado
     *
     * @return manda apellido paterno
     */
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    /**
     * Obtiene el apellido paterno del empleado
     *
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Manda el apellido Materno del empleado
     *
     * @return manda apellido materno
     */
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    /**
     * Obtiene el apellido Materno
     *
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Manda el correo del empleado
     *
     * @return manda correo
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * Obtiene el correo del empleado
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Manda las respuestas de califiacion del empleado
     *
     * @return manda resupuestas de
     */
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }

    /**
     * Obtiene las respuestas de calificaicon del empleado
     *
     * @param respuestas
     */
    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * Manda un HashSet de la lista de asistencia de implementacionEventos
     *
     * @return manda HashSet de la lista de asistencia
     */
    public Set<ImplementacionEvento> getImplementacionEventos() {
        return this.implementacionEventos;
    }

    /**
     * Obtiene un HashSet de la lista de asistencia de implementacionEventos
     *
     * @param implementacionEventos
     */
    public void setImplementacionEventos(Set<ImplementacionEvento> implementacionEventos) {
        this.implementacionEventos = implementacionEventos;
    }

     @Override
    public String toString(){
        if(segundoNombre != null)
            return primerNombre + " " + segundoNombre + " " + 
                    apellidoPaterno + " " + apellidoMaterno;
        else
            return primerNombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
