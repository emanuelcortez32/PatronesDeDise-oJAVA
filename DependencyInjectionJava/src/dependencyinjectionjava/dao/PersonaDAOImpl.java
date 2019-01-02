/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjectionjava.dao;

import dependencyinjectionjava.model.Persona;
import java.util.List;

/**
 *
 * @author emanuel
 */
public class PersonaDAOImpl implements PersonaDAO{
    
    private IConexion conexion;
    
    @Override
    public void mostrarNombre() {
        //logica
    }

    @Override
    public void setConexion(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Persona> listarTodos() {
        this.conexion.conectar();
        System.out.println("Listando...");
        return null;
    }

    @Override
    public Persona leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(Persona t) {
        System.out.println("Persona " + t.getNombre() + " registrada");
    }

    @Override
    public void actualizar(Persona t) {
        System.out.println("Persona " + t.getNombre() + " actualizada");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("ID " + id + " eliminado");
    }
    
}
