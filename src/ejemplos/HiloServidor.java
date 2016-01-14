package ejemplos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HiloServidor implements Runnable {

    protected Socket clientSocket = null;
    private Baraja baraja;

    public HiloServidor(Socket clientSocket, Baraja baraja) {
        this.clientSocket = clientSocket;
        this.baraja = baraja;
    }

    public void run() { 
    	OutputStream socketOS = null;
    	//InputStream socketIS = null;
		try {
			//Abro stream de salida	    	
			socketOS = clientSocket.getOutputStream();
			ObjectOutputStream socketOOS = new ObjectOutputStream(socketOS);
	    	//Abro stream de entrada
	    	//socketIS = clientSocket.getInputStream();    	
	    	//ObjectInputStream socketOIS = new ObjectInputStream(socketIS);
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
			//try {
			//	socketIS.close();
			//} catch (IOException e) {
			//	System.out.println("Error al cerrar el stream de entrada");
				//e.printStackTrace();
			//}			
		}
    }
}
