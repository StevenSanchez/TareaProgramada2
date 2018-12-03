package Main;

import view.Start;
import dataBase.Registros;

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
    
    public static void main(String[] args) {
        listaRegistrados = new Registros();
        Start start = new Start();
        start.setVisible(true);
    }

    
}
