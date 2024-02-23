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
public class Personajes {
    private int id;
    private String nombre;
    private String urlImagen;
    private int prioridad;
    private String empresa; 
    private boolean winner;
    private int[] caracteristicas; //podemos hacer que las caracteristicas (PODER) sean 3 numeros, del 1 al 10 que sea su fuerza, poder y vida para hacer la escogencia con esos factores, y que la suma de esos numeros de un personaje vs la del otro, gane el que sea mayor, igual...
    private String [] poder;//otra opcion es crear dos poderes para avatar y 2 para usm y establecer cual es mejor que cual y asi esta la oppcion de empate ganador o que ninguno gane tambien idk son las dos ideas que se me ocurren 
    
    private String [] nombresPersonajesUSM= {"Gary", "Benson", "Carl", "CJ", "Dr Henry", "Eileen", "Fantasmin", "Jennifer", 
        "Maellard", "Margarita", "Mordecai", "Musculoso", "Papaleta", "Rigby", "Roxy", "Skips", "Starla", "Techmo", "Thomas", "Waiter" };
    
    private String[] nombresPersonajesAVT= { "Aang", "Appa", "Avatar Roku", "Azula", "Hakoda", "Hama", "Iroh", "Jet", "Katara", 
        "Long Feng", "Mai", "Onji", "Ozai", "Pipsqueak", "Princesa Yue", "Principe Zuko", "Sokka","Toph Beifong", "Ty Lee"};
    
    private String [] urlPersonajesUSM = {"src//PersonajesUnShowMas/Gary.png", "src//PersonajesUnShowMas/benson.png", "src//PersonajesUnShowMas/carl.png", "src//PersonajesUnShowMas/cj.png", 
        "src//PersonajesUnShowMas/dr henry.png", "src//PersonajesUnShowMas/eileen.png", "src//PersonajesUnShowMas/fantasmin.png", "src//PersonajesUnShowMas/jennifer.png", "src//PersonajesUnShowMas/maellard.png", 
        "src//PersonajesUnShowMas/margarita.png", "src//PersonajesUnShowMas/mordecai.png", "src//PersonajesUnShowMas/musculoso.png", "src//PersonajesUnShowMas/papaleta.png", "src//PersonajesUnShowMas/rigby.png", 
        "src//PersonajesUnShowMas/roxy.png", "src//PersonajesUnShowMas/skips.png", "src//PersonajesUnShowMas/starla.png", "src//PersonajesUnShowMas/techmo.png", "src//PersonajesUnShowMas/thomas.png", "src//PersonajesUnShowMas/waiter.png" };
    
    private String[] urlPersonajesAVT = { "src//PersonajesAvatar/aang.png", "src//PersonajesUnShowMas/appa.png", "src//PersonajesUnShowMas/avatar roku.png", "src//PersonajesUnShowMas/azula.png", "src//PersonajesUnShowMas/hakoda.png", 
        "src//PersonajesUnShowMas/hama.png", "src//PersonajesUnShowMas/iroh.png", "src//PersonajesUnShowMas/jet.png", "src//PersonajesUnShowMas/katara.png", "src//PersonajesUnShowMas/long feng.png", "src//PersonajesUnShowMas/mai.png", 
        "src//PersonajesUnShowMas/onji.png", "src//PersonajesUnShowMas/ozai.png", "src//PersonajesUnShowMas/pipsqueak.png", "src//PersonajesUnShowMas/princesa yue.png", "src//PersonajesUnShowMas/principe zuko.png", 
        "src//PersonajesUnShowMas/sokka.png","src//PersonajesUnShowMas/toph beifong.png", "src//PersonajesUnShowMas/ty lee.png"};

    public Personajes(int id, String nombre, String urlImagen, int prioridad, String empresa) {
        this.id = id;
//        this.nombrePersonaje();
        this.urlImagen = urlImagen;
        this.prioridad = prioridad;
        this.empresa = empresa;
        
    }
 
        
//    public void nombrePersonaje(){
//        Random random = new Random();
//        int index= random.nextInt(15);
//        
//        if(this.getEmpresa().equals("Nickelodeon")){
//            this.setNombre(this.getNombresPersonajesAVT)[index]); 
//            this.seturlPersonajesAVT(this.geturlPersonajesAVT()[index]);
//           
//            
//        }else{
//            this.setNombre(this.getNombresPersonajesUSM()[index]); 
//            this.seturlPersonajesUSM(this.geturlPersonajesUSM()[index]);
//        }
//           
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

    public String[] getNombresPersonajesUSM() {
        return nombresPersonajesUSM;
    }

    public void setNombresPersonajesUSM(String[] nombresPersonajesUSM) {
        this.nombresPersonajesUSM = nombresPersonajesUSM;
    }

    public String[] getNombresPersonajesAVT() {
        return nombresPersonajesAVT;
    }

    public void setNombresPersonajesAVT(String[] nombresPersonajesAVT) {
        this.nombresPersonajesAVT = nombresPersonajesAVT;
    }

    public String[] getUrlPersonajesUSM() {
        return urlPersonajesUSM;
    }

    public void setUrlPersonajesUSM(String[] urlPersonajesUSM) {
        this.urlPersonajesUSM = urlPersonajesUSM;
    }

    public String[] getUrlPersonajesAVT() {
        return urlPersonajesAVT;
    }

    public void setUrlPersonajesAVT(String[] urlPersonajesAVT) {
        this.urlPersonajesAVT = urlPersonajesAVT;
    }
    
    
    
    
    
    
}
