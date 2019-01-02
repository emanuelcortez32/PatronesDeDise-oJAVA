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
public class AntivirusSimple extends AnalisisSimple{

    @Override
    void iniciar() {
        System.out.println("Antivirus Simple - Análisis simple iniciado");
    }

    @Override
    void saltarZip() {
        try{
            System.out.println("Analizando...");
            Thread.sleep(2500);
            System.out.println("No se pudo analizar archivos con extension '.zip'");
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    void detener() {
        System.out.println("Antivirus Simple - Analisis simple finalizado");
    }
    
}
