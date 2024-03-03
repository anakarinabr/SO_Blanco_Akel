/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author Ana Blanco
 */
public class Administrador{
    
    private Simulacion simulacion;
    
    public Administrador(Simulacion simulacion){
        this.simulacion = simulacion;
    }
    
    public void encolarPersonajes(Personaje personaje1, Personaje personaje2){
        
        //Ubicar personaje del estudio1
        if(personaje1.getPrioridad() == 1){
            this.simulacion.getEstudio1().getQueue1().Enqueue(personaje1);
        }else if(personaje1.getPrioridad() ==2){
            this.simulacion.getEstudio1().getQueue2().Enqueue(personaje1);
        }else if(personaje1.getPrioridad() ==3){
            this.simulacion.getEstudio1().getQueue3().Enqueue(personaje1);
        }else{
            this.simulacion.getEstudio1().getQueueRefuerzo().Enqueue(personaje1);
        }
        
        
        //Ubicar Personaje del estudio2
        if(personaje2.getPrioridad() == 1){
            this.simulacion.getEstudio2().getQueue1().Enqueue(personaje2);
        }else if(personaje2.getPrioridad() ==2){
            this.simulacion.getEstudio2().getQueue2().Enqueue(personaje2);
        }else if(personaje2.getPrioridad() ==3){
            this.simulacion.getEstudio2().getQueue3().Enqueue(personaje2);
        }else{
            this.simulacion.getEstudio2().getQueueRefuerzo().Enqueue(personaje2);
        }
    }
}
