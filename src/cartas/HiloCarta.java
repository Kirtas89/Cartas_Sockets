package cartas;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.Socket;

public class HiloCarta implements Runnable {

    protected Socket clientSocket = null;
    private BufferedReader entrada;
	private DataOutputStream salida;	

    public HiloCarta(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        
    }
}
