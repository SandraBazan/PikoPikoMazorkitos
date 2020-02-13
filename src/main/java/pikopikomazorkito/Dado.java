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

    public CaraDado lanzarDado() {
        Random aleatorio = new Random();
        this.caraSeleccionada = aleatorio.nextInt(5);
        switch(caraSeleccionada){
            // Si el caraSeleccionada es 0
            case 0:
                // Devuelve la primera cara del dado
                return CaraDado.CARA1;
            // Si el caraSeleccionada es 0    
            case 1:
                // Devuelve la segunda cara del dado
                return CaraDado.CARA2;
            // Si el caraSeleccionada es 0   
            case 2:
                // Devuelve la tercera cara del dado
                return CaraDado.CARA3;
            // Si el caraSeleccionada es 0
            case 3:
                // Devuelve la cuarta cara del dado
                return CaraDado.CARA4;
            // Si el caraSeleccionada es 0
            case 4:
                // Devuelve la quinta cara del dado
                return CaraDado.CARA5;
            // Si el caraSeleccionada es 0
            case 5:
                // Devuelve la cara de la mazorca del dado
                return CaraDado.CARA6;
        }
        // Por defecto devuelve la primera cara del dado
        return CaraDado.CARA1;     
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
