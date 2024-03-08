/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.util.Random;

/**
 *
 * @author Ana Blanco
 */
public class InteligenciaArtificial{
    private int contadorParejas;
    private int dayDuration;
    private int contadorTorneos;
    private String estado;
    private Simulacion simulacion;

    public InteligenciaArtificial(int dayDuration, Simulacion simulacion) {
        this.dayDuration = dayDuration;
        this.estado= "Trabajando";
        this.simulacion = simulacion;
    }
    
    public void batalla(Personaje personaje1, Personaje personaje2){
        Random random = new Random();
        int numprobabilidad = random.nextInt(101);
        System.out.println("-----------------------------------");
        System.out.println(numprobabilidad);
        
        int puntajePersonaje1 = calcularPuntaje(personaje1);
        int puntajePersonaje2 = calcularPuntaje(personaje2);
        
        if(numprobabilidad >=0 && numprobabilidad<=40){ //Existir Ganador
            if (puntajePersonaje1 >= puntajePersonaje2){
                System.out.println("Puntaje AVT: " + puntajePersonaje1);
                System.out.println("Puntaje USM: " + puntajePersonaje2);
                System.out.println("El ganador es: " + personaje1.getId());
                personaje1.setWinner(true);
                personaje2.setWinner(false);
               // personaje1.isWinner();
                this.simulacion.getEstudio1().getQueueGanadores().Enqueue(personaje1);
            }else{  // Personaje1 < Personaje2) 
                System.out.println("Puntaje AVT: " + puntajePersonaje1);
                System.out.println("Puntaje USM: " + puntajePersonaje2);
                System.out.println("El ganador es: " + personaje2.getId());
                personaje1.setWinner(false);
                personaje2.setWinner(true);
                this.simulacion.getEstudio2().getQueueGanadores().Enqueue(personaje2);
//                this.simulacion.getEstudio2().getQueueGanadores().EliminarPersonaje(personaje1);
            }
            
        }else if(numprobabilidad >40 && numprobabilidad<= 67){ //Empate
            System.out.println("Ocurrio un empate, los personajes vuelven a la cola 1");
            this.simulacion.getEstudio1().getQueue1().Enqueue(personaje1);
            this.simulacion.getEstudio2().getQueue1().Enqueue(personaje2);
            
        }else if(numprobabilidad>67 && numprobabilidad<=100){ //No llevarse acabo
            System.out.println("La batalla no puede llevarse acabo, se enviaran a la cola de refuerzo");
            this.simulacion.getEstudio1().getQueueRefuerzo().Enqueue(personaje1);
            this.simulacion.getEstudio2().getQueueRefuerzo().Enqueue(personaje2);
        }
    }
    
    public int calcularPuntaje(Personaje personaje){
        int habilidad = personaje.getCaracteristicas()[0];
        int vida = personaje.getCaracteristicas()[1];
        int fuerza = personaje.getCaracteristicas()[2];
        int agilidad = personaje.getCaracteristicas()[3];
        
        return habilidad + vida + fuerza + agilidad;
    }
    
    //GETTERS AND SETTERS
    public int getContadorParejas() {
        return contadorParejas;
    }

    public void setContadorParejas(int contadorParejas) {
        this.contadorParejas = contadorParejas;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getContadorTorneos() {
        return contadorTorneos;
    }

    public void setContadorTorneos(int contadorTorneos) {
        this.contadorTorneos = contadorTorneos;
    }

    
}
