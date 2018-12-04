/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import model.Person;

/**
 *
 * @author Steven
 */
public class Registros {
    private Person[]personDataBase;
    private int personCounter;

    public Registros() {
        this.personDataBase = new Person[20];
    }

    public Registros(Person[] personDataBase) {
        this.personDataBase = personDataBase;
        personCounter = this.personDataBase.length;
    }
    public int getPersonCounter(){
    return personCounter;
    }
     public Person getPerson(int index) {
        return personDataBase[index];
    }
     public void addPerson(Person person) {
        personDataBase[personCounter++] = person;
    }
     
    
     public boolean revisarRegistro(String a1){
         for (int i = 0; i < personCounter; i++) {
             if (a1 == personDataBase[i].getName()) {
                 return true;
             }
         }
        return false;
     }
     public void printVector(){
         for (int i = 0; i < personCounter; i++) {
             System.out.println("Vector " + personDataBase[i]);
         }
     }
}
