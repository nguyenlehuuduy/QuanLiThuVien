
package View.GiaoDienChinh;

import View.JPannelHotrogiaodienchinh.MuonsachJPanel;
import View.JPannelHotrogiaodienchinh.ThongKeJPanel;
import View.JPannelHotrogiaodienchinh.XuLiVIPhamJPanel;
import View.JPannelHotrogiaodienchinh.GiaoDienChinhJPanel;
import View.JPannelHotrogiaodienchinh.HoTroThamKhao;
import View.JPannelHotrogiaodienchinh.TheDocGia;
import View.JPannelHotrogiaodienchinh.TrasahJPanel;
import View.JPannelHotrogiaodienchinh.SachJPanel;
import View.JPannelHotrogiaodienchinh.TroGiupJpanel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GiaoDienChinh extends javax.swing.JFrame {


    public GiaoDienChinh() {
        initComponents();
        BatDau();
    }

    public void BatDau(){
        GiaoDienChinhJPanel x = new GiaoDienChinhJPanel() ;
        x.setBounds(0,0,1200,749);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonSach = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonXuLi = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelLamViec = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao Diện Chính");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSach.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSach.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSach.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\tralai-book.png")); // NOI18N
        jButtonSach.setText("Sách");
        jButtonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSachActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\student-card.png")); // NOI18N
        jButton2.setText("Thẻ Sinh Viên");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\open-book.png")); // NOI18N
        jButton3.setText("Mượn Sách");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 140, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\open-book (1).png")); // NOI18N
        jButton4.setText("Trả Sách");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 140, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\thongke.png")); // NOI18N
        jButton5.setText("Thống Kê");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 150, 40));

        jButtonXuLi.setBackground(new java.awt.Color(0, 0, 0));
        jButtonXuLi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonXuLi.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXuLi.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\report.png")); // NOI18N
        jButtonXuLi.setText("Xử Lí ");
        jButtonXuLi.setToolTipText("");
        jButtonXuLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuLiActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonXuLi, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 0, 150, 40));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\help.png")); // NOI18N
        jButton7.setText("Trợ Giúp ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 150, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhDanhMucTraSach\\repair.png")); // NOI18N
        jButton1.setText("Tham Khảo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        javax.swing.GroupLayout jPanelLamViecLayout = new javax.swing.GroupLayout(jPanelLamViec);
        jPanelLamViec.setLayout(jPanelLamViecLayout);
        jPanelLamViecLayout.setHorizontalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanelLamViecLayout.setVerticalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelLamViec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSachActionPerformed
        SachJPanel x = null ;
        try{
            x= new SachJPanel();
    
        } catch (Exception ex) {
            Logger.getLogger(GiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }

        x.setBounds(0,0,1200,710);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonSachActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
       TheDocGia x = null ;
       try{
            x= new TheDocGia();
            
        } catch (Exception ex) {
            Logger.getLogger(GiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
       x.setBounds(0, 0, 1200 , 710);
       jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MuonsachJPanel x = null ;
        try {
            x = new MuonsachJPanel();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        x.setBounds(0,0,1200, 710);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TrasahJPanel x = null;
        try {
            x = new TrasahJPanel();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        x.setBounds(0,0,1200,710);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ThongKeJPanel x = new ThongKeJPanel();
       x.setBounds(0,0,1200,710);
       jPanelLamViec.removeAll();
       jPanelLamViec.add(x);
       jPanelLamViec.validate();
       jPanelLamViec.repaint();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonXuLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuLiActionPerformed
        XuLiVIPhamJPanel x = null;
        try {
            x = new  XuLiVIPhamJPanel(this);         
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        x.setBounds(0,0,1200,710);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonXuLiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        TroGiupJpanel x = new TroGiupJpanel();
        x.setBounds(0,0,1200,710);
            jPanelLamViec.removeAll();
            jPanelLamViec.add(x);
            jPanelLamViec.validate();
            jPanelLamViec.repaint();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            HoTroThamKhao x = new HoTroThamKhao();
            x.setBounds(0,0,1200,710);
            jPanelLamViec.removeAll();
            jPanelLamViec.add(x);
            jPanelLamViec.validate();
            jPanelLamViec.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonSach;
    private javax.swing.JButton jButtonXuLi;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanelLamViec;
    // End of variables declaration//GEN-END:variables
}
