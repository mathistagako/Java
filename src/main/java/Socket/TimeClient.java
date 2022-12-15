package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 34085
 */
public class TimeClient {
    
    private static String HOSTNAME = "192.168.22.224";
    private static int PORT = 46868;
    
    public static void main(String[] args) {
        try {
            Socket s = new Socket(HOSTNAME,PORT);
            InputStream input = s.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String time = reader.readLine();
            
            System.out.println(time);
        } catch (IOException ex) {
            Logger.getLogger(TimeClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
} 
