/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author 34085
 */
public class NewClass {
    
    public void avvia(){
        Printer p1 = Printer.getInstance();
        p1.addJob("Lavoro 1");
        p1.addJob("Lavoro 2");
        Printer p2 = Printer.getInstance();
        p2.addJob("Lavoro 3");
        p2.addJob("Lavoro 4");
    }
    
    public static void main (String[] args) {
        (new NewClass()).avvia();
        Printer.getInstance().addJob("Lavoro 5");
        (new B()).avvia();
        Printer.getInstance().print();
    }
    
}
