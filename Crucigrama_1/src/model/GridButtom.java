
package model;

import javax.swing.JTextField;

public class GridButtom extends JTextField{
    
    private JTextField text;

    public GridButtom(JTextField text) {
        this.text = text;
    }

   

    public void setText(JTextField text) {
        this.text = text;
    }



  

    @Override
    public String toString() {
        return "GridButtom{" + "text=" + text + '}';
    }
    
}
