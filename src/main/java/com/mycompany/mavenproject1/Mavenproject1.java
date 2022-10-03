/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author 34085
 */
public class Mavenproject1 {
    
    static ArrayList<Studente> studentsList = new ArrayList<Studente>();
    static Scanner scanner = new Scanner(System.in);
    
    public ArrayList<Studente> searchName(String input){
        
        Boolean studentFound = false;
        ArrayList<Studente> studentsFound = new ArrayList<Studente>();
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).getNome().equals(input)){
               studentFound = true;
               studentsFound.add(new Studente(studentsList.get(i).getID(),studentsList.get(i).getNome(),studentsList.get(i).getCognome()));
               System.out.println(studentsList.get(i).toString());
            }
        }
        if(!studentFound){
            System.out.println("Studente non trovato");
        }
        return studentsFound;
    }
    
    public void avvia(){
        Mavenproject1 p = new Mavenproject1();
        
        ArrayList<Studente> studentsFound = new ArrayList<Studente>();
        
        studentsList.add( new Studente("34085","Mathis", "Tagako") );
        studentsList.add( new Studente("34010","Carlo", "Macinati") );
        studentsList.add( new Studente("34056","Joel", "Embiid") );
        studentsList.add( new Studente("34000","Carlo", "Devastati") );

        System.out.println("Inserisci il nome di uno studente");
        String inputStudentName = scanner.nextLine();
        
        studentsFound = p.searchName(inputStudentName);
    }

    public static void main(String[] args) {
        
        Mavenproject1 p = new Mavenproject1();
        //p.avvia();
        InterfacciaRegistroElettronico n = new InterfacciaRegistroElettronico();
        n.setVisible(true);
        
    }
}