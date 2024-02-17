/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CRegister;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import static org.eclipse.persistence.internal.jpa.metadata.xml.XMLEntityMappingsReader.clear;

/**
 *
 * @author User
 */
public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
        setExtendedState(Registration.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_pw2 = new javax.swing.JPasswordField();
        txt_pw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        cmb_ques = new javax.swing.JComboBox<>();
        txt_email = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_answer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 19, 23));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pw2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_pw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 285, 275, 27));

        txt_pw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 246, 275, 27));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Security question");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 147, -1));

        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 337, 207, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Answer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 86, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(158, 94, 8));
        jLabel3.setText("Registration");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 61, 324, 99));

        txt_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 248, 207, -1));

        btn_clear.setBackground(new java.awt.Color(153, 153, 153));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(102, 0, 0));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        cmb_ques.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_ques.setForeground(new java.awt.Color(153, 153, 153));
        cmb_ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother's maiden name?", "What is your favorite book?", "What is your favorite city?" }));
        jPanel1.add(cmb_ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 330, 270, -1));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 207, -1));

        btn_login.setBackground(new java.awt.Color(153, 153, 153));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(102, 0, 0));
        btn_login.setText("LogIn");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, -1, -1));

        btn_register.setBackground(new java.awt.Color(153, 153, 153));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(102, 0, 0));
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 201, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Employee ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 107, 27));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 107, 27));

        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 381, 207, -1));

        txt_answer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1145, 370, 280, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Phone");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 107, 27));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 107, 27));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Confirm Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 170, 27));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 107, 27));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 107, 27));

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 292, 207, -1));

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

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed

        String password = new String(txt_pw.getPassword());
        String confirmPassword = new String(txt_pw2.getPassword());

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Password doesn't match Confirm Password");
        } else {
            // Passwords match, proceed with database insertion
            int ID = Integer.parseInt(txt_ID.getText());
            String name = txt_name.getText();
            int phone = Integer.parseInt(txt_phone.getText());
            String address = txt_address.getText();
            String email = txt_email.getText();
            String securityQuestion = cmb_ques.getSelectedItem().toString();
            String answer = txt_answer.getText();

            AbstractDocument idDoc = (AbstractDocument) txt_ID.getDocument();
idDoc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text.matches("\\d+")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
});

// Create a document filter for alphabetic input
AbstractDocument nameDoc = (AbstractDocument) txt_name.getDocument();
nameDoc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text.matches("^[a-zA-Z\\s]+$")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
});

// Create a document filter for numeric input with a max length of 10 characters
AbstractDocument phoneDoc = (AbstractDocument) txt_phone.getDocument();
phoneDoc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        currentText += text;
        if (currentText.matches("\\d{0,10}")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
});

// Create a document filter for email input
AbstractDocument emailDoc = (AbstractDocument) txt_email.getDocument();
emailDoc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
        currentText += text;
        if (currentText.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{0,2}$")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
});


            CRegister ob = new CRegister();
            int x = ob.newRegistration(ID, name, phone, address, email, password, securityQuestion, answer);

            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Staff Member Registered Successfully");
            } else if (x == -1) {
                JOptionPane.showMessageDialog(null, "Recheck Password");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to Register the Member");
            }
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
       LogIn2 ob = new LogIn2();
       ob.show();
       dispose();
       
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> cmb_ques;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JPasswordField txt_pw2;
    // End of variables declaration//GEN-END:variables
}
