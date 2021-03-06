

package mumbai;

import booking.BookingUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAVISH SHARMA
 */
public class LeelaUI extends javax.swing.JFrame {

    String City = "Mumbai";
    public String check_in = "", check_out = "";
    public int rooms , adults , childs ;
    public void setDetails(int room, int adult,int child,String c_in, String c_out)
    {
        rooms = room;
        adults = adult;
        childs = child;
        check_in = c_in;
        check_out = c_out;
        //JOptionPane.showMessageDialog(null,rooms + " " + adults + " " + childs + " " + check_in + " " + check_out);
    }
    String first_name = "", last_name = "",email_ID = "", mobile_no = "";
    
    public void set_user_info(String f_name, String l_name, String email,String mobile)
    {
        first_name = f_name;
        last_name = l_name;
        email_ID = email;
        mobile_no = mobile;
    }
    public LeelaUI() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        L_book1 = new javax.swing.JButton();
        L_pic1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        L_book3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        L_book2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        L_pic2 = new javax.swing.JButton();
        L_pic3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 23, 70, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("MS PGothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("The Leela Palace");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 400, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("52,,Andheri Kurla Road, Sahar, Marine Drive, Mumbai ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 370, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amenities");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 173, 240, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html> Experience panoramic views of the Arabian Sea from our luxury 5-star hotel JW Marriott Mumbai Juhu Plush bedding with custom duvets and crisp linens ensure a good night's sleep for every hotel guest. Superb amenities for your India hotel stay include 24-hour room service and sleek marble bathrooms.Unlimited free wifi facility available.Indoor swimming pool for adults upto 7ft. and for kids upto 3ft. including showers and resting chairs.Valet parking is also available with paid washing facility.<html>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 292, 440, 200));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Leela Standard Room ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 82, 200, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html>Minimum Stay of 2 Nights.Rate includes Basic WiFi connect upto 4 device.<html>");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 112, 410, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rs. 9,199/-");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 130, 30));

        L_book1.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        L_book1.setText("Book Now");
        L_book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_book1ActionPerformed(evt);
            }
        });
        getContentPane().add(L_book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, 120, 30));

        L_pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leela small 1.png"))); // NOI18N
        L_pic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_pic1ActionPerformed(evt);
            }
        });
        getContentPane().add(L_pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 220, 130));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Leela Suite Room");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 272, 230, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html>Minimum stay of 2 nights. Rate includes WiFi service,sea facing room with lobby and computer table.<html>");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 312, 360, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rs. 12,090/-");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 140, 30));

        L_book3.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        L_book3.setText("Book Now");
        L_book3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_book3ActionPerformed(evt);
            }
        });
        getContentPane().add(L_book3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 592, 120, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Leela Palace Room");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 462, 260, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<html>Minimum stay of 2 Nights. Rate includes WiFi facility. 2 double bed with sea facing view and automatic ventilated air condition.Breakfast buffet is also available.<html> ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 492, 410, 80));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Rs. 17,500/-");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 140, -1));

        L_book2.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        L_book2.setText("Book Now");
        L_book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_book2ActionPerformed(evt);
            }
        });
        getContentPane().add(L_book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 120, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leela logo.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, -1, 110));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 232, 70, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 252, 300, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amenities.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 222, 230, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("*To see full view,click on picture.");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 236, -1));

        L_pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leela small 2.png"))); // NOI18N
        L_pic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_pic2ActionPerformed(evt);
            }
        });
        getContentPane().add(L_pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 220, 120));

        L_pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leela small 3.png"))); // NOI18N
        L_pic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_pic3ActionPerformed(evt);
            }
        });
        getContentPane().add(L_pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 220, 130));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grandfront1 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void L_book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_book1ActionPerformed
        BookingUI open = new BookingUI();
        open.setDetails_B(City, "The Leela Palace","52,,Andheri Kurla Road, Sahar, Marine Drive, Mumbai ", "Leela Standard Room", rooms, adults, childs, check_in, check_out, 9199);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_L_book1ActionPerformed

    private void L_pic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_pic1ActionPerformed
        L_pic1 open = new L_pic1();
        open.setVisible(true);
    }//GEN-LAST:event_L_pic1ActionPerformed

    private void L_book3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_book3ActionPerformed
        BookingUI open = new BookingUI();
        open.setDetails_B(City, "The Leela Palace","52,,Andheri Kurla Road, Sahar, Marine Drive, Mumbai ", "Leela Palace Room", rooms, adults, childs, check_in, check_out, 17500);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_L_book3ActionPerformed

    private void L_book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_book2ActionPerformed
        BookingUI open = new BookingUI();
        open.setDetails_B(City, "The Leela Palace","52,,Andheri Kurla Road, Sahar, Marine Drive, Mumbai ", "Leela Suite Room", rooms, adults, childs, check_in, check_out, 12090);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_L_book2ActionPerformed

    private void L_pic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_pic2ActionPerformed
        L_pic2 open = new L_pic2();
        open.setVisible(true);
    }//GEN-LAST:event_L_pic2ActionPerformed

    private void L_pic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_pic3ActionPerformed
        L_pic3 open = new L_pic3();
        open.setVisible(true);
    }//GEN-LAST:event_L_pic3ActionPerformed

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
            java.util.logging.Logger.getLogger(LeelaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeelaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeelaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeelaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeelaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton L_book1;
    private javax.swing.JButton L_book2;
    private javax.swing.JButton L_book3;
    private javax.swing.JButton L_pic1;
    private javax.swing.JButton L_pic2;
    private javax.swing.JButton L_pic3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
