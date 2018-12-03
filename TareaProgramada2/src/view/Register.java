/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Person;

/**
 *
 * @author Steven
 */
public class Register extends javax.swing.JDialog {
    private Person person;

    /**
     * Creates new form Register
     */
    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
      
    }
    public Person getPerson() {
        return person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUserName = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btAcept = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbUserName.setText("Ingrese su nombre de usuario");

        lbPassword.setText("Ingrese una contraseña");

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        btAcept.setText("Aceptar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAcept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcept)
                    .addComponent(btCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void btAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptActionPerformed
        // TODO add your handling code here:
        person = new Person(tfUserName.getText(), pfPassword.getPassword());
        System.out.println("Registrado " + person.toString());
        dispose();
    }//GEN-LAST:event_btAceptActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        person = null;
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

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
