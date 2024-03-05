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
        
        if(numprobabilidad <=0 && numprobabilidad<=39){ //Existir Ganador
           //FALTA POR DECIDIR
        }else if(numprobabilidad >=40 && numprobabilidad<= 66){ //Empate
            System.out.println("Ocurrio un empate, los personajes vuelven a la cola 1");
            this.simulacion.getEstudio1().getQueue1().Enqueue(personaje1);
            this.simulacion.getEstudio2().getQueue1().Enqueue(personaje2);
        }else if(numprobabilidad>=67 && numprobabilidad<=100){ //No llevarse acabo
            System.out.println("La batalla no puede llevarse acabo, se enviarán a la cola de refuerzo");
            this.simulacion.getEstudio1().getQueueRefuerzo().Enqueue(personaje1);
            this.simulacion.getEstudio2().getQueueRefuerzo().Enqueue(personaje2);
        }
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
