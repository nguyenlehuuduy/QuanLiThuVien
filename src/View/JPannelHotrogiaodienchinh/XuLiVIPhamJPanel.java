/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.JPannelHotrogiaodienchinh;

import Model.SachCode;
import Model.XuLiCode;
import View.GiaoDienChinh.GiaoDienChinh;
import static View.GiaoDienChinh.GiaoDienChinh.jPanelLamViec;
import Control.KetNoiCSDLXuLi;
import Model.MuonSachCode;
import java.awt.Color;
import static java.nio.file.Files.list;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class XuLiVIPhamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form XuLiVIPhamJPanel
     */
    public ArrayList<XuLiCode> list;
    public DefaultTableModel model;
    private XuLiCode XuLiCode;
    private GiaoDienChinh home;

    public XuLiVIPhamJPanel(java.awt.Frame parent) throws ClassNotFoundException, SQLException {
        initComponents();
        list = new ArrayList<>();
        model = (DefaultTableModel) jTableXuLi.getModel();
        list = new KetNoiCSDLXuLi().LayThongTinn();
        home = (GiaoDienChinh) parent;
        for (int i = 0; i < list.size(); i++) {
            XuLiCode x = list.get(i);
            model.addRow(new Object[]{
                x.getMaViPham(), x.getMaTheDocGia(), x.getTenDocGia(), x.getTenSach(), x.getNgayMuon(), x.getNgayMat(), x.getLyDo(), x.getTienPhat()
            });
        }
    }

    public void addXuLi(XuLiCode x) {
        list.add(x);
        model.setRowCount(0);
        for (XuLiCode xulicode : list) {

        }
        model.addRow(new Object[WIDTH]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableXuLi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonThem = new javax.swing.JButton();
        jButtonXuLi = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtontimKiem = new javax.swing.JButton();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jButtonXoa1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButtonDoiMau = new javax.swing.JButton();
        jButtonnenTrang = new javax.swing.JButton();
        jButtonnenden = new javax.swing.JButton();
        jLabelnen = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableXuLi.setBackground(new java.awt.Color(153, 153, 153));
        jTableXuLi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Vi Phạm", "Mã Thẻ Độc Giả", "Tên Độc Giả", "Tên Sách", "Ngày Mượn", "Ngày mất", "Lí Do", "Tiền Phạt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableXuLi.setShowGrid(true);
        jTableXuLi.getTableHeader().setReorderingAllowed(false);
        jTableXuLi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableXuLiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTableXuLi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableXuLiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableXuLiMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableXuLi);
        if (jTableXuLi.getColumnModel().getColumnCount() > 0) {
            jTableXuLi.getColumnModel().getColumn(0).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(1).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(2).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(3).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(4).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(5).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(6).setResizable(false);
            jTableXuLi.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1170, 540));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("XỬ LÍ VI PHẠM");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 260, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonThem.setForeground(new java.awt.Color(0, 0, 0));
        jButtonThem.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhXuLiThongTinViPham\\add.png")); // NOI18N
        jButtonThem.setText("Thêm");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 50));

        jButtonXuLi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonXuLi.setForeground(new java.awt.Color(0, 0, 0));
        jButtonXuLi.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhXuLiThongTinViPham\\report.png")); // NOI18N
        jButtonXuLi.setText("Xử Lí");
        jButtonXuLi.setToolTipText("");
        jButtonXuLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuLiActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonXuLi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 50));

        jButtonXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(0, 0, 0));
        jButtonXoa.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhXuLiThongTinViPham\\exit.png")); // NOI18N
        jButtonXoa.setText("Thoát");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 50));

        jButtontimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtontimKiem.setForeground(new java.awt.Color(0, 0, 0));
        jButtontimKiem.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhXuLiThongTinViPham\\timkiem.png")); // NOI18N
        jButtontimKiem.setText("Tìm Kiếm ");
        jButtontimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(jButtontimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 40));
        jPanel3.add(jTextFieldTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 220, 40));

        jButtonXoa1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonXoa1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonXoa1.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhMuonSach\\delete.png")); // NOI18N
        jButtonXoa1.setText("Xóa");
        jButtonXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoa1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonXoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 890, 100));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDoiMau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDoiMau.setText("Đổi Màu");
        jButtonDoiMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoiMauActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonDoiMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        jButtonnenTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonnenTrang.setText("Nền Trắng");
        jButtonnenTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnenTrangActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonnenTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, 30));

        jButtonnenden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonnenden.setText("Nền Đen");
        jButtonnenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnendenActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonnenden, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, 30));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 120));

        jLabelnen.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhMuonSach\\den.jpg")); // NOI18N
        jPanel2.add(jLabelnen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableXuLiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableXuLiAncestorAdded

    }//GEN-LAST:event_jTableXuLiAncestorAdded

    private void jTableXuLiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableXuLiMouseClicked

        jButtonThem.setEnabled(false);
        int index = jTableXuLi.getSelectedRow();
    }//GEN-LAST:event_jTableXuLiMouseClicked

    private void jTableXuLiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableXuLiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableXuLiMouseEntered

    private void jButtonXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoa1ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Bạn chắc chắc là mình muốn xóa ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            int index = jTableXuLi.getSelectedRow();
            int mavipham = Integer.parseInt(model.getValueAt(index, 0) + "");
            try {
                if (new KetNoiCSDLXuLi().Xoa(mavipham)) {
                    JOptionPane.showMessageDialog(this, " Xóa Thành Công ");
                    model.removeRow(index);
                }
            } catch (Exception ex) {
                Logger.getLogger(XuLiVIPhamJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, " Xóa Không Thành Công ");
        }
    }//GEN-LAST:event_jButtonXoa1ActionPerformed

    private void jButtontimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontimKiemActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Có phải bạn muốn tìm kiếm thông tin ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String timkiem ="MaViPham";
            timkiem = jTextFieldTimKiem.getText();
            try {
                list.clear();
                list = new KetNoiCSDLXuLi().TimKiemThongTin(timkiem);
                //   list = new KetNoiCSDLXuLi().TimKiemThongTin(timkiem);
                while (model.getRowCount() != 0) {
                    model.removeRow(0);
                }
                for (int i = 0; i < list.size(); i++) {
                    XuLiCode x = list.get(i);
                    JOptionPane.showMessageDialog(this,"Tìm kiếm thông tin thành công ");
                    model.addRow(new Object[]{
                        x.getMaViPham(), x.getMaTheDocGia(), x.getTenDocGia(), x.getTenSach(), x.getNgayMuon(), x.getNgayMat(),
                        x.getLyDo(), x.getTienPhat()
                    });
                }
            } catch (Exception ex) {
            }
        }else{
            JOptionPane.showMessageDialog(this, "Tìm kiếm thông tin không thành công ");
        }
    }//GEN-LAST:event_jButtontimKiemActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        GiaoDienChinhJPanel x = new GiaoDienChinhJPanel();
        x.setBounds(0, 0, 1200, 749);
        jPanelLamViec.removeAll();
        jPanelLamViec.add(x);
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonXuLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuLiActionPerformed
        MessageFormat header = new MessageFormat("Thông tin xử lí vi phạm");
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTableXuLi.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
        //JOptionPane.showMessageDialog(this, "Tùy Vào Giá Tiền Của Sách Và Số Lượng Sách Bị hư hỏng , mất mát mà đưa ra những hình thức xử phạt khác nhau !");
    }//GEN-LAST:event_jButtonXuLiActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        // JDialogHoTroXuLi x = new JDialogHoTroXuLi(home,this, true);
        hotroXuLi x = new hotroXuLi(home,this, true);
        x.setVisible(true);
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonDoiMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoiMauActionPerformed
        Color color = JColorChooser.showDialog(this, "Chọn màu", Color.yellow);

        jTableXuLi.setForeground(color);
       

        jLabel2.setForeground(color);
       
        //        jRadioButtonMa.setForeground(color);
        //        jRadioButtonTen.setForeground(color);
        jButtonThem.setForeground(color);
        jButtonXoa.setForeground(color);
        jButtonThem.setForeground(color);
        jButtonXuLi.setForeground(color);
        jButtontimKiem.setForeground(color);
        jButtonXoa1.setForeground(color);
        
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
    private javax.swing.JButton jButtonDoiMau;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JButton jButtonXoa1;
    private javax.swing.JButton jButtonXuLi;
    private javax.swing.JButton jButtonnenTrang;
    private javax.swing.JButton jButtonnenden;
    private javax.swing.JButton jButtontimKiem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelnen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableXuLi;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables
}
