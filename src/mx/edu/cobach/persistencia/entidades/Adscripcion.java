package mx.edu.cobach.persistencia.entidades;
// Generated May 11, 2015 4:12:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Adscripcion generated by hbm2java
 */
public class Adscripcion  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set<Empleado> empleados = new HashSet<Empleado>(0);

    public Adscripcion() {
    }

	
    public Adscripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Adscripcion(String descripcion, Set<Empleado> empleados) {
       this.descripcion = descripcion;
       this.empleados = empleados;
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
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
    
     @Override
    public String toString(){
        return this.descripcion;
    }
}


