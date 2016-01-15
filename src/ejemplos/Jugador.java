package ejemplos;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Jugador implements Runnable {
	
	protected Socket clientSocket = null;
    protected InputStream clienteIS = null;
    protected ObjectInputStream clienteOIS = null;
    private Carta miCarta;    
    
    public void run() {    	
    	try {
    		clientSocket = new Socket("127.0.0.1",5000);
    		clienteIS = clientSocket.getInputStream();
			clienteOIS = new ObjectInputStream(clienteIS);
			
			//Recibo carta
			miCarta = (Carta)clienteOIS.readObject();
			//Muestra la carta en pantalla
			System.out.println(miCarta);
			//Se para el hilo a la espera de una entrada
			clienteOIS.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				clienteIS.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el stream de entrada");
				//e.printStackTrace();
			}	
		}
    }
    
}
