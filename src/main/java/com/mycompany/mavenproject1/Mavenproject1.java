/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.ArrayList;

/**
 *
 * @author 34085
 */
public class Mavenproject1 {
    
    static ArrayList<Studente> studentsList = new ArrayList<Studente>();
    
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
    
    public void initializeSubjects(){
        
        Materia [] materie = new Materia[5];
        
        materie[0] = new Materia("Matematica",4);
        materie[1] = new Materia("Matematica",3);
        materie[2] = new Materia("GPO",3);
        materie[3] = new Materia("Matematica",5);
        materie[4] = new Materia("TPS",3);
        
    }
    
    public void avvia(){
        
        studentsList.add( new Studente("34085","Mathis", "Tagako") );
        studentsList.add( new Studente("34010","Carlo", "Macinati") );
        studentsList.add( new Studente("34056","Joel", "Embiid") );
        studentsList.add( new Studente("34000","Carlo", "Devastati") );
        }

    public static void main(String[] args) {
        
        Mavenproject1 p = new Mavenproject1();
        p.initializeSubjects(); //Inizializza le materie
        p.avvia();  //Inizializza gli studenti
        InterfacciaRegistroElettronico n = new InterfacciaRegistroElettronico(p);
        n.setVisible(true);
        
    }
}