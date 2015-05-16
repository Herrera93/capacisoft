package mx.edu.cobach.persistencia.entidades;
// Generated May 16, 2015 9:04:02 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoCuenta generated by hbm2java
 */
public class TipoCuenta  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public TipoCuenta() {
    }

	
    public TipoCuenta(String descripcion) {
        this.descripcion = descripcion;
    }
    public TipoCuenta(String descripcion, Set<Usuario> usuarios) {
       this.descripcion = descripcion;
       this.usuarios = usuarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


