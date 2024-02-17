/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
  
import controller.CForgotPassword;
import controller.CRegister;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



public class ForgotPassword extends javax.swing.JFrame {
 private String[] securityQuestion = {"What is your mother's maiden name?", "What is your favorite book?", "What is your favorite city?", "What is your favorite food?"};

    public ForgotPassword() {
        initComponents();
        setExtendedState(ForgotPassword.MAXIMIZED_BOTH);
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_ans = new javax.swing.JTextField();
        txt_pw = new javax.swing.JPasswordField();
        txt_pw_confirm = new javax.swing.JPasswordField();
        txt_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_ques = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_change_pw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 19, 23));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Security Question");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 410, 130, 27);

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setText("LogIn");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(410, 600, 72, 27);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Answer");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 450, 107, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 530, 132, 27);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("New Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 490, 107, 27);

        txt_ans.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_ans);
        txt_ans.setBounds(670, 450, 291, 26);

        txt_pw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_pw);
        txt_pw.setBounds(670, 490, 291, 26);

        txt_pw_confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_pw_confirm);
        txt_pw_confirm.setBounds(670, 530, 291, 26);

        txt_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ID);
        txt_ID.setBounds(670, 370, 291, 26);

        jLabel3.setBackground(new java.awt.Color(36, 19, 23));
        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(158, 94, 8));
        jLabel3.setText("Forgot Password?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 210, 344, 108);

        cmb_ques.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother's maiden name?", "What is your favorite book?", "What is your favorite city?", " What is your favorite food?" }));
        getContentPane().add(cmb_ques);
        cmb_ques.setBounds(670, 410, 286, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Employee ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 370, 107, 27);

        btn_change_pw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_change_pw.setText("Change Password");
        btn_change_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_change_pwActionPerformed(evt);
            }
        });
        getContentPane().add(btn_change_pw);
        btn_change_pw.setBounds(820, 600, 148, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        LogIn2 b = new LogIn2();
        b.show();
        dispose();
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void btn_change_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_change_pwActionPerformed
         
        try{
        int  ID = Integer.parseInt(txt_ID.getText());
          if (ID <= 0) {
        JOptionPane.showMessageDialog(this, "ID must be a positive number.");
        return; // Exit the method if the ID is not valid
    }
txt_ID.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c)) {
            e.consume(); // Ignore non-digit characters
        }
    }
});

        String securityQuestion = (String) cmb_ques.getSelectedItem();
        String answer = txt_ans.getText();
        String password = new String(txt_pw.getPassword());
        
        txt_pw.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        if (txt_pw.getPassword().length >= 8) {
            e.consume(); // Ignore keypress if password length is already 8 or more
        }
    }
});

txt_pw_confirm.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        if (txt_pw_confirm.getPassword().length >= 8) {
            e.consume(); // Ignore keypress if password length is already 8 or more
        }
    }
});

          
    if (password.length() != 8) {
        JOptionPane.showMessageDialog(this, "Password must be exactly 8 characters long.");
        return; // Exit the method if the password length is not valid
    }
        String confirmPassword = new String(txt_pw_confirm.getPassword());
        
         if (!password.equals(confirmPassword)) {
    JOptionPane.showMessageDialog(null, "Password doesn't match Confirm Password");
} else {
    // Passwords match, proceed with database insertion
   

    CForgotPassword ob = new CForgotPassword();
    int x = ob.checkUser2(ID, securityQuestion, answer, password);

    if (x > 0) {
        JOptionPane.showMessageDialog(null, "Password Changed");
    } else if (x == -1) {
        JOptionPane.showMessageDialog(null, "Recheck Password");
    } else {
        JOptionPane.showMessageDialog(null, "Data inserted successfully.");
    }
         }
        }
        catch (Exception x) {
    x.printStackTrace(); // Print the full exception stack trace
    JOptionPane.showMessageDialog(null, "An error occurred. Check the logs for details.");
}

         
    }//GEN-LAST:event_btn_change_pwActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_change_pw;
    private javax.swing.JComboBox<String> cmb_ques;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_ans;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JPasswordField txt_pw_confirm;
    // End of variables declaration//GEN-END:variables
}
