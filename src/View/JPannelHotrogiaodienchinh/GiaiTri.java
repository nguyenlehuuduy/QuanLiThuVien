/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.JPannelHotrogiaodienchinh;

import jaco.mp3.player.MP3Player;
import java.io.File;

/**
 *
 * @author ASUS
 */
public final class GiaiTri extends javax.swing.JFrame {

    /**
     * Creates new form GiaiTri
     */
    public GiaiTri() {
        initComponents();
        addMusic();
    }
    public static String labelImage = null ;
    public void addMusic() {
        String[] arr1 = {
            "Muộn Rồi Mà Sao Còn", "Hãy Trao Cho Anh", "Lời Yêu Ngây Dại", "Thằng Điên", "Ánh Chiều Tàn",
            "Đường Tôi Chở Em Về", "Hẹn Em Kiếp Sau", "Mình Anh Nơi Này",
            "THEPLAYAH", "Đồi Hoa Mặt Trời"
        };
        String[] arr2 = {
            "MuonRoiMaSaoCon", "HayTraoChoAnh", "LoiYeuNgayDai", "ThangDien", "AnhChieuTan", "DuongToiChoEmVe",
            "HenEmKiepSau", "EmDiXaNoiPhuongTroi", "SooBin", "NhungNuCuoiMinhUomTrongNang"
        };
        String[] arr3 = {
                "MuonRoiMaSaoCon", "HayTraoChoAnh", "LoiYeuNgayDai", "ThangDien", "AnhChieuTan", "DuongToiChoEmVe",
                "HenEmKiepSau", "EmDiXaNoiPhuongTroi", "ThePlayAH", "DoiHoaMatTroi"
                };
        for (int i = 0; i < 10; i++) {
            PanelMusic pm = new PanelMusic(this);
            pm.jButton1.setText(arr1[i]);
            pm.file = new File("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MP3\\" + arr2[i] + ".mp3");
            pm.x = new MP3Player(pm.file);
            jPanel.add(pm);
            labelImage = arr3[i];
            
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel = new javax.swing.JPanel();
        jPanelimg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giải Trí");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("THƯỞNG THỨC ÂM NHẠC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 650, 50));

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel.setBackground(new java.awt.Color(255, 255, 204));
        jPanel.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.setLayout(new javax.swing.BoxLayout(jPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 510, 550));

        jPanelimg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelimg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanelimg.add(jLabelimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 550));

        jPanel1.add(jPanelimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 630, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

        setSize(new java.awt.Dimension(1214, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        if(x.isPaused()){
//            x.pause();
//            x = new MP3Player(file);   
        // x.stop();
        // }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        if(musicDisplay ==1 ){
//            jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\pause-button.png")); // NOI18N
//            x.play();
//            musicDisplay = 0 ;
//
//        }else{
//            jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\play-button.png")); // NOI18N
//            x.pause();
//            musicDisplay = 1 ;
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //x.play();
        // x.play();
        //new MP3Player(new File("D:\\ApacheNetBean\\NetBeansProjects\\JavaSwing\\src\\EmDiXaNoiPhuongTroi.mp3")).play();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased

    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked
//    File file = new File("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\HayTraoChoAnh.mp3");
//    MP3Player x = new MP3Player(file);    
//    int musicDisplay = 1 ;
//    /**
//     * @param args the command line arguments
//     */

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
            java.util.logging.Logger.getLogger(GiaiTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaiTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaiTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaiTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GiaiTri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabelimg;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelimg;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}