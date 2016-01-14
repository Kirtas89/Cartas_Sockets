package ejemplos;

/*
 * tipo:		Básica		-		char				-		Consultable
 * numeros:		Básica		-		entero				-		Consultable
 * palos:		Básica		-		ArrayList(String)	-		Consultable
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Random;

public class Baraja {
	
	private char tipo;
	private int numeros;
	private ArrayList<String> palos;
	
	public Baraja() {
		this.tipo = 'E';
		this.numeros = 9;
		rellenaBaraja();		
	}

	public char getTipo() {
		return tipo;
	}

	public int getNumeros() {
		return numeros;
	}

	public ArrayList<String> getPalos() {
		return palos;
	}
	
	private void rellenaBaraja() {
		palos = new ArrayList<>();
		palos.add("Oros");
		palos.add("Bastos");
		palos.add("Espadas");
		palos.add("Copas");
	}
	
	/* Carta darCarta()
	 * 
	 * Comentario: Función que devuelve una carta de una baraja
	 * Pre: Nada
	 * Entrada: Nada
	 * Salida: Un objeto tipo carta
	 * Post: Se devuelve una carta asociada al nombre
	 */
	public Carta darCarta() {
		Random rnd = new Random();
		char tipoBaraja = getTipo();
		int numeroCarta = rnd.nextInt(9);
		int numeroPalo = rnd.nextInt(3);
		String paloCarta = "";
		
		switch(numeroPalo){
			case 0:
				paloCarta = "Oros";
				break;
				
			case 1:
				paloCarta = "Bastos";
				break;
				
			case 2:
				paloCarta = "Espadas";
				break;
				
			case 3:
				paloCarta = "Copas";
				break;
				
		}
		Carta carta = new Carta(tipoBaraja,numeroCarta,paloCarta);
		
		return carta;
	}
	
	/** void jugadoresEnEspera()
	 * 
	 *  Comentario: Metodo para poner a los jugadores en espera
	 */
	public synchronized void jugadoresEnEspera() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
