/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.ArrayList;

/**
 *
 * @author damm
 */
public class PiedraPapelTijera {

    private String jugador1;
    private String jugador2;
    private int tiradaJugador1;
    private int tiradaJugador2;
    private ArrayList<String> estadistica;

    public PiedraPapelTijera() {
        jugador1="";
        jugador2="";
        tiradaJugador1=-1;
        tiradaJugador2=-1;
    }

    public void setJugador(int numJugador, String nombre){
        if(numJugador==1){
            jugador1=nombre;
        }else{
            jugador2=nombre;
        }
    }
    
    public String getJugador(int numJugador){
        String resultado="";
        
        if(numJugador==1){
            resultado=jugador1;
        }else{
            resultado=jugador2;
        }
        
        return resultado;
    
    }
    
    public void tiradaJugador(int numJugador, String tirada){
    
        if(numJugador==1){
            switch(tirada.toLowerCase()){
                case"piedra":
                    tiradaJugador1=0;
                    break;
                case"papel":
                    tiradaJugador1=1;
                    break;
                case "tijera":
                    tiradaJugador1=2;
                    break;
                    
            }
        }else{
            switch(tirada.toLowerCase()){
                case"piedra":
                    tiradaJugador1=0;
                    break;
                case"papel":
                    tiradaJugador1=1;
                    break;
                case "tijera":
                    tiradaJugador1=2;
                    break;
                    
            }
        }
        
    }
    
    public void victoriaJugador(){
    
    }
    
    public void actualizaEstadisticas(int ganador){
        switch(ganador){
            case 0:
                break;
        
        
        }
    }
    
    
    public int tirada aleatoria(){
        int resultado=0;
        resultado=(int)(Math.random()*2);
        return resultado;
    }
    
}
