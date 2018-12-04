package Main;

import view.Start;
import dataBase.Registros;
import model.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Crucigrama {
    public static Registros listaRegistrados;
    public static Registros varas;
    
    public static void main(String[] args) {
           varas = new Registros(new Person[]{
            new Person("Falafel", "dish1"),
            new Person("Pasta con hongos", "dish2.jpg"),
            new Person("Pinchos de vegetales", "dish3.jpg"),
            new Person("Berenjenas rellenas", "dish4.jpg")
        });
        listaRegistrados = new Registros();
        Start start = new Start();
        start.setVisible(true);
    }

    
}
