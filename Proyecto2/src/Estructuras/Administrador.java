/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Blanco
 */
public class Administrador {

    private Simulacion simulacion;
    private int ciclosRevision;

    public Administrador(Simulacion simulacion) {
        this.simulacion = simulacion;
        this.ciclosRevision = 0;
    }

    public void encolarPersonajes(Personaje personaje1, Personaje personaje2) {

        //Ubicar personaje del estudio1
        if (personaje1.getPrioridad() == 1) {
            this.simulacion.getEstudio1().getQueue1().Enqueue(personaje1);
        } else if (personaje1.getPrioridad() == 2) {
            this.simulacion.getEstudio1().getQueue2().Enqueue(personaje1);
        } else if (personaje1.getPrioridad() == 3) {
            this.simulacion.getEstudio1().getQueue3().Enqueue(personaje1);
        } else {
            this.simulacion.getEstudio1().getQueueRefuerzo().Enqueue(personaje1);
        }

        //Ubicar Personaje del estudio2
        if (personaje2.getPrioridad() == 1) {
            this.simulacion.getEstudio2().getQueue1().Enqueue(personaje2);
        } else if (personaje2.getPrioridad() == 2) {
            this.simulacion.getEstudio2().getQueue2().Enqueue(personaje2);
        } else if (personaje2.getPrioridad() == 3) {
            this.simulacion.getEstudio2().getQueue3().Enqueue(personaje2);
        } else {
            this.simulacion.getEstudio2().getQueueRefuerzo().Enqueue(personaje2);
        }
    }

    public Personaje[] EscogerPersonajes() {

        Personaje[] escogidos = new Personaje[2];

        if (!simulacion.getEstudio1().getQueue1().isEmpty()) {
            escogidos[0] = (Personaje) simulacion.getEstudio1().getQueue1().Dequeue().getData();
        } else {

            if (!simulacion.getEstudio1().getQueue2().isEmpty()) {
                escogidos[0] = (Personaje) simulacion.getEstudio1().getQueue2().Dequeue().getData();
            } else {

                if (!simulacion.getEstudio1().getQueue3().isEmpty()) {
                    escogidos[0] = (Personaje) simulacion.getEstudio1().getQueue3().Dequeue().getData();
                } else {
                    if (!simulacion.getEstudio1().getQueueRefuerzo().isEmpty()) {
                        escogidos[0] = (Personaje) simulacion.getEstudio1().getQueueRefuerzo().Dequeue().getData();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay personajes para AVATAR");
                    }
                }
            }
        }
        
        if (!simulacion.getEstudio2().getQueue1().isEmpty()) {
            escogidos[1] = (Personaje) simulacion.getEstudio2().getQueue1().Dequeue().getData();
        } else {

            if (!simulacion.getEstudio2().getQueue2().isEmpty()) {
                escogidos[1] = (Personaje) simulacion.getEstudio1().getQueue2().Dequeue().getData();
            } else {

                if (!simulacion.getEstudio2().getQueue3().isEmpty()) {
                    escogidos[1] = (Personaje) simulacion.getEstudio2().getQueue3().Dequeue().getData();
                } else {
                    if (!simulacion.getEstudio2().getQueueRefuerzo().isEmpty()) {
                        escogidos[1] = (Personaje) simulacion.getEstudio2().getQueueRefuerzo().Dequeue().getData();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay personajes para UN SHOW MÁS");
                    }
                }
            }
        } 
        
        revisarCiclo();
        return escogidos;
    }
    
    public void revisarCiclo(){
        this.ciclosRevision++;
        if(ciclosRevision==2){
            Random random = new Random();
            int probabilidad = random.nextInt(101);
            if(probabilidad >= 80){
                Personaje personaje1 = simulacion.getEstudio1().GeneradorPersonajes();
                Personaje personaje2 = simulacion.getEstudio2().GeneradorPersonajes();
                this.encolarPersonajes(personaje1, personaje2);
            }  
            
            this.ciclosRevision = 0;
        }
    }
    
}
