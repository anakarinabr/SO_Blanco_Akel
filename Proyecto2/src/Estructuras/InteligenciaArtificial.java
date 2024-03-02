/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author Ana Blanco
 */
public class InteligenciaArtificial extends Thread{
    private int contadorParejas;
    private int dayDuration;
    private int contadorTorneos;

    public InteligenciaArtificial(int dayDuration) {
        this.dayDuration = dayDuration;
    }
    
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
