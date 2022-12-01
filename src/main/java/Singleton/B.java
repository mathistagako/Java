/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author 34085
 */
public class B {
    public void avvia(){
        Printer p1 = Printer.getInstance();
        p1.addJob("Lavoro 6");
        p1.addJob("Lavoro 7");
        Printer p2 = Printer.getInstance();
        p2.addJob("Lavoro 8");
        p2.addJob("Lavoro 9");
    }
}
