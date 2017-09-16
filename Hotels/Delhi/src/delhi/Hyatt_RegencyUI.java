/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delhi;
import booking.BookingUI;
import javax.swing.JOptionPane;
/**
 *
 * @author sanjeev
 */
public class Hyatt_RegencyUI extends javax.swing.JFrame {

    String City = "Delhi";
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
    
    public Hyatt_RegencyUI() {
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
        h_pic1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        H_book1 = new javax.swing.JButton();
        h_pic2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        H_book2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        h_pic3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        H_book3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Hyatt Regency logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hyatt Regency");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 29, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bhikaiji Cama Place, Ring Road New Delhi.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 90, -1, -1));

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hyatt Guest Twin Room ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 120, -1, -1));

        h_pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/hr small 1.png"))); // NOI18N
        h_pic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_pic1ActionPerformed(evt);
            }
        });
        getContentPane().add(h_pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 120, 224, 122));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hot & Cold Running Water and complementary WiFi.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 151, 432, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rs. 7625/-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 187, -1, -1));

        H_book1.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        H_book1.setText("Book Now");
        H_book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_book1ActionPerformed(evt);
            }
        });
        getContentPane().add(H_book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 120, -1));

        h_pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/hr small 2.png"))); // NOI18N
        h_pic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_pic2ActionPerformed(evt);
            }
        });
        getContentPane().add(h_pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 272, 224, 129));

        jLabel8.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hyatt Guest Room King With Breakfast");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 272, 432, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>Breakfast, WiFi, Air conditioning, Mineral Water, Electronic safe, 24-hr Room Service, Telephone, Bathroom, Tea/Coffee maker, Iron/Ironing Board, Hot & Cold Running Water, Cribs, Newspaper, Television, Minibar, Bathrobe, WiFi Internet, Desk, Hair Dryer.</html>");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 462, 432, 58));

        H_book2.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        H_book2.setText("Book Now");
        H_book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_book2ActionPerformed(evt);
            }
        });
        getContentPane().add(H_book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rs. 9375/-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 526, -1, -1));

        h_pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/hr small 3.png"))); // NOI18N
        h_pic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_pic3ActionPerformed(evt);
            }
        });
        getContentPane().add(h_pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 431, 224, 129));

        jLabel10.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hyatt View King Room With Breakfast");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 431, 432, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("<html>Breakfast, WiFi, Air conditioning, Mineral Water, Electronic safe, 24-hr Room Service, Telephone, Bathroom, Tea/Coffee maker, Iron/Ironing Board, Hot & Cold Running Water, Cribs, Newspaper, Television, Minibar, Bathrobe, WiFi Internet, Desk, Hair Dryer.</html>");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 305, 432, 58));

        H_book3.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        H_book3.setText("Book Now");
        H_book3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_book3ActionPerformed(evt);
            }
        });
        getContentPane().add(H_book3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 528, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rs. 8375/-");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 372, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Amenities");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 164, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Amenities.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 213, 366, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html> Books/Magazines, Turkish/Steam Bath, <br> Free WiFi Internet, Free WiFi Internet(Lobby), <br> Heated Pool, Outdoor Pool (seasonal), <br> Swimming Pool, 24 Hour Check in-Icon <br> Parking (Paid), Bakery, <br> Café, Restaurant, Bar <br> Poolside bar, Restaurant/Bar <br> Gymnasium/Health Club, Body treatments <br> Hot Spring Bath, Hot Tub <br> Sauna,  Spa, Spa tub <br> Ballroom, Banquet facilities and more. <html>");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 340, 366, 230));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("* To see full view of room click on picture");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 230, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Back hyatt.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1260, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void h_pic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_pic1ActionPerformed
        H_pic1 open = new H_pic1();
        open.setVisible(true);
    }//GEN-LAST:event_h_pic1ActionPerformed

    private void h_pic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_pic2ActionPerformed
        H_pic2 open = new H_pic2();
        open.setVisible(true);
    }//GEN-LAST:event_h_pic2ActionPerformed

    private void h_pic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_pic3ActionPerformed
        H_pic3 open = new H_pic3();
        open.setVisible(true);
    }//GEN-LAST:event_h_pic3ActionPerformed

    private void H_book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_book1ActionPerformed
        BookingUI open = new BookingUI();
        open.setVisible(true);
        open.setDetails_B(City, "Hyatt Regency","Bhikaiji Cama Place, Ring Road New Delhi.", "Hyatt Guest Twin Room ", rooms, adults, childs, check_in, check_out, 7625);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
    }//GEN-LAST:event_H_book1ActionPerformed

    private void H_book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_book2ActionPerformed
        BookingUI open = new BookingUI();
        open.setVisible(true);
        open.setDetails_B(City, "Hyatt Regency","Bhikaiji Cama Place, Ring Road New Delhi.", "Hyatt Guest Room King With Breakfast", rooms, adults, childs, check_in, check_out, 8375);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
    }//GEN-LAST:event_H_book2ActionPerformed

    private void H_book3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_book3ActionPerformed
        BookingUI open = new BookingUI();
        open.setVisible(true);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setDetails_B(City, "Hyatt Regency","Bhikaiji Cama Place, Ring Road New Delhi.", "Hyatt View King Room With Breakfast", rooms, adults, childs, check_in, check_out, 9375);
    }//GEN-LAST:event_H_book3ActionPerformed

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
            java.util.logging.Logger.getLogger(Hyatt_RegencyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hyatt_RegencyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hyatt_RegencyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hyatt_RegencyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hyatt_RegencyUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton H_book1;
    private javax.swing.JButton H_book2;
    private javax.swing.JButton H_book3;
    private javax.swing.JButton h_pic1;
    private javax.swing.JButton h_pic2;
    private javax.swing.JButton h_pic3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
