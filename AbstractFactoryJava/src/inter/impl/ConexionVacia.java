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
public class ConexionVacia implements IConexionBD {

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

}
