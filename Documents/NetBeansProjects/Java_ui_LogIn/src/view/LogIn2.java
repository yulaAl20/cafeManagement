/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.CLogin;
import javax.swing.*;
import org.eclipse.persistence.internal.oxm.mappings.Login;

/**
 *
 * @author User
 */
public class LogIn2 extends javax.swing.JFrame {

    public LogIn2() {
        initComponents();
       
       
    }
   
        public String getUsername() {
       
        String username = txt_user.getText();
        return username;
    }

    
    
    public void clear(){
        txt_user.setText("");
        txt_pw.setText("");
        btn_login.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_forget_pw = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        btn_signin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOKBAR");

        jPanel2.setBackground(new java.awt.Color(36, 19, 23));
        jPanel2.setMinimumSize(new java.awt.Dimension(1355, 850));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("UserID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(310, 420, 186, 29);

        txt_user.setBorder(null);
        jPanel2.add(txt_user);
        txt_user.setBounds(570, 420, 181, 16);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(310, 500, 186, 29);

        txt_pw.setBorder(null);
        jPanel2.add(txt_pw);
        txt_pw.setBounds(570, 500, 181, 16);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(158, 94, 8));
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(230, 290, 211, 90);

        btn_clear.setBackground(new java.awt.Color(102, 102, 102));
        btn_clear.setForeground(new java.awt.Color(204, 204, 204));
        btn_clear.setText("clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear);
        btn_clear.setBounds(320, 570, 72, 23);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(300, 450, 460, 31);

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(300, 530, 459, 31);

        btn_forget_pw.setBackground(new java.awt.Color(153, 153, 153));
        btn_forget_pw.setForeground(new java.awt.Color(255, 255, 255));
        btn_forget_pw.setText("forget password");
        btn_forget_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forget_pwActionPerformed(evt);
            }
        });
        jPanel2.add(btn_forget_pw);
        btn_forget_pw.setBounds(640, 570, 130, 30);

        btn_login.setBackground(new java.awt.Color(204, 204, 204));
        btn_login.setForeground(new java.awt.Color(102, 0, 0));
        btn_login.setText("LogIn");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login);
        btn_login.setBounds(480, 670, 120, 40);

        btn_signin.setBackground(new java.awt.Color(204, 204, 204));
        btn_signin.setForeground(new java.awt.Color(102, 0, 0));
        btn_signin.setText("Sign In");
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        jPanel2.add(btn_signin);
        btn_signin.setBounds(30, 730, 110, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/large.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(950, 220, 640, 510);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(164, 59, 41));
        jLabel4.setText("BOOKBAR");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(500, 70, 380, 120);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("Read, Eat & Enjoy......");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(510, 160, 324, 39);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_forget_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forget_pwActionPerformed
        ForgotPassword ob = new ForgotPassword();
        ob.show();
        dispose();
    }//GEN-LAST:event_btn_forget_pwActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        String user = txt_user.getText();
        String password = txt_pw.getText();

        CLogin ob = new CLogin();
        boolean x = ob.checkUserC(user,password);

        if (x)
        {
            Menu menu = new Menu();
            menu.show();
            dispose();
            setExtendedState(LogIn2.MAXIMIZED_BOTH);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        Registration ob = new  Registration();
        ob.show();
        dispose();
    }//GEN-LAST:event_btn_signinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_forget_pw;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

   
}
