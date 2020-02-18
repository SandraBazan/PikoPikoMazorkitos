/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.util.Random;

/**
 *
 * @author naomi
 */
public class Dado {

    // Vamos a crear el atributo arraysCaras que va a ser un array con las caras de los dados.
    private CaraDado[] arrayCaras = {CaraDado.CARA1, CaraDado.CARA2, CaraDado.CARA3, CaraDado.CARA4, CaraDado.CARA5, CaraDado.CARA6};

    // Vamos a crear el atributo caraSeleccionada que va a tener valores entre 0 y 5.
    private int caraSeleccionada;

    // Se va a utilizar para saber si los dados no han sido deshabilitado.
    private boolean disponible = true;

    public void lanzarDado() {
        Random aleatorio = new Random();
        this.caraSeleccionada = aleatorio.nextInt(6);           
    }

    public CaraDado[] getArrayCaras() {
        return arrayCaras;
    }

    public void setArrayCaras(CaraDado[] arrayCaras) {
        this.arrayCaras = arrayCaras;
    }

    public int getCaraSeleccionada() {
        return caraSeleccionada;
    }

    public void setCaraSeleccionada(int caraSeleccionada) {
        this.caraSeleccionada = caraSeleccionada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
