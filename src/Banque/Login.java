package Banque;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.SQLException;

/**
 *
 * @author ahmet
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    MySQLConnection currentSession;

    public Login(MySQLConnection currentSession) {
        this.currentSession = currentSession;
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        welcomeMsg = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        connexion = new com.k33ptoo.components.KButton();
        error = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(248, 244, 227));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 183, 231));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 183, 231), 2, true));
        jPanel1.setForeground(new java.awt.Color(204, 183, 231));
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("de la banque");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Gestionnaire des utilisateurs");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 410, 340));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelLogin.setAutoscrolls(true);
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeMsg.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        welcomeMsg.setText("Bonjour ! ");
        panelLogin.add(welcomeMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 225, 56));

        usernameText.setText("nom d'utilisateur");
        panelLogin.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        usernameInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });
        panelLogin.add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, 30));

        jLabel1.setText("Merci d’entrer le nom d’utilisateur et mot de passe");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, 334, 29));

        passwordText.setText("Mot de passe");
        panelLogin.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 82, -1));

        jLabel2.setText("Mot de passe oublier ?  Contacter un supérieur");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 264, 320, -1));

        connexion.setkBackGroundColor(new java.awt.Color(204, 183, 231));
        connexion.setkEndColor(new java.awt.Color(239, 151, 219));
        connexion.setkHoverEndColor(new java.awt.Color(239, 151, 219));
        connexion.setkHoverForeGround(new java.awt.Color(239, 151, 219));
        connexion.setkHoverStartColor(new java.awt.Color(204, 183, 231));
        connexion.setkPressedColor(new java.awt.Color(204, 183, 231));
        connexion.setkSelectedColor(new java.awt.Color(204, 183, 231));
        connexion.setkStartColor(new java.awt.Color(204, 183, 231));
        connexion.setLabel("Connexion");
        connexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connexionMouseClicked(evt);
            }
        });
        connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexionActionPerformed(evt);
            }
        });
        panelLogin.add(connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 286, 334, 33));

        error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        panelLogin.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));
        panelLogin.add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 330, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connexionActionPerformed

    private void connexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connexionMouseClicked
        String username = usernameInput.getText();
        String password = passwordInput.getText();
        if (currentSession.login(username, password)) {
            Home home = new Home(username, currentSession);
            home.setVisible(true);
            dispose();
        } else {
            usernameInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            passwordInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            error.setText("nom d'utilisateur ou Mot de passe incorrect !");

        }

    }//GEN-LAST:event_connexionMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton connexion;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordText;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameText;
    private javax.swing.JLabel welcomeMsg;
    // End of variables declaration//GEN-END:variables
}
