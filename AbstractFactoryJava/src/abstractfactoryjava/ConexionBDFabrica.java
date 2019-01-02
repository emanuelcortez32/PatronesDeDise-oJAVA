/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryjava;

import inter.FabricaAbstracta;
import inter.IConexionBD;
import inter.IConexionREST;
import inter.impl.ConexionMySQL;
import inter.impl.ConexionOracle;
import inter.impl.ConexionPostgreSQL;
import inter.impl.ConexionSQLServer;
import inter.impl.ConexionVacia;

/**
 *
 * @author emanuel
 */
public class ConexionBDFabrica implements FabricaAbstracta{

    @Override
    public IConexionBD getBD(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();
        }

        return new ConexionVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
