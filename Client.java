package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static ObjectInputStream ois;
    private static ObjectOutputStream oos;
    private static Scanner scanner;

    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int SERVER_PORT = 12345;

        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.flush();

            ois = new ObjectInputStream(socket.getInputStream());
            scanner = new Scanner(System.in);

            System.out.println("Connected to the server.")
            //TODO: Creare logica del server
        }
    }
}
