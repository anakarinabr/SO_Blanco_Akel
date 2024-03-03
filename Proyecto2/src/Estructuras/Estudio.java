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
public class Estudio {
    
    private String nombre;
    private Queue queue1;
    private Queue queue2;
    private Queue queue3;
    private Queue queueRefuerzo;
    private Queue queueGanadores;
    private int contadorPersonajes;

    public Estudio(String nombre) {
        this.nombre = nombre;
        this.queue1 = new Queue<Personaje>();
        this.queue2 = new Queue<Personaje>();
        this.queue3 = new Queue<Personaje>();
        this.queueRefuerzo = new Queue<Personaje>();
        this.queueGanadores = new Queue<Personaje>();
        this.contadorPersonajes = 0;
    }
    
    public Personaje GeneradorPersonajes(){
        
        this.contadorPersonajes++;
        String id = this.getNombre() + this.getContadorPersonajes();
        
        Random random = new Random();
        int habilidades  = random.nextInt(101);
        
        random = new Random();
        int vida = random.nextInt(101);
        
        random = new Random();
        int fuerza =  random.nextInt(101);
        
        random = new Random();
        int agilidad = random.nextInt(101);
        
//        Para la cola1, será prioridad 1
//        para la cola2, sera prioridad 2
//        para la cola3, sera prioridad 3
//        para la de refuerzo, sera prioridad 0
//        
        int prioridad = 0;
        if (habilidades <60) { 
            prioridad++;   // 60% 
        }if (vida < 70) { 
            prioridad++;   // 70% 
        }if (fuerza < 50) {
            prioridad++;   // 50% 
        }if (agilidad < 40) {
            prioridad++;   // 40% 
        }    
        
        if (prioridad  == 4) {
            prioridad = 3;
        }if (prioridad  == 0) {
            prioridad = 1;
        } 
        
        Personaje personaje = new Personaje(id, prioridad, this.nombre, habilidades, vida, fuerza, agilidad);
        return personaje;
                
    }  
    
    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Queue getQueue1() {
        return queue1;
    }

    public void setQueue1(Queue queue1) {
        this.queue1 = queue1;
    }

    public Queue getQueue2() {
        return queue2;
    }

    public void setQueue2(Queue queue2) {
        this.queue2 = queue2;
    }

    public Queue getQueue3() {
        return queue3;
    }

    public void setQueue3(Queue queue3) {
        this.queue3 = queue3;
    }

    public Queue getQueueRefuerzo() {
        return queueRefuerzo;
    }

    public void setQueueRef(Queue queueRefuerzo) {
        this.queueRefuerzo = queueRefuerzo;
    }

    public int getContadorPersonajes() {
        return contadorPersonajes;
    }

    public void setContadorPersonajes(int contadorPersonajes) {
        this.contadorPersonajes = contadorPersonajes;
    }
     
}
