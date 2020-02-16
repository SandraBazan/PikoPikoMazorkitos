/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.util.ArrayList;

/**
 *
 * @author naomi
 */
public class Jugador {
    
    //Atributos
    private String nombreJugador;
    private Dado dado1; //El jugador tendrá ocho dados
    private Dado dado2;
    private Dado dado3;
    private Dado dado4;
    private Dado dado5;
    private Dado dado6;
    private Dado dado7;
    private Dado dado8;
   
    private boolean turno;
    
    ArrayList<Ficha> ficha; //Fichas acumuladas
    
    private int racionMazorkos; //Cantidad de Mazorkos seleccionados
    private int valorAcumulado; //Valor acumulado de los dados seleccionados
    
    //Método constructor por defecto
    public Jugador() {
    }
    
    //Método constructor parametrizado
    public Jugador(String nombreJugador, Dado dado1, Dado dado2, Dado dado3, Dado dado4, Dado dado5, Dado dado6, Dado dado7, Dado dado8, boolean turno, ArrayList<Ficha> ficha, int racionMazorkos, int valorAcumulado) {
        this.nombreJugador = nombreJugador;
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.dado3 = dado3;
        this.dado4 = dado4;
        this.dado5 = dado5;
        this.dado6 = dado6;
        this.dado7 = dado7;
        this.dado8 = dado8;
        this.turno = turno;
        this.ficha = ficha;

        this.racionMazorkos = racionMazorkos;
        this.valorAcumulado = valorAcumulado;
    }
    
    //Constructor para el JOption
    public Jugador(String nombreJugador){
        this.nombreJugador = nombreJugador;
    }
    
    
    //Métodos getters y setters
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Dado getDado1() {
        return dado1;
    }

    public void setDado1(Dado dado1) {
        this.dado1 = dado1;
    }

    public Dado getDado2() {
        return dado2;
    }

    public void setDado2(Dado dado2) {
        this.dado2 = dado2;
    }

    public Dado getDado3() {
        return dado3;
    }

    public void setDado3(Dado dado3) {
        this.dado3 = dado3;
    }

    public Dado getDado4() {
        return dado4;
    }

    public void setDado4(Dado dado4) {
        this.dado4 = dado4;
    }

    public Dado getDado5() {
        return dado5;
    }

    public void setDado5(Dado dado5) {
        this.dado5 = dado5;
    }

    public Dado getDado6() {
        return dado6;
    }

    public void setDado6(Dado dado6) {
        this.dado6 = dado6;
    }

    public Dado getDado7() {
        return dado7;
    }

    public void setDado7(Dado dado7) {
        this.dado7 = dado7;
    }

    public Dado getDado8() {
        return dado8;
    }

    public void setDado8(Dado dado8) {
        this.dado8 = dado8;
    }

    public ArrayList<Ficha> getFicha() {
        return ficha;
    }

    public void setFicha(ArrayList<Ficha> ficha) {
        this.ficha = ficha;
    }

    public int getRacionMazorkos() {
        return racionMazorkos;
    }

    public void setRacionMazorkos(int racionMazorkos) {
        this.racionMazorkos = racionMazorkos;
    }

    public int getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(int valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Jugador{" + "nombreJugador=" + nombreJugador + ", dado1=" + dado1 + ", dado2=" + dado2 + ", dado3=" + dado3 + ", dado4=" + dado4 + ", dado5=" + dado5 + ", dado6=" + dado6 + ", dado7=" + dado7 + ", dado8=" + dado8 + ", ficha=" + ficha + ", racionMazorkos=" + racionMazorkos + ", valorAcumulado=" + valorAcumulado + '}';
    }
}
