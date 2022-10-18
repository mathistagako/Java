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
    static ArrayList<Docente> teachersList = new ArrayList<Docente>();
    static ArrayList<Classe> classesList = new ArrayList<Classe>();
    static ArrayList<Materia> subjectsList = new ArrayList<Materia>();
    static ArrayList<Voto> gradesList = new ArrayList<Voto>();
    
    public ArrayList<Studente> searchName(String input){
        
        Boolean studentFound = false;
        ArrayList<Studente> studentsFound = new ArrayList<Studente>();
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).getNome().equals(input)){
               studentFound = true;
               studentsFound.add(new Studente(studentsList.get(i).getID(),studentsList.get(i).getNome(),studentsList.get(i).getCognome(),studentsList.get(i).getClasse()));
               System.out.println(studentsList.get(i).toString());
            }
        }
        if(!studentFound){
            System.out.println("Studente non trovato");
        }
        return studentsFound;
    }
    
//    public getObject(String targetName){
//        
//    }
    
    public Boolean generalSearch(String input) throws IllegalAccessException {
        
        Boolean resultsFound = false;
        
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).checkMatch(input)){
                resultsFound = true;
            }
        }
        for(int i=0;i<teachersList.size();i++){
            if(teachersList.get(i).checkMatch(input)){
                resultsFound = true;
            }
        }
        for(int i=0;i<classesList.size();i++){
            if(classesList.get(i).checkMatch(input)){
                resultsFound = true;
            }
        }
        for(int i=0;i<subjectsList.size();i++){
            if(subjectsList.get(i).checkMatch(input)){
                resultsFound = true;
            }
        }
        for(int i=0;i<gradesList.size();i++){
            if(gradesList.get(i).checkMatch(input)){
                resultsFound = true;
            }
        }
        if(!resultsFound){
            System.out.println("Nessun risultato trovato");
        }
        
        return resultsFound;
    }
    
    public void initializeObjects(){
        
        classesList.add(new Classe(5,"A","TEL"));
        subjectsList.add(new Materia("TPS",3));
        teachersList.add(new Docente("001","Lorenzo","Drusin",subjectsList.get(0)));
        
        studentsList.add( new Studente("34085","Mathis", "Tagako",classesList.get(0)) );
        studentsList.add( new Studente("34010","Carlo", "Macinati",classesList.get(0)) );
        studentsList.add( new Studente("34056","Joel", "Embiid",classesList.get(0)) );
        studentsList.add( new Studente("34000","Carlo", "Devastati",classesList.get(0)) );
        
        Voto votoTPS1 = new Voto(studentsList.get(0),subjectsList.get(0),teachersList.get(0),8);
        
        System.out.println(votoTPS1.toString());
//        Materia [] Lunedi = new Materia[5];
//        
//        Lunedi[0] = new Materia("Matematica",4);
//        Lunedi[1] = new Materia("Informatica",3);
//        Lunedi[2] = new Materia("GPO",3);
//        Lunedi[3] = new Materia("Inglese",3);
//        Lunedi[4] = new Materia("TPS",3);
//        
//        System.out.print("Lunedi: ");
//        
//        for(int i = 0;i<Lunedi.length;i++){
//            System.out.print(Lunedi[i].getNome());
//            if(i<Lunedi.length-1){
//                System.out.print(", ");
//            }else{
//                System.out.println("");
//            }
//        }
    }

    public static void main(String[] args) {
        
        Mavenproject1 p = new Mavenproject1();
        p.initializeObjects(); //Inizializza oggetti
        //System.out.println(studentsList.get(0).toString()); Stampa studente specifico
        
        //PROVA 
        try{
        boolean result = p.generalSearch("Mathis");
        } catch (IllegalAccessException e) {
           System.out.println("Non è andato un tubo");
        }
        
        //InterfacciaRegistroElettronico n = new InterfacciaRegistroElettronico(p);
        //n.setVisible(true);
        
    }
}