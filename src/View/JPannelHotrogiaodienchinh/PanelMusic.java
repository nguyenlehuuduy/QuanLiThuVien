/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.JPannelHotrogiaodienchinh;

import jaco.mp3.player.MP3Player;
import jaco.mp3.player.i;
import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class PanelMusic extends javax.swing.JPanel {

    public File file = null;
    public MP3Player x = null;    
    int musicDisplay = 1 ;
    public GiaiTri jframe = null ;
    public PanelMusic(JFrame jframe) {
        this.jframe = (GiaiTri) jframe ;
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

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\music.png")); // NOI18N
        jButton1.setText("Hãy Trao Cho Anh - Sơn Tùng");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 40));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\play-button.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 60, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased

    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //x.play();
        // x.play();
        //new MP3Player(new File("D:\\ApacheNetBean\\NetBeansProjects\\JavaSwing\\src\\EmDiXaNoiPhuongTroi.mp3")).play();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(musicDisplay ==1 ){
            jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\pause-button.png")); // NOI18N
            x.play();
            musicDisplay = 0 ;

        }else{
            jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\MuSic\\play-button.png")); // NOI18N
            x.pause();
            musicDisplay = 1 ;
        }
        String label = jframe.labelImage ;
        System.out.print(label);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
