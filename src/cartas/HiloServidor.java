package cartas;

import java.net.Socket;

public class HiloServidor implements Runnable {

    protected Socket clientSocket = null;
    private Baraja baraja;

    public HiloServidor(Socket clientSocket, Baraja baraja) {
        this.clientSocket = clientSocket;
        this.baraja = baraja;
    }

    public void run() {
        
    }
}
