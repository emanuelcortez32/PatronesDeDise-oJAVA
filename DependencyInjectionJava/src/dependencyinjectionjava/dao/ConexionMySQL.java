/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjectionjava.dao;

/**
 *
 * @author emanuel
 */
public class ConexionMySQL implements IConexion{
    private String usuario;
    private String clave;
    private String host;

    public ConexionMySQL(String usuario, String clave, String host) {
        this.usuario = usuario;
        this.clave = clave;
        this.host = host;
    }

    @Override
    public void conectar() {
        System.out.println("Conectado a MySQL");
    }
    
}
