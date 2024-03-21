
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
public class Personaje<T> {
    private String id;
    private String[] datos; // {url, nombre}
    private int prioridad;
    private String estudio; 
    private T winner;
    private int[] caracteristicas; //array con los valores de habilidad, vida, fuerza y agilidad
    private int contadorCiclos;
    
    private String [][] datosPersonajesUSM = {{"src//PersonajesUnShowMas/Gary.png", "Gary"}, {"src//PersonajesUnShowMas/benson.png","Benson"}, {"src//PersonajesUnShowMas/carl.png", "Carl"}, {"src//PersonajesUnShowMas/cj.png", "CJ"}, 
        {"src//PersonajesUnShowMas/dr henry.png", "Dr Henry"}, {"src//PersonajesUnShowMas/eileen.png", "Eileen"}, {"src//PersonajesUnShowMas/fantasmin.png", "Fantasmin"}, {"src//PersonajesUnShowMas/jennifer.png", "Jeniffer"}, {"src//PersonajesUnShowMas/maellard.png", "Maellard"}, 
        {"src//PersonajesUnShowMas/margarita.png", "Margarita"}, {"src//PersonajesUnShowMas/mordecai.png", "Mordecai"},{"src//PersonajesUnShowMas/musculoso.png", "Musculoso"}, {"src//PersonajesUnShowMas/papaleta.png", "Papaleta"}, {"src//PersonajesUnShowMas/rigby.png", "Rigby"}, 
            {"src//PersonajesUnShowMas/roxy.png", "Roxy"}, {"src//PersonajesUnShowMas/skips.png", "Skips"}, {"src//PersonajesUnShowMas/starla.png","Starla"}, {"src//PersonajesUnShowMas/techmo.png", "Techmo"}, {"src//PersonajesUnShowMas/thomas.png", "Thomas"}, {"src//PersonajesUnShowMas/waiter.png", "Waiter" }};
    
    private String[][] datosPersonajesAVT = {{ "src//PersonajesAvatar/aang.png", "Aang"}, {"src//PersonajesAvatar/appa.png", "Appa"}, {"src//PersonajesAvatar/avatar roku.png", "Avatar Roku"}, {"src//PersonajesAvatar/azula.png", "Azula"}, {"src//PersonajesAvatar/hakoda.png", "Hakoda"}, 
        {"src//PersonajesAvatar/hama.png", "Hama"}, {"src//PersonajesAvatar/iroh.png", "Iroh"}, {"src//PersonajesAvatar/jet.png", "Jet"}, {"src//PersonajesAvatar/katara.png", "Katara"}, {"src//PersonajesAvatar/long feng.png", "Long Feng"},{ "src//PersonajesAvatar/mai.png", "Mai"}, 
        {"src//PersonajesAvatar/onji.png", "Onji"}, {"src//PersonajesAvatar/ozai.png","Ozai"}, {"src//PersonajesAvatar/pipsqueak.png", "Pipsqueak"}, {"src//PersonajesAvatar/princesa yue.png", "Princesa Yue"}, {"src//PersonajesAvatar/principe zuko.png", "Principe Zuko"}, 
        {"src//PersonajesAvatar/sokka.png", "Sokka"},{"src//PersonajesAvatar/toph beifong.png", "Toph Beifong"}, {"src//PersonajesAvatar/ty lee.png", "Ty Lee"}};

    @SuppressWarnings("empty-statement")
    public Personaje(String id, int prioridad, String estudio,int habilidad, int vida, int fuerza, int agilidad) {
        this.id = id;
        this.datos = InfoPersonaje(estudio);
        this.prioridad = prioridad;
        this.estudio = estudio;
        this.caracteristicas = new int[4];
        this.caracteristicas[0] = habilidad;
        this.caracteristicas[1] = vida;
        this.caracteristicas[2] = fuerza;
        this.caracteristicas[3] = agilidad;
        this.contadorCiclos = 0;
                
    }
    
    private String[] InfoPersonaje(String estudio){
        String[][] array = {};
        if ("USM".equals(estudio)) {
            array = datosPersonajesUSM;
        } else if ("AVT".equals(estudio)) {
            array = datosPersonajesAVT;
        }
        
        Random random = new Random();
        String[] randomElement = array[random.nextInt(array.length)];

        return randomElement;
    }
 
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public T isWinner() {
        return winner;
    }

    public void setWinner(T winner) {
        this.winner = winner;
    }

    public int[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(int[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

   
    public int getContadorCiclos() {
        return contadorCiclos;
    }

    public void setContadorCiclos(int contadorCiclos) {
        this.contadorCiclos = contadorCiclos;
    }   
    
    
}
