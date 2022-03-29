/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.JPannelHotrogiaodienchinh;

import Model.TheDocGiaCode;
import static View.GiaoDienChinh.GiaoDienChinh.jPanelLamViec;
import Control.KetNoiCSDLTheDocGia;
import java.awt.Color;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class TheDocGia extends javax.swing.JPanel {

    private ArrayList<TheDocGiaCode> list;
    private DefaultTableModel model;

    public TheDocGia() throws Exception {
        initComponents();
        model = (DefaultTableModel) jTableTheDocGia.getModel();
        list = new KetNoiCSDLTheDocGia().LayThongTin();
        for (int i = 0; i < list.size(); i++) {
            TheDocGiaCode x = list.get(i);
            model.addRow(new Object[]{
                x.getMaThe(), x.getTenDocGia(), x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getDienThoai(), x.getNgaytao(), x.getNgayHetHan()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        JButtonxoa = new javax.swing.JButton();
        jButtonTaiLai = new javax.swing.JButton();
        jButtonIn = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1MaThe = new javax.swing.JLabel();
        jLabelGioITinh = new javax.swing.JLabel();
        jLabelNgaySinh = new javax.swing.JLabel();
        jTextFieldMathe = new javax.swing.JTextField();
        jLabelDiaChi = new javax.swing.JLabel();
        jLabelNgayTao = new javax.swing.JLabel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        jLabelDienThoai = new javax.swing.JLabel();
        jTextFieldDiaChi = new javax.swing.JTextField();
        jLabelTenDocGia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldNgayTao = new javax.swing.JTextField();
        jTextFieldDienThoai = new javax.swing.JTextField();
        jTextFieldTenDocGia = new javax.swing.JTextField();
        jTextFieldNgaySinh = new javax.swing.JTextField();
        jTextFieldNgayhethan1 = new javax.swing.JTextField();
        jLabelNgayHetHan1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTheDocGia = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonTimKiem = new javax.swing.JButton();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabelNu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonDoiMau = new javax.swing.JButton();
        jButtonnenTrang = new javax.swing.JButton();
        jButtonnenden = new javax.swing.JButton();
        jLabelnen = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Danh mục thẻ độc giả");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\student.png")); // NOI18N
        jLabel2.setText("DANH MỤC THẺ ĐỘC GIẢ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 630, 60));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 640, 20));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Xử Lí ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 50));

        jButtonThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonThem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonThem.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\add.png")); // NOI18N
        jButtonThem.setText("Thêm ");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 50));

        jButtonSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSua.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSua.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\tralai-book.png")); // NOI18N
        jButtonSua.setText("Sửa");
        jButtonSua.setActionCommand("Sửa ");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 140, 100, 50));

        JButtonxoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JButtonxoa.setForeground(new java.awt.Color(0, 0, 0));
        JButtonxoa.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\delete.png")); // NOI18N
        JButtonxoa.setText("Xóa");
        JButtonxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonxoaActionPerformed(evt);
            }
        });
        jPanel3.add(JButtonxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 50));

        jButtonTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTaiLai.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTaiLai.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\repair.png")); // NOI18N
        jButtonTaiLai.setText("Tải Lại");
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 50));

        jButtonIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonIn.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIn.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\in.png")); // NOI18N
        jButtonIn.setText("In");
        jButtonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 50));

        jButtonThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonThoat.setForeground(new java.awt.Color(0, 0, 0));
        jButtonThoat.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\exit.png")); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Thông Tin Độc Giả");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mã Thẻ ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giới Tính ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Ngày Sinh ");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 60, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Địa Chỉ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ngày Tạo ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ngày hết hạn");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jRadioButton1.setText("Nam");
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        jRadioButton2.setText("Nữ");
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 20));
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, -1));
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, -1));
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 180, -1));
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, -1));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Điện Thoại");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tên Độc Giả");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 400));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 290, 390));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 470));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Thông Tin Độc Giả");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel1MaThe.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1MaThe.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1MaThe.setText("Mã Thẻ ");
        jPanel6.add(jLabel1MaThe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabelGioITinh.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelGioITinh.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGioITinh.setText("Giới Tính ");
        jPanel6.add(jLabelGioITinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 40));

        jLabelNgaySinh.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelNgaySinh.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNgaySinh.setText("Ngày Sinh ");
        jPanel6.add(jLabelNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jTextFieldMathe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldMathe.setToolTipText("Mã Thẻ Chỉ gồm chữ số\n");
        jTextFieldMathe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatheActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldMathe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 30));

        jLabelDiaChi.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelDiaChi.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDiaChi.setText("Địa Chỉ");
        jPanel6.add(jLabelDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabelNgayTao.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelNgayTao.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNgayTao.setText("Ngày Tạo ");
        jPanel6.add(jLabelNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        buttonGroup1.add(jRadioButtonNam);
        jRadioButtonNam.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jRadioButtonNam.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNam.setText("Nam");
        jRadioButtonNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNamActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButtonNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 20));

        buttonGroup1.add(jRadioButtonNu);
        jRadioButtonNu.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jRadioButtonNu.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNu.setText("Nữ");
        jRadioButtonNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNuActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButtonNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, 20));

        jLabelDienThoai.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDienThoai.setText("Điện Thoại");
        jPanel6.add(jLabelDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        jTextFieldDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel6.add(jTextFieldDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 200, 30));

        jLabelTenDocGia.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelTenDocGia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTenDocGia.setText("Tên Độc Giả");
        jPanel6.add(jLabelTenDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã thẻ", "Tên Độc Giả", "Giới tính", "Ngày Sinh", "Địa Chỉ", "Điện Thoại", "Ngày Đăng Kí", "Ngày Hết Hạn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 650, 390));

        jTextFieldNgayTao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldNgayTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNgayTaoActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 200, 30));

        jTextFieldDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel6.add(jTextFieldDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 200, 30));

        jTextFieldTenDocGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel6.add(jTextFieldTenDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 30));

        jTextFieldNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel6.add(jTextFieldNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, 30));

        jTextFieldNgayhethan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldNgayhethan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNgayhethan1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldNgayhethan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 200, 30));

        jLabelNgayHetHan1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelNgayHetHan1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNgayHetHan1.setText("Ngày hết hạn");
        jPanel6.add(jLabelNgayHetHan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 350, 470));

        jTableTheDocGia.setBackground(new java.awt.Color(153, 153, 153));
        jTableTheDocGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTableTheDocGia.setForeground(new java.awt.Color(0, 0, 0));
        jTableTheDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thẻ", "Tên Độc Giả", "Giới tính", "Ngày Sinh", "Địa Chỉ", "Điện Thoại", "Ngày Đăng Kí", "Ngày Hết Hạn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTheDocGia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTheDocGia.setShowGrid(true);
        jTableTheDocGia.getTableHeader().setReorderingAllowed(false);
        jTableTheDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTheDocGiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTheDocGia);
        if (jTableTheDocGia.getColumnModel().getColumnCount() > 0) {
            jTableTheDocGia.getColumnModel().getColumn(0).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(1).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(2).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(3).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(4).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(5).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(6).setResizable(false);
            jTableTheDocGia.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 670, 570));

        jLabel25.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\student-card.png")); // NOI18N
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, -10, 210, 150));
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Tìm Kiếm ");
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Tìm Kiếm ");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Tìm Kiếm ");
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 30));

        jButtonTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTimKiem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTimKiem.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhTheDocGia\\timkiem.png")); // NOI18N
        jButtonTimKiem.setText("Tìm Kiếm ");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 40));

        jTextFieldTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 250, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 500, 60));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Tìm Kiếm ");
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 30));
        add(jLabelNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 350, 470));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDoiMau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDoiMau.setText("Đổi Màu");
        jButtonDoiMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoiMauActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDoiMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        jButtonnenTrang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonnenTrang.setText("Nền Trắng");
        jButtonnenTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnenTrangActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonnenTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 30));

        jButtonnenden.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonnenden.setText("Nền Đen");
        jButtonnenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnendenActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonnenden, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 90));

        jLabelnen.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelnen.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhMuonSach\\den.jpg")); // NOI18N
        add(jLabelnen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldMatheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatheActionPerformed

    }//GEN-LAST:event_jTextFieldMatheActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        if (jTextFieldMathe.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã Thẻ Không được để trống");
            return;
        }
        try {
            Integer.parseInt(jTextFieldMathe.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã Thẻ bắt buộc phải là chữ số ");
            return;
        }

        boolean KiemTraMaThe = false;
        for (int i = 0; i < list.size(); i++) {
            TheDocGiaCode thedocgia = list.get(i);
            if (thedocgia.getMaThe() == Integer.parseInt(jTextFieldMathe.getText())) {
                KiemTraMaThe = true;
            }
        }
        if (KiemTraMaThe) {
            JOptionPane.showMessageDialog(this, "Mã Thẻ đã tồn tại");
            return;
        }
        String chucai = jTextFieldTenDocGia.getText();

        if (jTextFieldTenDocGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên thẻ độc không được để trống ");
            return;
        }
        try {
            jTextFieldTenDocGia.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tên độc giả bắt buộc là chữ cái");
        }

        if (jTextFieldNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống ");
            return;
        }
        String ngaySinh = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jTextFieldNgaySinh.getText().matches(ngaySinh)) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không đúng cú pháp");
            return;
        }
//        String dc = "[0-9a-zA-Z ]+" ;
//        if(!jTextFieldDiaChi.getText().matches(ngaySinh)){
//            JOptionPane.showMessageDialog(this, "Địa chỉ không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldDiaChi.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Địa chỉ không được để trống ");
//            return ;
//        }
        if (jTextFieldDiaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống ");
            return;
        }
        try {
            jTextFieldDiaChi.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Địa chỉ là chữ cái có thể kèm theo số");
        }

        if (jTextFieldDienThoai.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống ");
            return;
        }
        String Sdt = "[0-9]{9,10}";
        if (!jTextFieldDienThoai.getText().matches(Sdt)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng cú pháp");
            return;
        }

        if (jTextFieldNgayTao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống ");
            return;
        }
        String ngaytao = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jTextFieldNgayTao.getText().matches(ngaytao)) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không đúng cú pháp");
            return;
        }

        if (jTextFieldNgayhethan1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày hết hạn không được để trống ");
            return;
        }
        String ngayhethan = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jTextFieldNgayhethan1.getText().matches(ngayhethan)) {
            JOptionPane.showMessageDialog(this, "Ngày hết hạn không đúng cú pháp");
            return;
        }

        TheDocGiaCode x = new TheDocGiaCode();
        x.setMaThe(Integer.parseInt(jTextFieldMathe.getText()));
        x.setTenDocGia(jTextFieldTenDocGia.getText());
        if (jRadioButtonNam.isSelected()) {
            x.setGioiTinh("Nam");
        }
        if (jRadioButtonNu.isSelected()) {
            x.setGioiTinh("Nữ");
        }
        x.setDiaChi(jTextFieldDiaChi.getText());
        x.setNgaySinh(jTextFieldNgaySinh.getText());
        x.setDienThoai(jTextFieldDienThoai.getText());
        x.setNgaytao(jTextFieldNgayTao.getText());
        x.setNgayHetHan(jTextFieldNgayhethan1.getText());

        try {
            if (new KetNoiCSDLTheDocGia().Them(x)) {
                JOptionPane.showMessageDialog(this, "Thêm Thành Công ");
                model.addRow(new Object[]{
                    x.getMaThe(), x.getTenDocGia(), x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getDienThoai(), x.getNgaytao(), x.getNgayHetHan()
                });
                TaiLai();
            }
        } catch (Exception ex) {
            Logger.getLogger(TheDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void JButtonxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonxoaActionPerformed

        int ret = JOptionPane.showConfirmDialog(this, "Bạn chắc chắc là mình muốn xóa ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            int index = jTableTheDocGia.getSelectedRow();
            int MaThe = Integer.parseInt(model.getValueAt(index, 0) + "");
            try {
                if (new KetNoiCSDLTheDocGia().Xoa(MaThe)) {
                    JOptionPane.showMessageDialog(this, "Xóa Thành Công");
                    model.removeRow(index);
                    TaiLai();
                }
            } catch (Exception ex) {
                Logger.getLogger(TheDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Xóa Không Thành Công");
        }

    }//GEN-LAST:event_JButtonxoaActionPerformed
    void TaiLai() throws ClassNotFoundException, SQLException {
        jButtonThem.setEnabled(true);
        jTextFieldMathe.setText("");
        jTextFieldTenDocGia.setText("");
        jTextFieldNgaySinh.setText("");
        jTextFieldDiaChi.setText("");
        jTextFieldDienThoai.setText("");
        jTextFieldNgayTao.setText("");
        jTextFieldNgayhethan1.setText("");
        jTableTheDocGia.clearSelection();
    }

    int Random() {
        Random rd = new Random();
        int k = 100 + rd.nextInt(889);
        return k;
    }
    private void jRadioButtonNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNuActionPerformed

    private void jRadioButtonNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNamActionPerformed
        if (jRadioButtonNam.isSelected()) {
            jRadioButtonNu.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonNamActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed

//        if(jTextFieldMathe.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Mã Thẻ Không được để trống");
//            return ;
//        }
//        try {
//            Integer.parseInt(jTextFieldMathe.getText());
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Mã Thẻ bắt buộc phải là chữ số ");
//            return;
//        }
//        
//        boolean KiemTraMaThe = false ;
//        for(int i = 0 ; i <list.size() ; i++){
//            TheDocGiaCode thedocgia = list.get(i);
//            if(thedocgia.getMaThe() == Integer.parseInt(jTextFieldMathe.getText())){
//                KiemTraMaThe = true ;
//            }
//        }    
//        if(KiemTraMaThe){
//            JOptionPane.showMessageDialog(this,"Mã Thẻ đã tồn tại");
//            return ;
//        }
        String chucai = jTextFieldTenDocGia.getText();

        if (jTextFieldTenDocGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên thẻ độc không được để trống ");
            return;
        }
        try {
            jTextFieldTenDocGia.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tên độc giả bắt buộc là chữ cái");
        }

//        if (jTextFieldNgaySinh.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống ");
//            return;
//        }
//        String ngaySinh = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
//        if (!jTextFieldNgaySinh.getText().matches(ngaySinh)) {
//            JOptionPane.showMessageDialog(this, "Ngày sinh không đúng cú pháp");
//            return;
//        }
//        String dc = "[0-9a-zA-Z ]+" ;
//        if(!jTextFieldDiaChi.getText().matches(ngaySinh)){
//            JOptionPane.showMessageDialog(this, "Địa chỉ không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldDiaChi.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Địa chỉ không được để trống ");
//            return ;
//        }
        if (jTextFieldDiaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống ");
            return;
        }
        try {
            jTextFieldDiaChi.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Địa chỉ là chữ cái có thể kèm theo số");
        }

        if (jTextFieldDienThoai.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống ");
            return;
        }
        String Sdt = "[0-9]{9,10}";
        if (!jTextFieldDienThoai.getText().matches(Sdt)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng cú pháp");
            return;
        }

        if (jTextFieldNgayTao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống ");
            return;
        }
        String ngaytao = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jTextFieldNgayTao.getText().matches(ngaytao)) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không đúng cú pháp");
            return;
        }

        if (jTextFieldNgayhethan1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày hết hạn không được để trống ");
            return;
        }
        String ngayhethan = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jTextFieldNgayhethan1.getText().matches(ngayhethan)) {
            JOptionPane.showMessageDialog(this, "Ngày hết hạn không đúng cú pháp");
            return;
        }

        int index = jTableTheDocGia.getSelectedRow();
        TheDocGiaCode x = new TheDocGiaCode();
        x.setMaThe(Integer.parseInt(jTextFieldMathe.getText()));
        x.setTenDocGia(jTextFieldTenDocGia.getText());
        if (jRadioButtonNam.isSelected()) {
            x.setGioiTinh("Nam");
        }
        if (jRadioButtonNu.isSelected()) {
            x.setGioiTinh("Nữ");
        }
        x.setNgaySinh(jTextFieldNgaySinh.getText());
        x.setDiaChi(jTextFieldDiaChi.getText());
        x.setDienThoai(jTextFieldDienThoai.getText());
        x.setNgaytao(jTextFieldNgayTao.getText());
        x.setNgayHetHan(jTextFieldNgayhethan1.getText());

        try {
            if (new KetNoiCSDLTheDocGia().Sua(x)) {
                JOptionPane.showMessageDialog(this, "Sửa Thành Công ");
                model.setValueAt(x.getMaThe(), index, 0);
                model.setValueAt(x.getTenDocGia(), index, 1);
                model.setValueAt(x.getGioiTinh(), index, 2);
                model.setValueAt(x.getNgaySinh(), index, 3);
                model.setValueAt(x.getDiaChi(), index, 4);
                model.setValueAt(x.getDienThoai(), index, 5);
                model.setValueAt(x.getNgaytao(), index, 6);
                model.setValueAt(x.getNgayHetHan(), index, 7);
            }
            TaiLai();
        } catch (Exception ex) {
            Logger.getLogger(TheDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        GiaoDienChinhJPanel x = new GiaoDienChinhJPanel();
        x.setBounds(0, 0, 1200, 710);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Có phải bạn muốn tìm kiếm thông tin ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String timkiem = " ";
            timkiem = jTextFieldTimKiem.getText();
            try {
                timkiem = " MaThe ";
                list.clear();
                list = new KetNoiCSDLTheDocGia().TimKiemThongTin(timkiem);
                while (model.getRowCount() != 0) {
                    model.removeRow(0);
                }
                for (int i = 0; i < list.size(); i++) {
                    TheDocGiaCode x = list.get(i);
                    JOptionPane.showMessageDialog(this, "Tìm kiếm thông tin thành công ");
                    model.addRow(new Object[]{
                        x.getMaThe(), x.getTenDocGia(), x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getDienThoai(),
                        x.getNgaytao(), x.getNgayHetHan()
                    });
                }
            } catch (Exception ex) {
            }

        } else {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thông tin không thành công");
        }
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTableTheDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTheDocGiaMouseClicked
        jButtonThem.setEnabled(false);
        int index = jTableTheDocGia.getSelectedRow();
        jTextFieldMathe.setText(model.getValueAt(index, 0) + "");
        jTextFieldTenDocGia.setText(model.getValueAt(index, 1) + "");
        if ("Nam".equals(model.getValueAt(index, 2) + "")) {
            jRadioButtonNam.setSelected(true);
        } else {
            jRadioButtonNu.setSelected(true);
        }       
        jTextFieldNgaySinh.setText(model.getValueAt(index, 3) + ""); 
        
        jTextFieldDiaChi.setText(model.getValueAt(index, 4) + "");
        jTextFieldDienThoai.setText(model.getValueAt(index, 5) + "");
        jTextFieldNgayTao.setText(model.getValueAt(index, 6) + "");
        jTextFieldNgayhethan1.setText(model.getValueAt(index, 7) + "");

    }//GEN-LAST:event_jTableTheDocGiaMouseClicked

    private void jButtonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInActionPerformed
        MessageFormat header = new MessageFormat("Thẻ độc giả ");
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTableTheDocGia.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
    }//GEN-LAST:event_jButtonInActionPerformed

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        try {
            TaiLai();
        } catch (Exception ex) {
            Logger.getLogger(TheDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed

    private void jTextFieldTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTimKiemActionPerformed

    private void jTextFieldNgayhethan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNgayhethan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNgayhethan1ActionPerformed

    private void jTextFieldNgayTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNgayTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNgayTaoActionPerformed

    private void jButtonDoiMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoiMauActionPerformed
        Color color = JColorChooser.showDialog(this, "Chọn màu", Color.yellow);
        jTable1.setForeground(color);
        jPanel3.setForeground(color);
        jLabel1MaThe.setForeground(color);
        jLabelDiaChi.setForeground(color);
        jLabelDienThoai.setForeground(color);
        jLabelGioITinh.setForeground(color);
        jLabelNgayHetHan1.setForeground(color);
        jLabelNgaySinh.setForeground(color);
        jLabelNgayTao.setForeground(color);
        jLabelNu.setForeground(color);
        jLabelTenDocGia.setForeground(color);
        jTableTheDocGia.setForeground(color);
        jLabel2.setForeground(color);
        jRadioButtonNu.setForeground(color);
        jRadioButtonNam.setForeground(color);
//        jRadioButtonMa.setForeground(color);
//        jRadioButtonTen.setForeground(color);
        jButtonIn.setForeground(color);
        jButtonSua.setForeground(color);
        jButtonThem.setForeground(color);
        jButtonTaiLai.setForeground(color);
        jButtonTimKiem.setForeground(color);
        JButtonxoa.setForeground(color);
        jButtonThoat.setForeground(color);
        jButtonDoiMau.setForeground(color);
        jButtonnenden.setForeground(color);
        jButtonnenTrang.setForeground(color);
    }//GEN-LAST:event_jButtonDoiMauActionPerformed

    private void jButtonnenTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnenTrangActionPerformed
        jLabelnen.setVisible(false);
    }//GEN-LAST:event_jButtonnenTrangActionPerformed

    private void jButtonnendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnendenActionPerformed
        jLabelnen.setVisible(true);
    }//GEN-LAST:event_jButtonnendenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDoiMau;
    private javax.swing.JButton jButtonIn;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JButton jButtonnenTrang;
    private javax.swing.JButton jButtonnenden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1MaThe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDiaChi;
    private javax.swing.JLabel jLabelDienThoai;
    private javax.swing.JLabel jLabelGioITinh;
    private javax.swing.JLabel jLabelNgayHetHan1;
    private javax.swing.JLabel jLabelNgaySinh;
    private javax.swing.JLabel jLabelNgayTao;
    private javax.swing.JLabel jLabelNu;
    private javax.swing.JLabel jLabelTenDocGia;
    private javax.swing.JLabel jLabelnen;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTheDocGia;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldDiaChi;
    private javax.swing.JTextField jTextFieldDienThoai;
    private javax.swing.JTextField jTextFieldMathe;
    private javax.swing.JTextField jTextFieldNgaySinh;
    private javax.swing.JTextField jTextFieldNgayTao;
    private javax.swing.JTextField jTextFieldNgayhethan1;
    private javax.swing.JTextField jTextFieldTenDocGia;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables

    private Object KetNoiCSDLTheDocGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
