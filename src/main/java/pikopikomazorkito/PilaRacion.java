/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.util.ArrayList;

/**
 *
 * @author Nao
 */
public class PilaRacion {

    //Atributo
    private ArrayList<Racion> racionesAcumuladas;

    //Método constructor
    public PilaRacion() {
        //El listado de raciones acumuladas se creará vacio
        this.racionesAcumuladas = new ArrayList<>();
    }

    //Método apilar, inserta el elemento donde proceda
    public void apilar(Racion racion) {
        this.racionesAcumuladas.add(racion);
    }

    //Método desapilar, saca el elemento que toque (el último introducido)
    public Racion desapilar() {
        //Comprueba que la pila no está vacía para empezar a desapilar
        if (!estaVacia()) {
            return this.racionesAcumuladas.remove(this.racionesAcumuladas.size() - 1);
        }
        //Si no hay elementos devuelvo null
        return null;
    }

    //Método que devuelve un boolean informando sobre si la la lista de raciones acumuladas está vacia
    public boolean estaVacia() {
        return this.racionesAcumuladas.isEmpty();
    }

    //Método que te dice cuantas raciones tiene el jugador
    public int tamanioLista() {
        return this.racionesAcumuladas.size();
    }

    //Método que muestra los elementos de la lista
    public void mostrarElementos() {
        for (Racion lista : racionesAcumuladas) {
            System.out.println(lista);
        }
    }

    //Métodos getters y setters
    public ArrayList<Racion> getRacionesAcumuladas() {
        return racionesAcumuladas;
    }

    public void setRacionesAcumuladas(ArrayList<Racion> racionesAcumuladas) {
        this.racionesAcumuladas = racionesAcumuladas;
    }

    //Método que te dice cuantos gusanos tiene acumulado el jugador entre todas las raciones que posee
    public int gusanosAcumulados(TurnoJugador turno) {
        int gusanosAcumulados = 0;
        for (int i = 0; i < racionesAcumuladas.size(); i++) {
            gusanosAcumulados += turno.getJugadorTurno().getRacionesAcumuladas().get(i).getNumGusanos();
        }
        return gusanosAcumulados;
    }
}
