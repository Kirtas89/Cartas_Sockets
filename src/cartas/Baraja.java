package cartas;

/*
 * tipo:		Básica		-		char				-		Consultable
 * numeros:		Básica		-		ArrayList(Enteros)	-		Consultable
 * palos:		Básica		-		ArrayList(String)	-		Consultable
 * 
 * 
 */

import java.util.ArrayList;

public class Baraja {
	
	private char tipo;
	private ArrayList<Integer> numeros;
	private ArrayList<String> palos;
	
	public Baraja() {
		this.tipo = 'E';
		this.numeros = new ArrayList<>(9);
		this.palos = new ArrayList<>();
		palos.add("Oros");
		palos.add("Bastos");
		palos.add("Espadas");
		palos.add("Copas");
	}

	public char getTipo() {
		return tipo;
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public ArrayList<String> getPalos() {
		return palos;
	}
	
}
