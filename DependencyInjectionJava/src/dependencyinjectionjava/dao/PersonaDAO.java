/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjectionjava.dao;

import dependencyinjectionjava.model.Persona;

/**
 *
 * @author emanuel
 */
public interface PersonaDAO extends CRUD<Persona>{
    void mostrarNombre();
    void setConexion(IConexion conexion);
}
