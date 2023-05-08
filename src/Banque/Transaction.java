/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banque;

import java.sql.*;

/**
 *
 * @author ahmet
 */
public class Transaction extends javax.swing.JFrame {

    /**
     * Creates new form Transaction
     */
    String username;
    MySQLConnection currentSession;
    String transactionType;
    String inputtedCIN;
    ClientConsult clientConsult;
    Double solde;
    Double inputtedMontant;

    public Transaction(ClientConsult clientConsult, String username, MySQLConnection currentSession, String transactionType, String inputtedCIN) {
        this.username = username;
        this.currentSession = currentSession;
        this.transactionType = transactionType;
        this.inputtedCIN = inputtedCIN;
        this.clientConsult = clientConsult;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        confirmer = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        montant = new javax.swing.JTextField();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Transaction sur client");

        confirmer.setText("Confirmer");
        confirmer.setkBackGroundColor(new java.awt.Color(204, 183, 231));
        confirmer.setkEndColor(new java.awt.Color(239, 151, 219));
        confirmer.setkHoverEndColor(new java.awt.Color(239, 151, 219));
        confirmer.setkHoverForeGround(new java.awt.Color(239, 151, 219));
        confirmer.setkHoverStartColor(new java.awt.Color(204, 183, 231));
        confirmer.setkPressedColor(new java.awt.Color(204, 183, 231));
        confirmer.setkSelectedColor(new java.awt.Color(204, 183, 231));
        confirmer.setkStartColor(new java.awt.Color(204, 183, 231));
        confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmerMouseClicked(evt);
            }
        });
        confirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmerActionPerformed(evt);
            }
        });

        jLabel2.setText(" Montant a");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText(this.transactionType);

        montant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        montant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montantActionPerformed(evt);
            }
        });

        error.setForeground(java.awt.Color.green);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmerActionPerformed

    private void montantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montantActionPerformed

    private void confirmerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmerMouseClicked
        // TODO add your handling code here:
        boolean isOperated = true;
        try {
            this.inputtedMontant = Double.parseDouble(montant.getText());
            System.out.println(this.inputtedMontant);
            if (this.inputtedMontant > 0) {
                try {
                    ResultSet rs = this.currentSession.consultClient(this.inputtedCIN);
                    rs.next();
                    this.solde = Double.parseDouble(rs.getString("solde"));
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (this.transactionType == "Retirer") {
                        if (this.inputtedMontant < this.solde) {
                            this.solde -= inputtedMontant;
                
                        } else {
                            error.setForeground(java.awt.Color.orange);
                            error.setText("Montant insufisant !");
                            isOperated = false;

                        }
                    }else{
                            this.solde += inputtedMontant;
                    }
                    if(isOperated){
                        this.currentSession.clientTransaction(this.solde, this.inputtedCIN);
                        error.setForeground(java.awt.Color.green);
                        error.setText("Opération effectuée avec succès.");
                        montant.setText("");
                        this.clientConsult.updateSolde(this.solde);
                    }
                }
            } else {
                error.setForeground(java.awt.Color.red);
                error.setText("Impossible d'effectuer l'operation !");
            }
        } catch (NumberFormatException e) {
            error.setForeground(java.awt.Color.red);
            error.setText("Merci d'entrer un nombre correct !");
            montant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        }
    }//GEN-LAST:event_confirmerMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton confirmer;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField montant;
    // End of variables declaration//GEN-END:variables
}