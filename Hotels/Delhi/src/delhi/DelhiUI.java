/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delhi;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author sanjeev
 */
public class DelhiUI extends javax.swing.JFrame { 
    
    
    public String check_in = "", check_out = "";
    public int rooms , adults , childs ;
    public void setDetails(int room, int adult,int child,Date c_in, Date c_out)
    {
        this.rooms = room;
        this.adults = adult;
        this.childs = child;
        DateFormat dt = new SimpleDateFormat("EEEE, dd MMM, yyyy");//converting date into string.
        this.check_in = dt.format(c_in);
        this.check_out = dt.format(c_out);
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
    
    
    public DelhiUI() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Taj_pic = new javax.swing.JButton();
        Hyatt_pic = new javax.swing.JButton();
        Leela_pic = new javax.swing.JButton();
        Radisson_pic = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JW_pic = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Taj_palace = new javax.swing.JButton();
        Hyatt_regency = new javax.swing.JButton();
        Leela_palace = new javax.swing.JButton();
        Radisson_blu = new javax.swing.JButton();
        JW_marriott = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gulim", 1, 48)); // NOI18N
        jLabel1.setText("DELHI");

        jLabel5.setFont(new java.awt.Font("Estrangelo Edessa", 0, 24)); // NOI18N
        jLabel5.setText("Rs. 6,531/- per night");

        jLabel6.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/5 stars.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Estrangelo Edessa", 0, 24)); // NOI18N
        jLabel8.setText("Rs. 7,625/-per night");

        Taj_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Taj Palace.jpg"))); // NOI18N

        Hyatt_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Hyatt Regency.jpg"))); // NOI18N

        Leela_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Leela Palace.jpg"))); // NOI18N
        Leela_pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leela_picActionPerformed(evt);
            }
        });

        Radisson_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/Radisson Blu.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Estrangelo Edessa", 0, 24)); // NOI18N
        jLabel4.setText("Rs. 10,500/- per night");

        jLabel12.setFont(new java.awt.Font("Estrangelo Edessa", 0, 24)); // NOI18N
        jLabel12.setText("Rs. 9,812/-per night");

        JW_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/JW Marriott.jpg"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel17.setText("Rs. 9,250/- per night");

        Taj_palace.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        Taj_palace.setText("Taj Palace");
        Taj_palace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Taj_palaceActionPerformed(evt);
            }
        });

        Hyatt_regency.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        Hyatt_regency.setText("Hyatt Regency");
        Hyatt_regency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hyatt_regencyActionPerformed(evt);
            }
        });

        Leela_palace.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        Leela_palace.setText("Leela Palace");
        Leela_palace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leela_palaceActionPerformed(evt);
            }
        });

        Radisson_blu.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        Radisson_blu.setText("Radisson Blu");
        Radisson_blu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radisson_bluActionPerformed(evt);
            }
        });

        JW_marriott.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        JW_marriott.setText("JW Marriott");
        JW_marriott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JW_marriottActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel2.setText("2 Sardar Patel Marg Diplomatic Enclave, New Delhi.");

        jLabel3.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel3.setText("Bhikaiji Cama Place, Ring Road New Delhi.");

        jLabel7.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel7.setText("Diplomatic Enclave, Chanakyapuri, New Delhi.");

        jLabel11.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel11.setText("National Highway – 8  Mahipalpur, Near I.G.I. Airport (T3), New Delhi.");

        jLabel16.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel16.setText("Asset Area 4 - Hospitality District, Delhi Aerocity  New Delhi.");

        jLabel19.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/5 stars.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/5 stars.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/5 stars.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delhi/Images/5 stars.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(260, 260, 260)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Taj_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Taj_palace)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5)))
                                        .addGap(69, 69, 69))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Leela_palace)
                                        .addGap(330, 330, 330)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Hyatt_regency)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                                        .addComponent(jLabel8))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Radisson_blu)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12))))
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel11)
                                            .addComponent(Radisson_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(2, 2, 2))
                                    .addComponent(Hyatt_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(Leela_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(JW_marriott)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17))))
                                .addComponent(JW_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Taj_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hyatt_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hyatt_regency)
                            .addComponent(Taj_palace)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Leela_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Radisson_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Leela_palace)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Radisson_blu)
                                .addComponent(jLabel12))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(JW_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JW_marriott)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Leela_picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leela_picActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leela_picActionPerformed

    private void Taj_palaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Taj_palaceActionPerformed
        Taj_PalaceUI open = new Taj_PalaceUI();
        open.setDetails(rooms, adults, childs, check_in, check_out);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_Taj_palaceActionPerformed

    private void Hyatt_regencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hyatt_regencyActionPerformed
        Hyatt_RegencyUI open = new Hyatt_RegencyUI();
        open.setDetails(rooms, adults, childs, check_in, check_out);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_Hyatt_regencyActionPerformed

    private void Leela_palaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leela_palaceActionPerformed
        Leela_PalaceUI open = new Leela_PalaceUI();
        open.setDetails(rooms, adults, childs, check_in, check_out);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_Leela_palaceActionPerformed

    private void Radisson_bluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radisson_bluActionPerformed
        Radisson_BluUI open = new Radisson_BluUI();
        open.setDetails(rooms, adults, childs, check_in, check_out);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_Radisson_bluActionPerformed

    private void JW_marriottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JW_marriottActionPerformed
        JW_MarriottUI open = new JW_MarriottUI();
        open.setDetails(rooms, adults, childs, check_in, check_out);
        open.set_user_info(first_name, last_name, email_ID, mobile_no);
        open.setVisible(true);
    }//GEN-LAST:event_JW_marriottActionPerformed

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
            java.util.logging.Logger.getLogger(DelhiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelhiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelhiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelhiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelhiUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hyatt_pic;
    private javax.swing.JButton Hyatt_regency;
    private javax.swing.JButton JW_marriott;
    private javax.swing.JButton JW_pic;
    private javax.swing.JButton Leela_palace;
    private javax.swing.JButton Leela_pic;
    private javax.swing.JButton Radisson_blu;
    private javax.swing.JButton Radisson_pic;
    private javax.swing.JButton Taj_palace;
    private javax.swing.JButton Taj_pic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}