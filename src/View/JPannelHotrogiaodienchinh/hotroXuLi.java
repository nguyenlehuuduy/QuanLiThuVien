/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.JPannelHotrogiaodienchinh;

import Model.XuLiCode;
import View.GiaoDienChinh.GiaoDienChinh;
import Control.KetNoiCSDLXuLi;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class hotroXuLi extends javax.swing.JDialog {

    private GiaoDienChinh home;
    private XuLiVIPhamJPanel jpanel;
    private ArrayList<XuLiCode> list;

    public hotroXuLi(java.awt.Frame parent, javax.swing.JPanel panel, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (GiaoDienChinh) parent;
        parent = home;
        jpanel = (XuLiVIPhamJPanel) panel;
        list = jpanel.list;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTienPhat = new javax.swing.JTextField();
        jTextFieldMaViPham = new javax.swing.JTextField();
        jTextFieldMaTheDocGia = new javax.swing.JTextField();
        jTextFieldTenDocGia = new javax.swing.JTextField();
        jTextFieldTenSach = new javax.swing.JTextField();
        jTextFieldNgayMuon1 = new javax.swing.JTextField();
        jTextFieldNgayMat = new javax.swing.JTextField();
        jTextFieldLyDo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN XỬ LÍ VI PHẠM CÁ NHÂN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 550, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên Sách");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã vi phạm");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã thẻ độc giả");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tên độc giả");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lý do");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ngày Mượn");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ngày Mất");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tiền Phạt");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));
        jPanel2.add(jTextFieldTienPhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 210, 30));

        jTextFieldMaViPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaViPhamActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMaViPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 30));
        jPanel2.add(jTextFieldMaTheDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 30));
        jPanel2.add(jTextFieldTenDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 30));
        jPanel2.add(jTextFieldTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 30));
        jPanel2.add(jTextFieldNgayMuon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 30));
        jPanel2.add(jTextFieldNgayMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, 30));
        jPanel2.add(jTextFieldLyDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 210, 30));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhXuLiThongTinViPham\\add.png")); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 140, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhMuonSach\\den.jpg")); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMaViPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaViPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaViPhamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        XuLiCode x = new XuLiCode();

        if (jTextFieldMaViPham.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã vi phạm không được để trống");
            return;
        }
        try {
            Integer.parseInt(jTextFieldMaViPham.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mã vi phạm bắt buộc là chữ số ");
            return;
        }

        boolean kiemtra = false;
        for (int i = 0; i < list.size(); i++) {
            XuLiCode s = list.get(i);
            if (s.getMaViPham() == Integer.parseInt(jTextFieldMaViPham.getText())) {
                kiemtra = true;
            }
        }
        if (kiemtra) {
            JOptionPane.showMessageDialog(this, "Mã vi phạm đã tồn tại !!");
            return;
        }

        if (jTextFieldMaTheDocGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã thẻ độc giả không được để trống");
            return;
        }
        try {
            Integer.parseInt(jTextFieldMaTheDocGia.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mã thẻ độc giả bắt buộc là chữ số ");
            return;
        }

        boolean kiemtra1 = false;
        for (int i = 0; i < list.size(); i++) {
            XuLiCode s = list.get(i);
            if (s.getMaTheDocGia() == Integer.parseInt(jTextFieldMaTheDocGia.getText())) {
                kiemtra1 = true;
            }
        }
        if (kiemtra1) {
            JOptionPane.showMessageDialog(this, "Mã thẻ độc giả !!");
            return;
        }
                    
        if (jTextFieldTenDocGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên độc giả không được để trống");
            return;
        }
        try {
            jTextFieldTenDocGia.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tên độc giả bắt đầu bằng chữ cái");
        }

        if (jTextFieldTenSach.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên sách không được để trống");
            return;
        }
        try {
            jTextFieldTenSach.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tên sách bắt đầu bằng chữ cái");
        }

        String ngaySinh = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jTextFieldNgayMuon1.getText().matches(ngaySinh)) {
            JOptionPane.showMessageDialog(this, "Ngày mượn không đúng cú pháp");
            return;
        }
        if (jTextFieldNgayMuon1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày mượn không được để trống ");
            return;
        }

        if (!jTextFieldNgayMat.getText().matches(ngaySinh)) {
            JOptionPane.showMessageDialog(this, "Ngày mất bạn nhập không đúng cú pháp");
            return;
        }
        if (jTextFieldNgayMat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày mất không được để trống");
        }

        if (jTextFieldLyDo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lý do không được để trống");
        }
        try {
            jTextFieldLyDo.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lý do là chữ cái và có thể là số ");
            return;
        }

        if (jTextFieldTienPhat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tiền Phạt không được để trống");
        }
        try {
            jTextFieldTienPhat.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiền Phạt là chữ cái và có thể là số ");
            return;
        }

        x.setMaViPham(Integer.parseInt(jTextFieldMaViPham.getText()));
        x.setMaTheDocGia(Integer.parseInt(jTextFieldMaTheDocGia.getText()));
        x.setTenDocGia(jTextFieldTenDocGia.getText());
        x.setTenSach(jTextFieldTenSach.getText());
        x.setNgayMuon(jTextFieldNgayMuon1.getText());
        x.setNgayMat(jTextFieldNgayMat.getText());
        x.setLyDo(jTextFieldLyDo.getText());
        x.setTienPhat(jTextFieldTienPhat.getText());

        try {
            if (new KetNoiCSDLXuLi().Them(x)) {
                JOptionPane.showMessageDialog(rootPane, " Thêm Thông Tin Vi Phạm Thành Công ");
                setVisible(false);
                jpanel.model.addRow(new Object[]{
                    x.getMaViPham(), x.getMaTheDocGia(), x.getTenDocGia(), x.getTenSach(), x.getNgayMuon(), x.getNgayMat(),
                    x.getLyDo(), x.getTienPhat()
                });
                new XuLiVIPhamJPanel(home).setVisible(true);
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            Logger.getLogger(hotroXuLi.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(hotroXuLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotroXuLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotroXuLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotroXuLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hotroXuLi dialog = new hotroXuLi(new javax.swing.JFrame(), new javax.swing.JPanel(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldLyDo;
    private javax.swing.JTextField jTextFieldMaTheDocGia;
    private javax.swing.JTextField jTextFieldMaViPham;
    private javax.swing.JTextField jTextFieldNgayMat;
    private javax.swing.JTextField jTextFieldNgayMuon1;
    private javax.swing.JTextField jTextFieldTenDocGia;
    private javax.swing.JTextField jTextFieldTenSach;
    private javax.swing.JTextField jTextFieldTienPhat;
    // End of variables declaration//GEN-END:variables
}
