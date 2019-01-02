/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryjava;

import inter.FabricaAbstracta;
import inter.IConexionBD;
import inter.IConexionREST;

/**
 *
 * @author emanuel
 */
public class AbstractFactoryJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

        cxBD1.conectar();

        FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
    }

}
