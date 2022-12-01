package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.Math.exp;
import static java.lang.StrictMath.exp;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 34085
 */
public class TimeServer {
    private static final int PORT = 46868;
    
    public static void main(String[] args){
        
        try (ServerSocket ss = new ServerSocket(PORT)){
            System.out.println("Server listening on port: "+PORT);
            while(true){
                Socket socket = ss.accept();
                System.out.println("New Server Connected");
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output,true);
                
                writer.println("Ora Macchina Mathis: " + new Date().toString());
            }
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
    }
    
    
}
