/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

/***
 * Esta interfaz permite la comunicacion entre la interfaz grafica y el o los
 * controladores que se utilicen.
 * 
 * @author Alex
 */
public interface Comunicador {
    /**
     * Metodo para mostrar un mensaje al usuario, por ejemplo, un mensaje de
     * exito o de error.
     * 
     * @param mensaje Mensaje que se mostrara al usuario.
     */
    void setMensaje(String mensaje);
    
    /***
     * Metodo para mostrar la informacion obtenida en una tabla de la interfaz
     * grafica.
     * 
     * @param info Informacion que se asignara a la tabla
     */
    void setTabla(String[][] info);
}
