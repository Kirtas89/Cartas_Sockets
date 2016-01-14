/*
* Clase Carta.java
*/
package ejemplos;

import java.io.Serializable;

/**
* @author @leoacal
*/
public class Carta implements Serializable {
    // Atributos
    
	private static final long serialVersionUID = -3685512342593693559L;
	private char baraja;
    private int numero;
    private String palo;
    
    /**
    * Constructor
    * @param baraja Tipo de baraja
    * @param numero Ordinal de la carta
    * @param palo Palo al que pertenece 
    */
    public Carta( char baraja, int numero, String palo) {
        this.baraja = baraja;
        this.numero = numero;
        this.palo = palo;
        }   // Cierra constructor
     
    public char getBaraja() {
        return baraja;
    }

    public void setBaraja(char baraja) {
    	if (baraja == 'F')
    		this.baraja = baraja;
    	else
    		this.baraja = 'E';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if ((numero >= 1 && numero <= 12) || (numero == 13 && this.baraja == 'F') )
        	this.numero = numero;
        else
        	this.numero = 2;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
   
    @Override
    public String toString() { 
		String numeroConvertido = "";
		switch (numero){
			case 1: numeroConvertido ="A";
			break;
			case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: numeroConvertido = new Integer(numero).toString();
			break;
			case 10:
				if (this.baraja=='E')
					numeroConvertido ="Sota";
				else
					numeroConvertido = new Integer(numero).toString();
			break;
			case 11:
				if (this.baraja=='E')
					numeroConvertido ="Caballo";
				else
					numeroConvertido ="J";
			break;
			case 12:
				if (this.baraja=='E')
					numeroConvertido ="Rey";
				else
					numeroConvertido ="Q";
			break;
			case 13: numeroConvertido ="K";
		}
        return numeroConvertido + " de " + palo;
    }   // Cierra metodo toString
} // Cierra clase