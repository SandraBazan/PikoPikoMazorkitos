/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

/**
 *
 * @author josel
 */
import javax.swing.ImageIcon;

public enum Racion {
    RACION21(21, 1, new ImageIcon("res/ficha/21blanca.png"), true),
    RACION22(22, 1, new ImageIcon("res/ficha/22blanca.png"), true),
    RACION23(23, 1, new ImageIcon("res/ficha/23blanca.png"), true),
    RACION24(24, 1, new ImageIcon("res/ficha/24blanca.png"), true),
    RACION25(25, 2, new ImageIcon("res/ficha/25blanca.png"), true),
    RACION26(26, 2, new ImageIcon("res/ficha/26blanca.png"), true),
    RACION27(27, 2, new ImageIcon("res/ficha/27blanca.png"), true),
    RACION28(28, 2, new ImageIcon("res/ficha/28blanca.png"), true),
    RACION29(29, 3, new ImageIcon("res/ficha/29blanca.png"), true),
    RACION30(30, 3, new ImageIcon("res/ficha/30blanca.png"), true),
    RACION31(31, 3, new ImageIcon("res/ficha/31blanca.png"), true),
    RACION32(32, 3, new ImageIcon("res/ficha/32blanca.png"), true),
    RACION33(33, 4, new ImageIcon("res/ficha/33blanca.png"), true),
    RACION34(34, 4, new ImageIcon("res/ficha/34blanca.png"), true),
    RACION35(35, 4, new ImageIcon("res/ficha/35blanca.png"), true),
    RACION36(36, 4, new ImageIcon("res/ficha/36blanca.png"), true);

    //Atributos de las raciones
    private int numero;
    private int numGusanos;
    private ImageIcon imagen;
    private boolean disponible;

    private Racion(int numero, int numGusanos, ImageIcon imagen, boolean disponible) {
        this.numero = numero;
        this.numGusanos = numGusanos;
        this.imagen = imagen;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumGusanos() {
        return numGusanos;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Racion{" + "numero=" + numero + ", numGusanos=" + numGusanos + ", imagen=" + imagen + ", disponible=" + disponible + '}';
    }

}
