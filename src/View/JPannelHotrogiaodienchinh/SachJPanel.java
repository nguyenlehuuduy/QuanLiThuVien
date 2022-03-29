package View.JPannelHotrogiaodienchinh;

import Model.SachCode;
import static View.GiaoDienChinh.GiaoDienChinh.jPanelLamViec;
import Control.KetNoiCSDLSach;
import Control.KetNoiCSDLSach;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.DangNhapDangKy.DangNhap;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import Control.KetNoiCSDLSach;
/**
 *
 * @author ASUS
 */
public class SachJPanel extends javax.swing.JPanel{

    ArrayList<SachCode> list;
    private DefaultTableModel model;
      
    public SachJPanel() throws ClassNotFoundException {
        String gender  ;
        String filename = null;
        byte[] person_image = null ;
        initComponents();
        list = new KetNoiCSDLSach().LayThongTin();
        model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < list.size(); i++) {
            SachCode x = list.get(i);
            model.addRow(new Object[]{
                x.getMasach(), x.getTensach(), x.getTheLoaiSach(), x.getTacGia(), x.getSoLuong(), x.getTinhTrang(),
                x.getNhaXuatBan(), x.getNamXB(), x.getTomTatNoiDung()
            });
        }
//        jTextFieldMaSach.setText(Random()+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNamXB = new javax.swing.JTextField();
        jTextFieldMaSach = new javax.swing.JTextField();
        jTextFieldTenSach = new javax.swing.JTextField();
        jTextFieldTheLoaiSach = new javax.swing.JTextField();
        jTextFieldTacGia = new javax.swing.JTextField();
        jTextFieldSoLuong = new javax.swing.JTextField();
        jTextFieldNhaXuatBan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTomTat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonThoat = new javax.swing.JButton();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonIn = new javax.swing.JButton();
        jButtonTaiLai = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldTinhTrang = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonMa = new javax.swing.JRadioButton();
        jRadioButtonTen = new javax.swing.JRadioButton();
        jButtonTimKiem = new javax.swing.JButton();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        ilb_img = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonDoiMau = new javax.swing.JButton();
        jButtonnenTrang = new javax.swing.JButton();
        jButtonnenden = new javax.swing.JButton();
        jLabelnen = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\icdocsach1.png")); // NOI18N
        jLabel1.setText("DANH MỤC THÔNG TIN SÁCH");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 690, 60));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 660, 10));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(60, 63, 65));
        jPanel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel3ComponentRemoved(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Thông Tin Sách");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mã Sách ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Số Lượng ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Năm XB ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tên Sách ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Thể Loại Sách ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tác Giả ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tình Trạng");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextFieldNamXB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldNamXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 200, -1));

        jTextFieldMaSach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaSachActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldMaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 200, -1));

        jTextFieldTenSach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, -1));

        jTextFieldTheLoaiSach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldTheLoaiSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, -1));

        jTextFieldTacGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 200, -1));

        jTextFieldSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSoLuongActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, -1));

        jTextFieldNhaXuatBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldNhaXuatBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 200, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tóm Tắt Nội Dung");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 130, -1));

        jTextFieldTomTat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldTomTat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 200, 50));

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Xử Lí ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, -1));

        jButtonThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonThoat.setForeground(new java.awt.Color(0, 0, 0));
        jButtonThoat.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\exit.png")); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 100, -1));

        jButtonThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonThem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonThem.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\add.png")); // NOI18N
        jButtonThem.setText("Thêm ");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jButtonSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSua.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSua.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\repair.png")); // NOI18N
        jButtonSua.setText("Sửa");
        jButtonSua.setActionCommand("Sửa ");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 100, -1));

        jButtonXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(0, 0, 0));
        jButtonXoa.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\delete.png")); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 100, -1));

        jButtonIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonIn.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIn.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\in.png")); // NOI18N
        jButtonIn.setText("In");
        jButtonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 90, -1));

        jButtonTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTaiLai.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTaiLai.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhThongTinSach\\tralai-book.png")); // NOI18N
        jButtonTaiLai.setText("Tải Lại");
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nhà Xuất Bản");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jTextFieldTinhTrang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jTextFieldTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, 590));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tìm Kiếm Thông Tin");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 200, -1));

        buttonGroup1.add(jRadioButtonMa);
        jRadioButtonMa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMa.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonMa.setText("Tìm Theo Mã Sách");
        jRadioButtonMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        buttonGroup1.add(jRadioButtonTen);
        jRadioButtonTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonTen.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonTen.setText("Tìm Theo Tên Sách");
        jRadioButtonTen.setToolTipText("");
        jRadioButtonTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTenActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jButtonTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTimKiem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTimKiem.setText("Tìm Kiếm ");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jTextFieldTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 200, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 430, 100));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, 180));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Thể Loại Sách", "Tác Giả", "Số Lượng", "Tình Trạng", "Nhà Xuất Bản", "Năm XB", "Tóm Tắt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setRowHeight(25);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 810, 470));
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 70));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\nensach.jpg")); // NOI18N
        ilb_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ilb_imgMouseClicked(evt);
            }
        });
        jPanel5.add(ilb_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 180));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 230, 180));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDoiMau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDoiMau.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDoiMau.setText("Đổi Màu");
        jButtonDoiMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoiMauActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDoiMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        jButtonnenTrang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonnenTrang.setForeground(new java.awt.Color(0, 0, 0));
        jButtonnenTrang.setText("Nền Trắng");
        jButtonnenTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnenTrangActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonnenTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 30));

        jButtonnenden.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonnenden.setForeground(new java.awt.Color(0, 0, 0));
        jButtonnenden.setText("Nền Đen");
        jButtonnenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnendenActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonnenden, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 90));

        jLabelnen.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhMuonSach\\den.jpg")); // NOI18N
        add(jLabelnen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));
        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSoLuongActionPerformed

    }//GEN-LAST:event_jTextFieldSoLuongActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Bạn chắc chắc là mình muốn xóa ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            int index = jTable1.getSelectedRow();
            int maSach = Integer.parseInt(model.getValueAt(index, 0) + "");
            try {
                if (new KetNoiCSDLSach().Xoa(maSach)) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    model.removeRow(index);
                    TaiLai();
                }
            } catch (Exception ex) {
                Logger.getLogger(SachJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Xóa Không thành công");
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButtonThem.setEnabled(false);
        int index = jTable1.getSelectedRow();
        jTextFieldMaSach.setText(model.getValueAt(index, 0) + "");
        String tenSach = model.getValueAt(index, 1) + "";
        jTextFieldTenSach.setText(model.getValueAt(index, 1) + "");
        jTextFieldTheLoaiSach.setText(model.getValueAt(index, 2) + "");
        jTextFieldTacGia.setText(model.getValueAt(index, 3) + "");
        jTextFieldSoLuong.setText(model.getValueAt(index, 4) + "");
        jTextFieldTinhTrang.setText(model.getValueAt(index, 5) + "");
        jTextFieldNhaXuatBan.setText(model.getValueAt(index, 6) + "");
        jTextFieldNamXB.setText(model.getValueAt(index, 7) + "");
        jTextFieldTomTat.setText(model.getValueAt(index, 8) + "");
        if(tenSach.equals("Đắc Nhân Tâm")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\DacNhanTam.jpg")); 
        }
        if(tenSach.equals("Đọc Vị Bất Kỳ Ai")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\DocViBatKyAi.jpg")); 
        }
        if(tenSach.equals("Java cơ bản")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\java.jpg")); 
        }
        if(tenSach.equals("Lập Trình C")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\C.jpg")); 
        }
        if(tenSach.equals("Cấu Trúc Dữ Liệu")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\cautrucdulieu.jpg")); 
        }
        if(tenSach.equals("Tiếng Anh")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\TiengAnh.jfif")); 
        }
        if(tenSach.equals("Sách HTML & CSS")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\html.jpg")); 
        }
        if(tenSach.equals("Sách JavaScript ")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\js.jpg")); 
        }
        if(tenSach.equals("Python")){
            ilb_img.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhSach\\python.jpg")); 
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed

        SachCode x = new SachCode();

        if (jTextFieldMaSach.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã Sách không được để trống !!!");
            return;
        }
        try {
            Integer.parseInt(jTextFieldMaSach.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mã sách bắt buộc phải là chữ số  !!!");
            return;
        }
        boolean kiemTraTrungMa = false;
        for (int i = 0; i < list.size(); i++) {
            SachCode s = list.get(i);
            if (s.getMasach() == Integer.parseInt(jTextFieldMaSach.getText())) {
                kiemTraTrungMa = true;
            }
        }
        if (kiemTraTrungMa) {
            JOptionPane.showMessageDialog(this, "Mã sách đã tồn tại ");
            return;
        }
//        String tensach = "[a-zA-Z ]+";
//        if(!jTextFieldTenSach.getText().matches(tensach)){
//            JOptionPane.showMessageDialog(this, "Tên sách không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTenSach.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Tên sách không được để trống ");
//            return ;
//        }
        if (jTextFieldTenSach.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên sách không được để trống ");
            return;
        }
        try {
            jTextFieldTenSach.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tên sách bắt buộc là chữ cái !!!");
            return;
        }
//        String theloaisach = "[0-9a-zA-Z ]+";
//        if(!jTextFieldTheLoaiSach.getText().matches(tensach)){
//            JOptionPane.showMessageDialog(this, "Thể loại sách không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTheLoaiSach.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Thể loại sách không được để trống ");
//            return ;
//        }

        if (jTextFieldTheLoaiSach.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Thể loại sách không được để trống ");
            return;
        }
        try {
            jTextFieldTheLoaiSach.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Thể loại sách bắt buộc là chữ cái !!!");
            return;
        }

//        String tacgia = "[a-zA-Z ]+";
//        if(!jTextFieldTacGia.getText().matches(tacgia)){
//            JOptionPane.showMessageDialog(this, "Tác giả sách không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTacGia.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Tác giả sách không được để trống ");
//            return ;
//        }
        if (jTextFieldTacGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tác giả sách không được để trống ");
            return;
        }
        try {
            jTextFieldTacGia.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tác giả sách bắt buộc là chữ cái !!!");
            return;
        }

        if (jTextFieldSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng sách không được để trống ");
            return;
        }
        try {
            Integer.parseInt(jTextFieldSoLuong.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng bắt buộc là chữ số !!!");
            return;
        }

        if (jTextFieldTinhTrang.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tình trạng sách không được để trống ");
            return;
        }
        try {
            jTextFieldTinhTrang.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tình trạng bắt buộc là chữ cái !!!");
            return;
        }

//        String tintrang = "[a-zA-Z]+";
//        if(!jTextFieldTinhTrang.getText().matches(tintrang)){
//            JOptionPane.showMessageDialog(this, "Tình trạng sách nhập vào không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTinhTrang.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Tình trạng sách không được để trống ");
//            return ;
//        }
        if(jTextFieldNhaXuatBan.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhà Xuất Bản sách không được để trống ");
            return ;
        }
        try {
            jTextFieldNhaXuatBan.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nhà xuất bản sách bắt buộc là chữ cái !!!");
            return;
        }
//        String nxb = "[a-zA-Z ]+";
//        if (!jTextFieldNhaXuatBan.getText().matches(nxb)) {
//            JOptionPane.showMessageDialog(this, "Nhà xuất bản sách nhập không đúng cú pháp");
//            return;
//        }
//        if (jTextFieldNhaXuatBan.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Nhà xuất bản sách không được để trống ");
//            return;
//        }

//        if(jTextFieldNamXB.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Năm Xuất Bản sách không được để trống ");
//            return ;
//        }
//        try {
//            Integer.parseInt(jTextFieldNhaXuatBan.getText());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Năm xuất bản sách bắt buộc là chữ số !!!");
//            return;
//        }
        if (jTextFieldNamXB.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản sách không được để trống ");
            return;
        }
        String namxb = "[0-9]{4}";
        if (!jTextFieldNamXB.getText().matches(namxb)) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản sách nhập không đúng cú pháp");
            return;
        }
        if (jTextFieldNamXB.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản sách không được để trống ");
            return;
        }

        if(jTextFieldTomTat.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Tóm tắt nội dung sách không được để trống ");
            return ;
        }
        try {
            jTextFieldTomTat.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tóm tắt nội dung sách có thể là chữ cái hoặc số !!!");
            return;
        }

        x.setMasach(Integer.parseInt(jTextFieldMaSach.getText()));
        x.setTensach(jTextFieldTenSach.getText());
        x.setSoLuong(Integer.parseInt(jTextFieldSoLuong.getText()));
        x.setNamXB(Integer.parseInt(jTextFieldNamXB.getText()));
        x.setNhaXuatBan(jTextFieldNhaXuatBan.getText());
        x.setTacGia(jTextFieldTacGia.getText());
        x.setTheLoaiSach(jTextFieldTheLoaiSach.getText());
        x.setTinhTrang(jTextFieldTinhTrang.getText());
        x.setTomTatNoiDung(jTextFieldTomTat.getText());
//        byte[] person_image = null ;
//        x.setPicture(person_image);
        try {
            if (new KetNoiCSDLSach().Them(x)) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                model.addRow(new Object[]{
                    x.getMasach(), x.getTensach(), x.getTheLoaiSach(), x.getTacGia(), x.getSoLuong(), x.getTinhTrang(),
                    x.getNhaXuatBan(), x.getNamXB(), x.getTomTatNoiDung() 
                });
                TaiLai();
            }
        } catch (Exception ex) {
            Logger.getLogger(SachJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
//        
//         if (jTextFieldMaSach.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Mã Sách không được để trống !!!");
//            return;
//        }
//        try {
//            Integer.parseInt(jTextFieldMaSach.getText());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Mã sách bắt buộc phải là chữ số  !!!");
//            return;
//        }
//        boolean kiemTraTrungMa = false;
//        for (int i = 0; i < list.size(); i++) {
//            SachCode s = list.get(i);
//            if (s.getMasach() == Integer.parseInt(jTextFieldMaSach.getText())) {
//                kiemTraTrungMa = true;
//            }
//        }
//        if (kiemTraTrungMa) {
//            JOptionPane.showMessageDialog(this, "Mã sách đã tồn tại ");
//            return;
//        }
//        String tensach = "[a-zA-Z ]+";
//        if(!jTextFieldTenSach.getText().matches(tensach)){
//            JOptionPane.showMessageDialog(this, "Tên sách không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTenSach.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Tên sách không được để trống ");
//            return ;
//        }
        if (jTextFieldTenSach.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên sách không được để trống ");
            return;
        }
        try {
            jTextFieldTenSach.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tên sách bắt buộc là chữ cái !!!");
            return;
        }
//        String theloaisach = "[0-9a-zA-Z ]+";
//        if(!jTextFieldTheLoaiSach.getText().matches(tensach)){
//            JOptionPane.showMessageDialog(this, "Thể loại sách không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTheLoaiSach.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Thể loại sách không được để trống ");
//            return ;
//        }

        if (jTextFieldTheLoaiSach.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Thể loại sách không được để trống ");
            return;
        }
        try {
            jTextFieldTheLoaiSach.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Thể loại sách bắt buộc là chữ cái !!!");
            return;
        }

//        String tacgia = "[a-zA-Z ]+";
//        if(!jTextFieldTacGia.getText().matches(tacgia)){
//            JOptionPane.showMessageDialog(this, "Tác giả sách không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTacGia.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Tác giả sách không được để trống ");
//            return ;
//        }
        if (jTextFieldTacGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tác giả sách không được để trống ");
            return;
        }
        try {
            jTextFieldTacGia.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tác giả sách bắt buộc là chữ cái !!!");
            return;
        }

        if (jTextFieldSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng sách không được để trống ");
            return;
        }
        try {
            Integer.parseInt(jTextFieldSoLuong.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng bắt buộc là chữ số !!!");
            return;
        }

        if (jTextFieldTinhTrang.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tình trạng sách không được để trống ");
            return;
        }
        try {
            jTextFieldTinhTrang.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tình trạng bắt buộc là chữ cái !!!");
            return;
        }

//        String tintrang = "[a-zA-Z]+";
//        if(!jTextFieldTinhTrang.getText().matches(tintrang)){
//            JOptionPane.showMessageDialog(this, "Tình trạng sách nhập vào không đúng cú pháp");
//            return;
//        }
//        if(jTextFieldTinhTrang.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Tình trạng sách không được để trống ");
//            return ;
//        }
        if(jTextFieldNhaXuatBan.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhà Xuất Bản sách không được để trống ");
            return ;
        }
        try {
            jTextFieldNhaXuatBan.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nhà xuất bản sách bắt buộc là chữ cái !!!");
            return;
        }
//        String nxb = "[a-zA-Z ]+";
//        if (!jTextFieldNhaXuatBan.getText().matches(nxb)) {
//            JOptionPane.showMessageDialog(this, "Nhà xuất bản sách nhập không đúng cú pháp");
//            return;
//        }
//        if (jTextFieldNhaXuatBan.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Nhà xuất bản sách không được để trống ");
//            return;
//        }

//        if(jTextFieldNamXB.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Năm Xuất Bản sách không được để trống ");
//            return ;
//        }
//        try {
//            Integer.parseInt(jTextFieldNhaXuatBan.getText());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Năm xuất bản sách bắt buộc là chữ số !!!");
//            return;
//        }
        if (jTextFieldNamXB.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản sách không được để trống ");
            return;
        }
        String namxb = "[0-9]{4}";
        if (!jTextFieldNamXB.getText().matches(namxb)) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản sách nhập không đúng cú pháp");
            return;
        }
        if (jTextFieldNamXB.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản sách không được để trống ");
            return;
        }

        if(jTextFieldTomTat.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Tóm tắt nội dung sách không được để trống ");
            return ;
        }
        try {
            jTextFieldTomTat.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tóm tắt nội dung sách có thể là chữ cái hoặc số !!!");
            return;
        }
        
        int index = jTable1.getSelectedRow();
        SachCode x = new SachCode();
        x.setMasach(Integer.parseInt(jTextFieldMaSach.getText()));
        x.setTensach(jTextFieldTenSach.getText());
        x.setSoLuong(Integer.parseInt(jTextFieldSoLuong.getText()));
        x.setNamXB(Integer.parseInt(jTextFieldNamXB.getText()));
        x.setNhaXuatBan(jTextFieldNhaXuatBan.getText());
        x.setTacGia(jTextFieldTacGia.getText());
        x.setTheLoaiSach(jTextFieldTheLoaiSach.getText());
        x.setTinhTrang(jTextFieldTinhTrang.getText());
        x.setTomTatNoiDung(jTextFieldTomTat.getText());

        try {
            if (new KetNoiCSDLSach().Sua(x)) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                model.setValueAt(x.getMasach(), index, 0);
                model.setValueAt(x.getTensach(), index, 1);
                model.setValueAt(x.getTheLoaiSach(), index, 2);
                model.setValueAt(x.getTacGia(), index, 3);
                model.setValueAt(x.getSoLuong(), index, 4);
                model.setValueAt(x.getTinhTrang(), index, 5);
                model.setValueAt(x.getNhaXuatBan(), index, 6);
                model.setValueAt(x.getNamXB(), index, 7);
                model.setValueAt(x.getTomTatNoiDung(), index, 8);

                TaiLai();
            }
        } catch (Exception ex) {
            Logger.getLogger(SachJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        TaiLai();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        GiaoDienChinhJPanel x = new GiaoDienChinhJPanel();
        x.setBounds(0, 0, 1200, 749);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jButtonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInActionPerformed
        MessageFormat header = new MessageFormat("Thông tin sách");
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
    }//GEN-LAST:event_jButtonInActionPerformed

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Có phải bạn muốn tìm kiếm thông tin ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
        String ma = "";
        if (jRadioButtonMa.isSelected()) {
            ma = "MaSach";
        }
        if (jRadioButtonTen.isSelected()) {
            ma = "TenSach";
        }
        String tim = jTextFieldTimKiem.getText();
        try {
            list.clear();
            list = new KetNoiCSDLSach().TimKiemThongTin(ma, tim);
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int i = 0; i < list.size(); i++) {
                SachCode x = list.get(i);
                JOptionPane.showMessageDialog(this,"Tìm kiếm thông tin thành công");
                model.addRow(new Object[]{
                    x.getMasach(), x.getTensach(), x.getTheLoaiSach(), x.getTacGia(), x.getSoLuong(), x.getTinhTrang(),
                    x.getNhaXuatBan(), x.getNamXB(), x.getTomTatNoiDung()
                });
            }
        } catch (Exception e) {
                
        }
        }else{
            JOptionPane.showMessageDialog(this,"Tìm kiếm thông tin không thành công ");
        }
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTextFieldTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTimKiemActionPerformed

    }//GEN-LAST:event_jTextFieldTimKiemActionPerformed

    private void jTextFieldMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaSachActionPerformed

    private void jRadioButtonMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaActionPerformed

    private void jRadioButtonTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTenActionPerformed

    private void jButtonDoiMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoiMauActionPerformed
       
        Color color = JColorChooser.showDialog(this, "Chọn màu", Color.yellow);
       jTable1.setForeground(color);       
       jPanel3.setForeground(color);
       jLabel2.setForeground(color);
       jLabel3.setForeground(color);
       jLabel4.setForeground(color);
       jLabel5.setForeground(color);
       jLabel6.setForeground(color);
       jLabel7.setForeground(color);
       jLabel8.setForeground(color);
       jLabel9.setForeground(color);      
       jLabel10.setForeground(color);
       jLabel13.setForeground(color);
       jLabel16.setForeground(color);
       jLabel1.setForeground(color);
       jLabel11.setForeground(color);
       jRadioButtonMa.setForeground(color);
       jRadioButtonTen.setForeground(color);
       jButtonIn.setForeground(color);
       jButtonSua.setForeground(color);
       jButtonThem.setForeground(color);
       jButtonTaiLai.setForeground(color);
       jButtonTimKiem.setForeground(color);
       jButtonXoa.setForeground(color);
       jButtonThoat.setForeground(color);
       jButtonDoiMau.setForeground(color);
       jButtonnenden.setForeground(color);
       jButtonnenTrang.setForeground(color);
       
    }//GEN-LAST:event_jButtonDoiMauActionPerformed

    private void jPanel3ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel3ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3ComponentRemoved

    private void jButtonnendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnendenActionPerformed
        jLabelnen.setVisible(true);
    }//GEN-LAST:event_jButtonnendenActionPerformed

    private void ilb_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ilb_imgMouseClicked
   
    }//GEN-LAST:event_ilb_imgMouseClicked

    private void jButtonnenTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnenTrangActionPerformed
      
        jLabelnen.setVisible(false);
       
    }//GEN-LAST:event_jButtonnenTrangActionPerformed
    void TaiLai() {
        jButtonThem.setEnabled(true);
        jTextFieldMaSach.setText("");
        jTextFieldTenSach.setText("");
        jTextFieldTheLoaiSach.setText("");
        jTextFieldTacGia.setText("");
        jTextFieldSoLuong.setText("");
        jTextFieldTinhTrang.setText("");
        jTextFieldNhaXuatBan.setText("");
        jTextFieldNamXB.setText("");
        jTextFieldTomTat.setText("");
        jTable1.clearSelection();

    }
//    int Random(){ // 
//        Random rd = new Random() ;
//        int k = 100 + rd.nextInt(899);
//        return k ;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel ilb_img;
    private javax.swing.JButton jButtonDoiMau;
    private javax.swing.JButton jButtonIn;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JButton jButtonnenTrang;
    private javax.swing.JButton jButtonnenden;
    private final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabelnen;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButtonMa;
    private javax.swing.JRadioButton jRadioButtonTen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldMaSach;
    private javax.swing.JTextField jTextFieldNamXB;
    private javax.swing.JTextField jTextFieldNhaXuatBan;
    private javax.swing.JTextField jTextFieldSoLuong;
    private javax.swing.JTextField jTextFieldTacGia;
    private javax.swing.JTextField jTextFieldTenSach;
    private javax.swing.JTextField jTextFieldTheLoaiSach;
    private javax.swing.JTextField jTextFieldTimKiem;
    private javax.swing.JTextField jTextFieldTinhTrang;
    private javax.swing.JTextField jTextFieldTomTat;
    // End of variables declaration//GEN-END:variables
}
