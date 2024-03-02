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
public class Personaje {
    private String id;
    private String[] datos;
    private int prioridad;
    private String estudio; 
    private boolean winner;
    private int[] caracteristicas; //podemos hacer que las caracteristicas (PODER) sean 3 numeros, del 1 al 10 que sea su fuerza, poder y vida para hacer la escogencia con esos factores, y que la suma de esos numeros de un personaje vs la del otro, gane el que sea mayor, igual...
    private String [] poder;//otra opcion es crear dos poderes para avatar y 2 para usm y establecer cual es mejor que cual y asi esta la oppcion de empate ganador o que ninguno gane tambien idk son las dos ideas que se me ocurren 
    private int habilidad;
    private int vida;
    private int fuerza;
    private int agilidad;
    
    private String [][] datosPersonajesUSM = {{"src//PersonajesUnShowMas/Gary.png", "Gary"}, {"src//PersonajesUnShowMas/benson.png","Benson"}, {"src//PersonajesUnShowMas/carl.png", "Carl"}, {"src//PersonajesUnShowMas/cj.png", "CJ"}, 
        {"src//PersonajesUnShowMas/dr henry.png", "Dr Henry"}, {"src//PersonajesUnShowMas/eileen.png", "Eileen"}, {"src//PersonajesUnShowMas/fantasmin.png", "Fantasmin"}, {"src//PersonajesUnShowMas/jennifer.png", "Jeniffer"}, {"src//PersonajesUnShowMas/maellard.png", "Maellard"}, 
        {"src//PersonajesUnShowMas/margarita.png", "Margarita"}, {"src//PersonajesUnShowMas/mordecai.png", "Mordecai"},{"src//PersonajesUnShowMas/musculoso.png", "Musculoso"}, {"src//PersonajesUnShowMas/papaleta.png", "Papaleta"}, {"src//PersonajesUnShowMas/rigby.png", "Rigby"}, 
            {"src//PersonajesUnShowMas/roxy.png", "Roxy"}, {"src//PersonajesUnShowMas/skips.png", "Skips"}, {"src//PersonajesUnShowMas/starla.png","Starla"}, {"src//PersonajesUnShowMas/techmo.png", "Techmo"}, {"src//PersonajesUnShowMas/thomas.png", "Thomas"}, {"src//PersonajesUnShowMas/waiter.png", "Waiter" }};
    
    private String[][] datosPersonajesAVT = {{ "src//PersonajesAvatar/aang.png", "Aang"}, {"src//PersonajesAvatar/appa.png", "Appa"}, {"src//PersonajesAvatar/avatar roku.png", "Avatar Roku"}, {"src//PersonajesAvatar/azula.png", "Azula"}, {"src//PersonajesAvatar/hakoda.png", "Hakoda"}, 
        {"src//PersonajesAvatar/hama.png", "Hama"}, {"src//PersonajesAvatar/iroh.png", "Iroh"}, {"src//PersonajesAvatar/jet.png", "Jet"}, {"src//PersonajesAvatar/katara.png", "Katara"}, {"src//PersonajesAvatar/long feng.png", "Long Feng"},{ "src//PersonajesAvatar/mai.png", "Mai"}, 
        {"src//PersonajesAvatar/onji.png"}, {"src//PersonajesAvatar/ozai.png","Ozai"}, {"src//PersonajesAvatar/pipsqueak.png", "Pipsqueak"}, {"src//PersonajesAvatar/princesa yue.png", "Princesa Yue"}, {"src//PersonajesAvatar/principe zuko.png", "Principe Zuko"}, 
        {"src//PersonajesAvatar/sokka.png", "Sokka"},{"src//PersonajesAvatar/toph beifong.png", "Toph Beifong"}, {"src//PersonajesAvatar/ty lee.png", "Ty Lee"}};

    public Personaje(String id, int prioridad, String estudio,int habilidad, int vida, int fuerza, int agilidad) {
        this.id = id;
        this.datos = InfoPersonaje(estudio);
        this.prioridad = prioridad;
        this.estudio = estudio;
        this.habilidad = habilidad;
        this.vida = vida;
        this.fuerza = fuerza;
        this.agilidad = agilidad;        
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

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(int[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String[] getPoder() {
        return poder;
    }

    public void setPoder(String[] poder) {
        this.poder = poder;
    }
    
}
