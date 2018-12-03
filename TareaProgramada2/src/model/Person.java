/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;



/**
 *
 * @author Steven
 */
public class Person {
    private String name;
    private char[] password;

    public Person(String name, char[] password) {
        this.name = name;
        this.password = password;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }





    @Override
    public String toString() {
        return "Person{" + "Nombre: " + name + ", Contraseña:  " + Arrays.toString(password) + '}';
    }
    
    
    
}
