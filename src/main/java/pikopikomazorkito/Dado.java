/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author naomi
 */
public class Dado {

    // Vamos a crear el atributo arraysCaras que va a ser un array con las caras de los dados.
    private CaraDado[] arrayCaras;

    // Vamos a crear el atributo caraSeleccionada que va a tener valores entre 0 y 5.
    // Por defecto tendrá la cara 0
    private int caraSeleccionada = 0;

    // Se va a utilizar para saber si los dados no han sido deshabilitado.
    // Por defecto estarán disponible
    private boolean disponible = true;

    // Constructor por defecto
    public Dado() {
        CaraDado[] arrayCaras = {CaraDado.CARA1, CaraDado.CARA2, CaraDado.CARA3, CaraDado.CARA4, CaraDado.CARA5, CaraDado.CARA6};
    }

    // Método lanzarDado()
    // La caraSeleccionada será aleatorio entre 0 y 5
    public void lanzarDado() {
        Random aleatorio = new Random();
        this.caraSeleccionada = aleatorio.nextInt(6);
    }

    // Método obtenerImagen()
    // Devolverá la imagen que el dado tenga seleccionada
    public ImageIcon obtenerImagen() {
        return arrayCaras[this.caraSeleccionada].getImagen();
    }

    // Método obtenerPuntuacion()
    // Devolverá el valor que tenga la cara del dado
    public int obtenerPuntuacion() {
        return arrayCaras[this.caraSeleccionada].getPuntuacion();
    }

    public CaraDado[] getArrayCaras() {
        return arrayCaras;
    }

    public int getCaraSeleccionada() {
        return caraSeleccionada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Dado{" + "arrayCaras=" + arrayCaras + ", caraSeleccionada=" + caraSeleccionada + ", disponible=" + disponible + '}';
    }

    public static void main(String[] args) {
        Dado d = new Dado();
        for (int i = 0; i < 10; i++) {
            d.lanzarDado();
            System.out.println(d.obtenerImagen());
            System.out.println(d.obtenerPuntuacion());
        }
    }
}
