/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author mathis
 */
public class ServerReverseWord {
    
    private static final int PORT = 46868;
    
        public static void main(String[] args){
        
        try (ServerSocket ss = new ServerSocket(PORT)){
            System.out.println("Server listening on port: "+PORT);
            Socket socket = ss.accept();
            System.out.println("New Client Connected");
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output,true);
            String text;
            do {
                text = reader.readLine();
                String reverseText = new StringBuilder(text).reverse().toString();
                writer.println("Server: " + reverseText);
            }while(!text.equals("bye"));
                    
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
    }
    
}
