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
    RACION21(21, 1, new ImageIcon("res/ficha/21.png"), true),
    RACION22(22, 1, new ImageIcon("res/ficha/22.png"), true),
    RACION23(23, 1, new ImageIcon("res/ficha/23.png"), true),
    RACION24(24, 1, new ImageIcon("res/ficha/24.png"), true),
    RACION25(25, 2, new ImageIcon("res/ficha/25.png"), true),
    RACION26(26, 2, new ImageIcon("res/ficha/26.png"), true),
    RACION27(27, 2, new ImageIcon("res/ficha/27.png"), true),
    RACION28(28, 2, new ImageIcon("res/ficha/28.png"), true),
    RACION29(29, 3, new ImageIcon("res/ficha/29.png"), true),
    RACION30(30, 3, new ImageIcon("res/ficha/30.png"), true),
    RACION31(31, 3, new ImageIcon("res/ficha/31.png"), true),
    RACION32(32, 3, new ImageIcon("res/ficha/32.png"), true),
    RACION33(33, 4, new ImageIcon("res/ficha/33.png"), true),
    RACION34(34, 4, new ImageIcon("res/ficha/34.png"), true),
    RACION35(35, 4, new ImageIcon("res/ficha/35.png"), true),
    RACION36(36, 4, new ImageIcon("res/ficha/36.png"), true);

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
