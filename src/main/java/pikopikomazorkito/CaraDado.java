/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import javax.swing.ImageIcon;

/**
 *
 * @author naomi
 */
public enum CaraDado {

    CARA1(1, 1, new ImageIcon("res/dado/uno.png")), //Url de la imagen del dado
    CARA2(2, 2, new ImageIcon("res/dado/dos.png")),
    CARA3(3, 3, new ImageIcon("res/dado/tres.png")),
    CARA4(4, 4, new ImageIcon("res/dado/cuatro.png")),
    CARA5(5, 5, new ImageIcon("res/dado/cinco.png")),
    CARA6(6, 5, new ImageIcon("res/dado/mazorca.png"));

    //Atributos
    private int numero;
    private int puntuacion; //Valor (1-5)
    private ImageIcon imagen;

    //Método constructor parametrizado
    private CaraDado(int numero, int puntuacion, ImageIcon imagen) {
        this.numero = numero;
        this.puntuacion = puntuacion;
        this.imagen = imagen;
    }

    //Métodos getters y setters
    public int getNumero() {
        return numero;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "CaraDado{" + "numero=" + numero + ", puntuacion=" + puntuacion + ", imagen=" + imagen + '}';
    }
    
}
