/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.DangNhapDangKy;

import Model.DangNhapCode;
import Control.KetNoiCSDLDangNhap;
import java.lang.Boolean ;
import static java.nio.file.Files.list;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */

public class TaoTaiKhoan extends javax.swing.JFrame {

    private ArrayList<DangNhapCode> list ;
  
    public TaoTaiKhoan() {
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

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTenDangNhap = new javax.swing.JTextField();
        jTextFieldQueQuan = new javax.swing.JTextField();
        jTextFieldHoVaTen = new javax.swing.JTextField();
        jTextFieldNgaySinh = new javax.swing.JTextField();
        jTextFieldDienThoai = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPasswordFieldNhapLaiMatKhau = new javax.swing.JPasswordField();
        jPasswordFieldMatKhau = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao Diện Tạo Tài Khoản");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tạo Tài Khoản Thư Viện Của Bạn");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tên Đăng Nhập ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mật Khẩu ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nhập Lại Mật Khẩu ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Họ và Tên ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        buttonGroup1.add(jRadioButtonNam);
        jRadioButtonNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButtonNam.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNam.setText("Nam ");
        jRadioButtonNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNamActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        buttonGroup1.add(jRadioButtonNu);
        jRadioButtonNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButtonNu.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNu.setText("Nữ");
        jPanel1.add(jRadioButtonNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Giới Tính ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Email ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Điện Thoại ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ngày Sinh ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Quê Quán ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jTextFieldTenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTenDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 72, 210, -1));
        jPanel1.add(jTextFieldQueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 210, -1));
        jPanel1.add(jTextFieldHoVaTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 210, -1));
        jPanel1.add(jTextFieldNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 210, -1));
        jPanel1.add(jTextFieldDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 210, -1));
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 210, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("( ví dụ : Nguyenlehuuduy ) ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 66, 150, 30));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("( dễ nhớ và ít nhất 6 ký tự ) ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("( gõ lại để tránh nhầm lẫn ) ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 150, 20));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("( ví dụ : 09/09/2002)");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 260, 120, 40));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("(ví dụ : 0987654321 )");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 130, 20));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("(ví dụ : nlhduy.20it7@vku.udn.vn)");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 220, 40));

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Chấp nhận điều khoản sử dụng ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 210, 30));

        jButton1.setBackground(new java.awt.Color(60, 63, 65));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\JavaSwing\\src\\com\\nguyenlehuuduy\\image\\Add.png")); // NOI18N
        jButton1.setText("Đăng Ký ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, 30));
        jPanel1.add(jPasswordFieldNhapLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, 20));
        jPanel1.add(jPasswordFieldMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 112, 210, -1));

        jButton2.setBackground(new java.awt.Color(51, 0, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\JavaSwing\\src\\com\\nguyenlehuuduy\\image\\Refresh.png")); // NOI18N
        jButton2.setText("Quay Lại");
        jButton2.setActionCommand("Quay lại ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        list = new KetNoiCSDLDangNhap().LayThongTin();
        
        if(jTextFieldTenDangNhap.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập không được để trống ");
            return ;
        }
        String kiemtra = "[0-9a-zA-Z]+";
        if(!jTextFieldTenDangNhap.getText().matches(kiemtra)){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập bắt buộc là chữ cái không dấu , và không có dấu cách !!! ");
            return;
        }      
        
        boolean tendangnhap = false ;
        for(int i = 0; i < list.size(); i++) {
            DangNhapCode s = list.get(i);
            if (s.getTenDangNhap()== jTextFieldTenDangNhap.getText()) {
                tendangnhap = true;
            }
        }
        
        if(tendangnhap){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập đã có rồi , mời bạn nhập 1 tên đăng nhập khác");
            return;
        }
        
        
        if(jPasswordFieldMatKhau.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Mật khẩu không được bỏ trống");
            return ;
        }
        String matkhau = "[0-9a-zA-Z]{6,15}+";
        if(!jPasswordFieldMatKhau.getText().matches(matkhau)){          
            JOptionPane.showMessageDialog(this,"Mật khẩu có thể là số và chữ (không dấu) , và không có dấu cách từ 0-15 kí tự");
            return;
        }
        
//        if(jPasswordFieldNhapLaiMatKhau.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Nhập lại mật khẩu không được bỏ trống");
//           return ;
//        }    
//        String matkhau1 = "[0-9a-zA-Z]{6,15}+";
//        if(!jPasswordFieldNhapLaiMatKhau.getText().matches(matkhau1)){          
//            JOptionPane.showMessageDialog(this,"Mật khẩu có thể là số và chữ (không dấu) , và không có dấu cách ");
//            return;
//        }
        if(!jPasswordFieldMatKhau.getText().equals(jPasswordFieldNhapLaiMatKhau.getText())){
            JOptionPane.showMessageDialog(this,"Nhập lại mật khẩu không giống nhau !!! hãy nhập lại");
            return ;
        }

        if(jTextFieldHoVaTen.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Họ và tên không được để trống");
            return;
        }
        
        if(jTextFieldNgaySinh.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ngày sinh không được để trống");
            return;
        }
        String ngaysinh = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if(!jTextFieldNgaySinh.getText().matches(ngaysinh)){
            JOptionPane.showMessageDialog(this, " Ngày sinh nhập không đúng cú pháp");
            return ;
        }
        
        if(jTextFieldDienThoai.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Số điện thoại không được để trống");
            return;
        }
        String sdt = "[0-9]{10}";
        if(!jTextFieldDienThoai.getText().matches(sdt)){
            JOptionPane.showMessageDialog(this,"Số điện thoại nhập không đúng cú pháp");
            return ;
        }
        
        if(jTextFieldEmail.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Email không được để trống");
         return;
        }  
        String email = "[0-9a-zA-Z.-_]+@vku.udn.vn";
        if(!jTextFieldEmail.getText().matches(email)){
            JOptionPane.showMessageDialog(this,"Email bạn đã nhập sai cú pháp");
            return;
        }
        
        if(jTextFieldQueQuan.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Quê quán không được bỏ trống");
            return;
        }
        
//        if(jTextFieldQueQuan.getText().equals(""){
//            JOptionPane.showMessageDialog(this,"Quê quán không được bỏ trống");
//            return;
//        }       
        
        DangNhapCode x = new DangNhapCode();
        x.setTenDangNhap(jTextFieldTenDangNhap.getText());
        x.setMatKhau(String.valueOf(jPasswordFieldMatKhau.getPassword()));
        x.setHoVaTen(jTextFieldHoVaTen.getText());
        if(jRadioButtonNam.isSelected()){
            x.setGioiTinh("Nam");
        }
        if(jRadioButtonNu.isSelected()){
            x.setGioiTinh("Nữ");
        }
        x.setNgaySinh(jTextFieldNgaySinh.getText());
        x.setDienThoai(jTextFieldDienThoai.getText());
        x.setEmail(jTextFieldEmail.getText());
        x.setQueQuan(jTextFieldQueQuan.getText());
        
        try {
            if(new KetNoiCSDLDangNhap().ThemTaiKhoan(x)){
                JOptionPane.showMessageDialog(rootPane, "Đăng kí tài khoản thành công ");
                setVisible(false);
                new DangNhap().setVisible(true);
            }
                } catch (SQLException ex) {
            Logger.getLogger(TaoTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNamActionPerformed
            if(jRadioButtonNam.isSelected())
            {
                jRadioButtonNu.setSelected(false);
            }
    }//GEN-LAST:event_jRadioButtonNamActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldTenDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTenDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTenDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldMatKhau;
    private javax.swing.JPasswordField jPasswordFieldNhapLaiMatKhau;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JTextField jTextFieldDienThoai;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHoVaTen;
    private javax.swing.JTextField jTextFieldNgaySinh;
    private javax.swing.JTextField jTextFieldQueQuan;
    private javax.swing.JTextField jTextFieldTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
