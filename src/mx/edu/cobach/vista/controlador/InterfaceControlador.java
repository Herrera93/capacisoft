/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

/**
 *
 * @author Alex
 */
public interface InterfaceControlador<T> {
    void alta(T t);
    void baja(T t);
    void modificacion(T t);
    void buscar(int id, Class<T> cl);
    void buscarTodos(Class<T> cl);
}
