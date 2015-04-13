/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;

/**
 *
 * @author Alex
 */
public interface InterfaceFACADE<T> {
    void saveOrUpdate(T t);
    T find(int id);
    List<T> findAll();
    void delete(T t);
    void setEntity(Class<T> cl);
}
