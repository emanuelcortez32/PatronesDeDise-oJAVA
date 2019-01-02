/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjectionjava.dao;

import java.util.List;

/**
 *
 * @author emanuel
 */
public interface CRUD<T> {
    List<T> listarTodos();
    T leerPorId(int id);
    void registrar(T t);
    void actualizar(T t);
    void eliminar(int id);
}
