/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import static Main.main.simulacion;

/**
 *
 * @author Ana Blanco
 */
public class Simulacion extends Thread{
   
    private Estudio estudio1;
    private Estudio estudio2;
    private Administrador admin;
    private int time;
    private InteligenciaArtificial AI;

    public Simulacion(String estudio1, String estudio2, int time) {
        this.estudio1 = new Estudio(estudio1);
        this.estudio2 =new Estudio(estudio2);
        this.time= time;
        this.AI = new InteligenciaArtificial(time);
        this.admin = new Administrador(this);
    }
    
    @Override
    public void run(){
        while(true){
            for (int i = 0; i < 20; i++) {
                Personaje personaje = this.getEstudio1().GeneradorPersonajes();
                Personaje personaje2 = this.getEstudio2().GeneradorPersonajes();
                this.admin.encolarPersonajes(personaje, personaje2);
            }
        }
    }
    
    
    //GETTERS AND SETTERS
    public Estudio getEstudio1() {
        return estudio1;
    }

    public void setEstudio1(Estudio estudio1) {
        this.estudio1 = estudio1;
    }

    public Estudio getEstudio2() {
        return estudio2;
    }

    public void setEstudio2(Estudio estudio2) {
        this.estudio2 = estudio2;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public InteligenciaArtificial getAI() {
        return AI;
    }

    public void setAI(InteligenciaArtificial AI) {
        this.AI = AI;
    }
    
    
    
}
