/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotels;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author sanjeev
 */
public class Sign_Up extends javax.swing.JFrame {
    
    int terms_and_cond = 0;
       
    public Sign_Up() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        confirm_pass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        mobile = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign up with ourname");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("<html>Accept Terms & Conditions and Privacy Policy<html>");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 160, 50));

        submit.setBackground(new java.awt.Color(51, 102, 255));
        submit.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 160, 50));

        first_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nameActionPerformed(evt);
            }
        });
        getContentPane().add(first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 219, -1));

        last_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });
        getContentPane().add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 219, -1));

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 219, -1));

        confirm_pass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 220, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create an account");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("<html>Password (max 10 characters)<html>");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 120, 60));

        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 220, -1));

        mobile.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        mobile.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 220, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sign up back.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nameActionPerformed

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_nameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String f_name = first_name.getText();
        String l_name = last_name.getText();
        String email_id = email.getText();
        String contact_no = mobile.getText();
        String passwrd = password.getText();
        String c_password = confirm_pass.getText();
           
        if( ((f_name.equals(""))==true) && ((l_name.equals(""))==true) && ((email_id.equals(""))==true) && ((contact_no.equals(""))== true) && ((passwrd.equals(""))==true) && ((c_password.equals(""))==true))
                JOptionPane.showMessageDialog(null, "Please fill the form.");
        
        else if((f_name.equals("")) == true)
                JOptionPane.showMessageDialog(null, "Please enter First Name");            
        
        else if((l_name.equals("")) == true)
                JOptionPane.showMessageDialog(null, "Please enter Last Name");
        
        else if((email_id.equals("")) == true)
                JOptionPane.showMessageDialog(null,"Please enter Email ID");
        
        else if((contact_no.equals(""))== true)
                JOptionPane.showMessageDialog(null,"Please enter Mobile No");
        
        else if((passwrd.equals("")) == true)
                JOptionPane.showMessageDialog(null,"Please enter Password");
        
        else if((c_password.equals(""))==true)
                JOptionPane.showMessageDialog(null,"Please enter Confirm Password");
        
        else if((c_password.equals(passwrd))== false)
                JOptionPane.showMessageDialog(null,"\nConfirm password and Password do not match.","Error",JOptionPane.ERROR_MESSAGE);
        
        else if((f_name.length())>25)
                JOptionPane.showMessageDialog(null, "First Name limit exceeded max limit 25");
        
        else if((l_name.length())>25)
                JOptionPane.showMessageDialog(null, "Last Name limit exceeded max limit 25");
        
        else if((email_id.length())>50)
                JOptionPane.showMessageDialog(null, "Email ID limit exceeded max limit 50");
                        
        else if(( (contact_no.length() )<10 ) || ( (contact_no.length() )>10 ))
                JOptionPane.showMessageDialog(null, "Mobile no. should be of 10 digits.");
        
        else if((passwrd.length())>10)
                JOptionPane.showMessageDialog(null, "Password limit exceeded max limit 10");
        
        else if((c_password.length())>10)
                JOptionPane.showMessageDialog(null, "Confirm password limit exceeded max limit 10");
        
        else if(terms_and_cond == 0)
            JOptionPane.showMessageDialog(null, "Please accept terms and conditions");
        
        else
        {
            try{
                
                Class.forName("oracle.jdbc.driver.OracleDriver");
                
                Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TRAVELDB","123456");
                
                PreparedStatement pst = connect.prepareStatement("insert into USER_NAME values (?,?,?,?,?)");
                pst.setString(1, f_name);
                pst.setString(2, l_name);
                pst.setString(3, email_id);
                pst.setString(4, contact_no);
                pst.setString(5, passwrd);
                
                int send_toDB = pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null,"Welcome " + f_name + " " + l_name);
                Welcome open = new Welcome();
                open.f_name_label.setText(f_name);
                dispose(); //close current JFrame.                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);   
            }            
        } 
            
        
    }//GEN-LAST:event_submitActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        terms_and_cond += 1;
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirm_pass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField first_name;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField last_name;
    private javax.swing.JFormattedTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}