/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static Main.Crucigrama.listaRegistrados;
import model.Person;

/**
 *
 * @author Steven
 */
public class Start extends javax.swing.JDialog {
    private Person person;
    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
        setLocationRelativeTo(null);
          person = listaRegistrados.getPerson(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWelcome = new javax.swing.JLabel();
        lbAutor1 = new javax.swing.JLabel();
        lbAutor2 = new javax.swing.JLabel();
        lbAutors = new javax.swing.JLabel();
        btregister = new javax.swing.JButton();
        btEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbWelcome.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lbWelcome.setText("Bienvenido al juego de Crucigrama");

        lbAutor1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 13)); // NOI18N
        lbAutor1.setText("Steven Sanchez");

        lbAutor2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 13)); // NOI18N
        lbAutor2.setText("Leonardo Gomes");

        lbAutors.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        lbAutors.setText("Autores");

        btregister.setText("Registrarse");
        btregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregisterActionPerformed(evt);
            }
        });

        btEnter.setText("Ingresar");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbWelcome)
                    .addComponent(lbAutor1)
                    .addComponent(lbAutor2)
                    .addComponent(lbAutors)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btregister)
                        .addGap(208, 208, 208)
                        .addComponent(btEnter)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAutors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAutor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAutor2)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btregister)
                    .addComponent(btEnter))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregisterActionPerformed
        // TODO add your handling code here:
        Register register = new Register(null, true);
        setVisible(false);
        register.setVisible(true);
        Person person = register.getPerson();
        if (person != null) {
        listaRegistrados.addPerson(person);
        }
        listaRegistrados.printVector();
        setVisible(true);
    }//GEN-LAST:event_btregisterActionPerformed

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        // TODO add your handling code here:
        Enter enter = new Enter(null, true);
        setVisible(false);
        enter.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_btEnterActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btregister;
    private javax.swing.JLabel lbAutor1;
    private javax.swing.JLabel lbAutor2;
    private javax.swing.JLabel lbAutors;
    private javax.swing.JLabel lbWelcome;
    // End of variables declaration//GEN-END:variables
}