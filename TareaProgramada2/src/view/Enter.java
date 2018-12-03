/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import static Main.Crucigrama.listaRegistrados;
import javax.swing.JOptionPane;
import model.Person;
/**
 *
 * @author Steven
 */
public class Enter extends javax.swing.JDialog {
    private Person person;
    
    /**
     * Creates new form Enter
     */
    public Enter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btAcept = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        lbUserName = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbPassword.setText("Ingrese una contraseña");

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        btAcept.setText("Ingresar");
        btAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptActionPerformed(evt);
            }
        });

        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        lbUserName.setText("Ingrese su nombre de usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btAcept)
                        .addGap(18, 18, 18)
                        .addComponent(btCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lbPassword)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUserName)
                            .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbUserName)
                .addGap(18, 18, 18)
                .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcept)
                    .addComponent(btCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptActionPerformed
        // TODO add your handling code here:
        String name = tfUserName.getText();
        char[] pass = pfPassword.getPassword();
        person = new Person(name,pass);
        for (int i = 0; i < listaRegistrados.getPersonCounter(); i++) {
            System.out.println("hola "+ listaRegistrados.getPerson(i));
            if (listaRegistrados.getPerson(i).equals(person)) {
            Juego juego = new Juego(null, true);
            juego.setVisible(true);  
            }else{
            JOptionPane.showMessageDialog(this, "Error");
            }
        }
      
      
      
        
    }//GEN-LAST:event_btAceptActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcept;
    private javax.swing.JButton btCancel;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
