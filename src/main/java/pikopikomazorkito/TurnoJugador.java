/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sandra
 */
public class TurnoJugador {
    private ArrayList<Jugador> listaJugadores;
    private int turno;

    public TurnoJugador(ArrayList<Jugador> jugadores) {
        Random aleatorio = new Random();
        this.listaJugadores = jugadores;
        this.turno = aleatorio.nextInt(5);
    }
    
    public int pasarSiguiente(){
        return this.turno = ((this.turno == 4) ? 0 : (turno+1));
    }
    
    public int getTurnoJugar(){
        return this.turno;
    }
}
