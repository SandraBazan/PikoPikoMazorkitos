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
        // Le pone un número aleatorio entre 0 y el tamaño máximo de la lista
        this.turno = aleatorio.nextInt(jugadores.size());
    }

    public int pasarSiguiente() {
        // Con un operador ternario, controlo que el turno no sea mayor que el tamaño
        // máximo de la lista, si lo es, será el turno del jugador en la posición 0 (que es el 1)
        return this.turno = ((this.turno == listaJugadores.size() - 1) ? 0 : (turno + 1));
    }

    public int getTurnoJugar() {
        // Devuelve el turno actual
        return this.turno;
    }

    public Jugador getJugadorTurno() {
        // Devuelve el turno actual
        return this.listaJugadores.get(turno);
    }

//    public static void main(String[] args) {
//        ArrayList<Jugador> lista = new ArrayList<>();
//        lista.add(new Jugador("Paco"));
//        lista.add(new Jugador("Pepa"));
//        lista.add(new Jugador("Juan"));
//        TurnoJugador t1 = new TurnoJugador(lista);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(t1.getJugadorTurno().getNombreJugador());
//            t1.getJugadorTurno().tirarDados();
//            for (Dado dado : t1.getJugadorTurno().getDados()) {
//                System.out.println(dado.getCaraSeleccionada());
//            }
//            t1.pasarSiguiente();
//        }
//    }
}
