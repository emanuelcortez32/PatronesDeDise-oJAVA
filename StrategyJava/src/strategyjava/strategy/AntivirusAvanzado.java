/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyjava.strategy;

/**
 *
 * @author emanuel
 */
public class AntivirusAvanzado extends AnalisisAvanzado{

    @Override
    void iniciar() {
        System.out.println("Antivirus Avanzado - Analisis avanzado iniciado");
    }

    @Override
    void analizarMemoria() {
        try{
            System.out.println("Analizar Memoria RAM...");
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    void analizarKeyloggers() {
        try{
            System.out.println("Analizando en busca de KeyLoggers...");
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    void analizarRootKits() {
        try{
            System.out.println("Analizando RootKits...");
            Thread.sleep(1500);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    void descomprimirZip() {
        try{
            System.out.println("Descomprimiendo zip");
            Thread.sleep(2500);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    void detener() {
        System.out.println("Antivirus Avanzado - Analisis avanzado finalizado");
    }
    
}
