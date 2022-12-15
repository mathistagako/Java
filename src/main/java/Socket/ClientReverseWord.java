/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author drusi
 */
public class ClientReverseWord {

    private static final String HOST = "localhost";
    private static final int PORT = 46868;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try( Socket socket = new Socket(HOST, PORT)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            
            //Console console = System.console();
            Scanner scanner = new Scanner(System.in); // <----
            String text;
            
            do {
                //text = console.readLine("Enter text: ");
                System.out.print("Enter text: "); // <----
                text = scanner.nextLine(); // <----
                writer.println(text);
                
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                String reverse = reader.readLine();
                System.out.println(reverse);
            } while(!text.equals("bye"));
            
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex ) {
            System.out.println("I/O error: " + ex.getMessage());
        }
        
    }
    
}