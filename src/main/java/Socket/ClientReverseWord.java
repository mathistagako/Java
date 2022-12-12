/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Socket;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author 34085
 */
public class ClientReverseWord {
    
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 46868;
    
    public static void main(String[] args){
        
        try( Socket socket = new Socket(HOST,PORT)){
            
            String text;
            OutputStream output = socket.getOutputStream();
            PrintWriter writer  = new PrintWriter(output, true);
            
            Console console = System.console();
            
            do {
                text = console.readLine("Enter text: ");
                writer.println(text);
                
                InputStream input  = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                String reverse = reader.readLine();
                System.out.println(reverse);
                
            }while(!text.equalsIgnoreCase("bye"));
            
        } catch(UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex ) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
    
}
