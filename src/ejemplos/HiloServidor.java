package ejemplos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HiloServidor implements Runnable {

    protected Socket clientSocket = null;
    protected OutputStream socketOS = null;
    protected ObjectOutputStream socketOOS = null;
    private Baraja baraja;

    public HiloServidor(Socket clientSocket, Baraja baraja) {
        this.clientSocket = clientSocket;
        this.baraja = baraja;
    }

    public void run() {
		try {
			//Abro stream de salida	    	
			socketOS = clientSocket.getOutputStream();
			socketOOS = new ObjectOutputStream(socketOS);
	    	//Envio una carta
	    	socketOOS.writeObject(baraja.darCarta());
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				socketOS.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el stream de salida");
				//e.printStackTrace();
			}	
		}
    }
}
