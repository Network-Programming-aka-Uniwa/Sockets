import java.io.*;
import java.net.*;

public class Server {
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server started. Listening on port 8080...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                OutputStream output = clientSocket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                InputStream input = clientSocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                        
                for (int i = 0; i < 10; i++) {
                    writer.println(i + ".txt");
                }

                String line = reader.readLine();   
                if (line.equals("open 1.txt")) {
                    writer.println("This is the content of 1.txt");
                } else {
                    writer.println("File not found");
                }
                        
                writer.println("Continue? (y/n)");

                if (reader.readLine().equals("n")) {
                    writer.println("Goodbye");
                } else {
                    writer.println("Continue");
                }

                clientSocket.close();
                System.out.println("Client disconnected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
