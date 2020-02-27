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
    Dado[] dados; //Array de dados 
    private int puntosAcumulados; //Valor acumulado de los dados seleccionados
    //ArrayList Fichas susRaciones; (aún no disponible)
    
    //Método constructor por defecto
    public Jugador() {
    }
    
    //Método constructor parametrizado que recibe el nombre del jugador
    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.puntosAcumulados = puntosAcumulados;
        //Instancio la lista de Dados de cada Jugador
        //y le asigno un Dado a cada posición
        this.dados = new Dado[8];
        for (int i = 0; i < 8; i++) {
            this.dados[i] = new Dado();
        }  
    }
      
    ///Método tirarDados() - moverá todos los dados que ya tengo (método tirar dado clase Dado) 
    //Solo debe tirar los dados disponibles
    public void tirarDados(){
        for (int i = 0; i < dados.length; i++) {
            if(this.dados[i].isDisponible()){
                this.dados[i].lanzarDado();
            }
        }
    }
    
    //Métodos getters y setters
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Dado[] getDados() {
        return dados;
    }

    public void setDados(Dado[] dados) {
        this.dados = dados;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Jugador{" + "nombreJugador=" + nombreJugador + ", dados=" + dados + ", puntosAcumulados=" + puntosAcumulados + '}';
    }
}
