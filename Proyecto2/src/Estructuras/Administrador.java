/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author Ana Blanco
 */
public class Administrador extends Thread {
    private Queue Cola1USM = new Queue(); 
    private Queue Cola2USM = new Queue(); 
    private Queue Cola3USM = new Queue(); 
    private Queue Cola1AVT = new Queue(); 
    private Queue Cola2AVT = new Queue(); 
    private Queue Cola3AVT = new Queue(); 
    private Queue ColaRefuerzoUSM = new Queue(); 
    private Queue ColaRefuerzoAVT = new Queue(); 
    private Queue ganadoresUSM = new Queue();
    private Queue ganadoresAVT = new Queue(); 

    public Queue getCola1USM() {
        return Cola1USM;
    }

    public void setCola1USM(Queue Cola1USM) {
        this.Cola1USM = Cola1USM;
    }

    public Queue getCola2USM() {
        return Cola2USM;
    }

    public void setCola2USM(Queue Cola2USM) {
        this.Cola2USM = Cola2USM;
    }

    public Queue getCola3USM() {
        return Cola3USM;
    }

    public void setCola3USM(Queue Cola3USM) {
        this.Cola3USM = Cola3USM;
    }

    public Queue getCola1AVT() {
        return Cola1AVT;
    }

    public void setCola1AVT(Queue Cola1AVT) {
        this.Cola1AVT = Cola1AVT;
    }

    public Queue getCola2AVT() {
        return Cola2AVT;
    }

    public void setCola2AVT(Queue Cola2AVT) {
        this.Cola2AVT = Cola2AVT;
    }

    public Queue getCola3AVT() {
        return Cola3AVT;
    }

    public void setCola3AVT(Queue Cola3AVT) {
        this.Cola3AVT = Cola3AVT;
    }

    public Queue getColaRefuerzoUSM() {
        return ColaRefuerzoUSM;
    }

    public void setColaRefuerzoUSM(Queue ColaRefuerzoUSM) {
        this.ColaRefuerzoUSM = ColaRefuerzoUSM;
    }

    public Queue getColaRefuerzoAVT() {
        return ColaRefuerzoAVT;
    }

    public void setColaRefuerzoAVT(Queue ColaRefuerzoAVT) {
        this.ColaRefuerzoAVT = ColaRefuerzoAVT;
    }

    public Queue getGanadoresUSM() {
        return ganadoresUSM;
    }

    public void setGanadoresUSM(Queue ganadoresUSM) {
        this.ganadoresUSM = ganadoresUSM;
    }

    public Queue getGanadoresAVT() {
        return ganadoresAVT;
    }

    public void setGanadoresAVT(Queue ganadoresAVT) {
        this.ganadoresAVT = ganadoresAVT;
    }
    
    
}
