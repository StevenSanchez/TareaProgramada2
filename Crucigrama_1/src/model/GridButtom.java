
package model;

import javax.swing.JButton;

public class GridButtom extends JButton{
    private Person person;
    private String hola;
    public GridButtom(Person person){
        super(person.toString());
        this.person = person;
    }
    public GridButtom(String hola){
        this.hola = hola;
    }

    public String getHola() {
        return hola;
    }
    
    public Person getPerson(){
    return person;
    }

}
