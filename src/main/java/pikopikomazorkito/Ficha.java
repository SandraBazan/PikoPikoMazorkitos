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
public class Ficha {

    //Atributos
    private int numeroPuntos;
    private int numeroMazorkos;
    
    //Método constructor por defecto
    public Ficha() {
    }
    
    //Método constructor parametrizado
    public Ficha(int numeroPuntos, int numeroMazorkos) {
        this.numeroPuntos = numeroPuntos;
        this.numeroMazorkos = numeroMazorkos;
    }
    
    //Métodos getters y setters
    public int getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(int numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }

    public int getNumeroMazorkos() {
        return numeroMazorkos;
    }

    public void setNumeroMazorkos(int numeroMazorkos) {
        this.numeroMazorkos = numeroMazorkos;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Ficha{" + "numeroPuntos=" + numeroPuntos + ", numeroMazorkos=" + numeroMazorkos + '}';
    } 
}
