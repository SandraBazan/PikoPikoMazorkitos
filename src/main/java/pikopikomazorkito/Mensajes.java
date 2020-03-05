/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import javax.swing.JTextArea;

/**
 *
 * @author sandra
 */
public class Mensajes {

    // Atributo JTextArea    
    private JTextArea texto;

    // Creo un constructor parametrizado por el cuál se pase el JTextArea de la
    // VentanaJuego por parametros.
    public Mensajes(JTextArea textarea) {
        this.texto = textarea;
    }

    // Creo el método hola que será el mensaje de inicio de la VentanaJuego
    public void hola() {
        // Con el método setText introduzco el mensaje de inicio
        this.texto.setText("¡Bienvenido a PikoPikoMarzokito!\n"
                + "Espero que tengas hambre porque te vas a comer unas cuantas mazorcas (o no).");
    }

    // Creo el método mensajeTurno que muestra quién tira y sus dados
    public void mensajeTurno(TurnoJugador turno1) {

        // Creo un array de String que tendrá los resultados
        // de los dados
        String[] resultados = new String[8];

        for (int i = 0; i < resultados.length; i++) {
            // Compruebo en cada dado si el valor 6,
            // si lo es, pondrá "Mazorca" en vez de 6
            // y si no lo es, pondrá el valor que tenga el dado.
            // Todo esto lo guardo en un array de String creado anteriormente
            resultados[i] = (turno1.getJugadorTurno().getDados()[i].getCaraSeleccionada().getNumero() == 6) ? "Mazorca" : Integer.toString(turno1.getJugadorTurno().getDados()[i].getCaraSeleccionada().getNumero());
        }

        // Con el método setText introduzco el mensaje de quién tira y cuáles son sus dados 
        this.texto.setText("Es el turno del jugador " + turno1.getJugadorTurno().getNombreJugador() + ".\n"
                + "Los resultados de los dados son:\n"
                + "Dado1: " + resultados[0] + ".\n" // Cómo podemos observar, muestra el valor de la posición 0
                + "Dado2: " + resultados[1] + ".\n"
                + "Dado3: " + resultados[2] + ".\n"
                + "Dado4: " + resultados[3] + ".\n"
                + "Dado5: " + resultados[4] + ".\n"
                + "Dado6: " + resultados[5] + ".\n"
                + "Dado7: " + resultados[6] + ".\n"
                + "Dado8: " + resultados[7] + ".\n");
    }
}
