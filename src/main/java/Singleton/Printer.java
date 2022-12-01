/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.ArrayList;

/**
 *
 * @author 34085
 */
public class Printer {
    private static final ArrayList<String> lst = new ArrayList<>();
    private static final Printer p = new Printer();

    private Printer() {
        
    }
    
    public void addJob (String job) {
        lst.add(job);
    }
    
    public void print () {
        for(String s: lst){
            System.out.println(s);
        }
    }
    
    public static Printer getInstance(){
        return p;
    }
}
