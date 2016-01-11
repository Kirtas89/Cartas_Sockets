/*
* Clase Carta.java
*/
package cartas;

import java.io.Serializable;

/**
* @author @leoacal
*/
public class Carta implements Serializable {
    // Atributos
	private static final long serialVersionUID = 42L;
    private char baraja;
    private int numero;
    private String palo;
    
    /**
    * Constructor
    * @param baraja Tipo de baraja
    * @param numero Ordinal de la carta
    * @param palo Palo al que pertenece 
    */
    public Carta(char baraja, int numero, String palo) {
        this.baraja = baraja;
        this.numero = numero;
        this.palo = palo;
        }   // Cierra constructor
     
    public char getBaraja() {
        return baraja;
    }

    public void setBaraja(char baraja) {
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
   
    @Override
    public String toString() { 
            return numero + " de " + palo;
    }   // Cierra metodo toString
} // Cierra clase