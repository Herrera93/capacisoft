package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1



/**
 * Alerta generated by hbm2java
 */
public class Alerta  implements java.io.Serializable {


     private Integer id;
     private TipoAlerta tipoAlerta;
     private String descripcion;

    public Alerta() {
    }

    public Alerta(TipoAlerta tipoAlerta, String descripcion) {
       this.tipoAlerta = tipoAlerta;
       this.descripcion = descripcion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TipoAlerta getTipoAlerta() {
        return this.tipoAlerta;
    }
    
    public void setTipoAlerta(TipoAlerta tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


