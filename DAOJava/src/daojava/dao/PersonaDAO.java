/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daojava.dao;

import daojava.model.Persona;
import java.util.List;

/**
 *
 * @author emanuel
 */
public interface PersonaDAO {
    List<Persona> listarTodos();
    Persona leerPorId(int id);
    void registrar(Persona persona);
    void actualizar(Persona persona);
    void eliminar(int id);
}
