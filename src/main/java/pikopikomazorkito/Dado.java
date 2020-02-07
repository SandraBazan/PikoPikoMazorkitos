/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

/**
 *
 * @author naomi
 */
public class Dado {

    //Atributos
    private int numero;
    
    //Método constructor por defecto
    public Dado() {
    }
    
    //Método constructor parametrizado
    public Dado(int numero) {
        this.numero = numero;
    }
    
    //Métodos getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Dado{" + "numero=" + numero + '}';
    }  
}
