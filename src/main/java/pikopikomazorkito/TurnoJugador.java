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
    // Creo un arraylist de Jugador
    private ArrayList<Jugador> listaJugadores;
    // Creo un atributo de tipo int 
    private int turno;

    // Creo un constructor parametrizado que se le pasará un arraylist de jugadores
    public TurnoJugador(ArrayList<Jugador> jugadores) {
        // Creo un random ya que el primer turno será aleatorio
        Random aleatorio = new Random();
        
        // Guardo la lista de los jugadores
        this.listaJugadores = jugadores;
        // Le pone un número aleatorio entre 1 y 4
        this.turno = aleatorio.nextInt(4+1);
    }
    
    public int pasarSiguiente(){
        // Con un operador ternario, controlo que el turno no sea mayor que 4,
        // si lo es, será el turno del jugador 1
        return this.turno = ((this.turno == 4) ? 1 : (turno+1));
    }
    
    public int getTurnoJugar(){
        // Devuelve el turno actual
        return this.turno;
    }
}
