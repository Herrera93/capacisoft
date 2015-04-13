package mx.edu.cobach.persistencia.entidades;
// Generated Apr 13, 2015 12:14:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoCurso generated by hbm2java
 */
public class TipoCurso  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set<Curso> cursos = new HashSet<Curso>(0);

    public TipoCurso() {
    }

	
    public TipoCurso(String descripcion) {
        this.descripcion = descripcion;
    }
    public TipoCurso(String descripcion, Set<Curso> cursos) {
       this.descripcion = descripcion;
       this.cursos = cursos;
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
    public Set<Curso> getCursos() {
        return this.cursos;
    }
    
    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }




}


