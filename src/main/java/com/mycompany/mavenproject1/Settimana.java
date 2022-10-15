/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mathis
 */
public class Settimana {
    
    private int nGiornate;
    private Giornata[] giornate;

    public Settimana(int nGiornate, Giornata[] giornate) {
        this.nGiornate = nGiornate;
        this.giornate = giornate;
    }

    public int getnGiornate() {
        return nGiornate;
    }

    public Giornata[] getGiornate() {
        return giornate;
    }
    
    
    
}
