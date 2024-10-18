import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            for (int i = 0; i < 10; i++) {
                System.out.println(reader.readLine());
            }

            writer.println("open 1.txt");

            String line = reader.readLine();
            System.out.println(line);

            line = reader.readLine();
            System.out.println(line);

            writer.println("n");
            System.out.println("n");
           
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
