/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import static Main.main.simulacion;
import static Main.main.interfaz;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Ana Blanco
 */
public class Simulacion extends Thread {

    private Estudio estudio1;
    private Estudio estudio2;
    private Administrador admin;
    private int time;
    private InteligenciaArtificial AI;

    public Simulacion(String estudio1, String estudio2, int time) {
        this.estudio1 = new Estudio(estudio1);
        this.estudio2 = new Estudio(estudio2);
        this.time = time;
        this.AI = new InteligenciaArtificial(time, this);
        this.admin = new Administrador(this);
    }

    @Override
    public void run() {
        
       PersonajesPrincipales();      
     
        for (int i = 0; i < 20; i++) {
            Personaje personaje = this.getEstudio1().GeneradorPersonajes();
            Personaje personaje2 = this.getEstudio2().GeneradorPersonajes();
            this.admin.encolarPersonajes(personaje, personaje2);
        }
        while (true) {
            Personaje[] competidores = this.admin.EscogerPersonajes();

            if (competidores[0] != null && competidores[1] != null) {
                try {
                    ActualizarLabels(competidores);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.AI.setEstado("Esperando");
                interfaz.getEstadoIA().setText(this.AI.getEstado());
                long valor1 = (long) (this.time * 0.25*1000);
                try {
                    sleep(valor1);
                    this.AI.batalla(competidores[0], competidores[1]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.estudio1.inanicion();
                this.estudio2.inanicion();
                this.estudio1.UpdateRefuerzo();
                this.estudio2.UpdateRefuerzo();
            }
        }

    }

    public void ActualizarLabels(Personaje[] competidores) throws InterruptedException {
        //Estudio1 (AVATAR)
        interfaz.getCola1AVT().setText(this.estudio1.getQueue1().print());
        interfaz.getCola2AVT().setText(this.estudio1.getQueue2().print());
        interfaz.getCola3AVT().setText(this.estudio1.getQueue3().print());
        interfaz.getRefuerzoAVT().setText(this.estudio1.getQueueRefuerzo().print());
        interfaz.getColaGanadoresAVT().setText(this.estudio1.getQueueGanadores().print());
        System.out.println(competidores[0].getDatos());
        interfaz.getNombreCompetidorAVT().setText(competidores[0].getDatos()[1] + ". Id: " + competidores[0].getId());
        interfaz.getHabilidadAVT().setText(Integer.toString(competidores[0].getCaracteristicas()[0]));
        interfaz.getVidaAVT().setText(Integer.toString(competidores[0].getCaracteristicas()[1]));
        interfaz.getFuerzaAVT().setText(Integer.toString(competidores[0].getCaracteristicas()[2]));
        interfaz.getAgilidadAVT().setText(Integer.toString(competidores[0].getCaracteristicas()[3]));
        interfaz.getColaGanadoresAVT().setText(this.estudio1.getQueueGanadores().print());

        //Estudio2 (UN SHOW MAS)
        interfaz.getCola1USM().setText(this.estudio2.getQueue1().print());
        interfaz.getCola2USM().setText(this.estudio2.getQueue2().print());
        interfaz.getCola3USM().setText(this.estudio2.getQueue3().print());
        interfaz.getRefuerzoUSM().setText(this.estudio2.getQueueRefuerzo().print());
        interfaz.getColaGanadoresUSM().setText(this.estudio2.getQueueGanadores().print());
        interfaz.getNombreCompetidorUSM().setText(competidores[1].getDatos()[1] + ". Id: " + competidores[1].getId());
        interfaz.getHabilidadUSM().setText(Integer.toString(competidores[1].getCaracteristicas()[0]));
        interfaz.getVidaUSM().setText(Integer.toString(competidores[1].getCaracteristicas()[1]));
        interfaz.getFuerzaUSM().setText(Integer.toString(competidores[1].getCaracteristicas()[2]));
        interfaz.getAgilidadUSM().setText(Integer.toString(competidores[1].getCaracteristicas()[3]));
        interfaz.getColaGanadoresUSM().setText(this.estudio2.getQueueGanadores().print());

        try {
            interfaz.getCompetidorAVT().setIcon(new ImageIcon(ImageIO.read(new File(competidores[0].getDatos()[0]))));
            interfaz.getCompetidorUSM().setIcon(new ImageIcon(ImageIO.read(new File(competidores[1].getDatos()[0]))));
        } catch (IOException ex) {
            Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void PersonajesPrincipales(){
        //Personajes en cada cola
        Personaje personajeAVT = this.getEstudio1().GeneradorPersonajes();
        personajeAVT.setPrioridad(1);
        this.estudio1.getQueue1().Enqueue(personajeAVT);
        Personaje personajeUSM = this.getEstudio2().GeneradorPersonajes();
        personajeUSM.setPrioridad(1);
        this.estudio2.getQueue1().Enqueue(personajeUSM);
        
        Personaje personaje2 = this.getEstudio1().GeneradorPersonajes();
        personaje2.setPrioridad(2);
        this.estudio1.getQueue2().Enqueue(personaje2);
        Personaje personaje2U = this.getEstudio2().GeneradorPersonajes();
        personaje2U.setPrioridad(2);
        this.estudio2.getQueue2().Enqueue(personaje2U);
        
        Personaje personaje3 = this.getEstudio1().GeneradorPersonajes();
        personaje3.setPrioridad(3);
        this.estudio1.getQueue3().Enqueue(personaje3);
        Personaje personaje3U = this.getEstudio2().GeneradorPersonajes();
        personaje3U.setPrioridad(3);
        this.estudio2.getQueue3().Enqueue(personaje3U);
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
