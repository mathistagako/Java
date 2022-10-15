/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mathis
 */
public class Giornata {
    
    private int ore;
    private Materia[] materie;   

    public Giornata(int ore, Materia[] materie) {
        this.ore = ore;
        this.materie = materie;
    }

    public int getOre() {
        return ore;
    }

    public Materia[] getMaterie() {
        return materie;
    }
    
}
