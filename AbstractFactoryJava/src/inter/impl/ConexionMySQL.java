/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter.impl;

import inter.IConexionBD;

/**
 *
 * @author emanuel
 */
public class ConexionMySQL implements IConexionBD{
    private String host;
    private String puerto;
    private String user;
    private String pass;
    
    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "3306";
        this.user = "root";
        this.pass = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede ir codigo JDBC
        System.out.println("Conectado a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de MySQL");
    }

    @Override
    public String toString() {
        return "ConexionMySQL{" + "host=" + host + ", puerto=" + puerto + ", user=" + user + ", pass=" + pass + '}';
    }
    
}
