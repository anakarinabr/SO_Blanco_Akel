/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Estructuras.Estudio;
import Estructuras.Simulacion;
import Interfaz.Simulación;

/**
 *
 * @author Ana Blanco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static Simulacion simulacion = new Simulacion("AVT", "USM",10);
    public static Simulación interfaz = new Simulación();
    
    public static void main(String[] args) {
       simulacion.start();
       interfaz.setVisible(true);
    }
    
}
