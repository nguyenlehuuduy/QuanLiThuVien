/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.DangNhapDangKy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ChayPhanTram extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form ChayPhanTram
     */
    public ChayPhanTram() {
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

        jPanel1 = new javax.swing.JPanel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabelloading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar2.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(204, 0, 0));
        jProgressBar2.setStringPainted(true);
        jPanel1.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 880, 50));

        jLabelloading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelloading.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabelloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 190, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("X??Y D???NG ???NG D???NG QU???N L?? TH?? VI???N");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 780, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\loading2.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 200, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\loading1.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\ApacheNetBean\\NetBeansProjects\\QuanLiThuVienHocKy2\\src\\HinhAnhGiaoDienChinh\\loading3.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 200, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 360));

        setSize(new java.awt.Dimension(895, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ChayPhanTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChayPhanTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChayPhanTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChayPhanTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ChayPhanTram x = new ChayPhanTram();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                x.setVisible(true);
            }
        });
        x.jLabelloading.setText("LOADING");
        int i = 0;
        while (i <= 100) {
            if(i%10 == 0){
                x.jLabelloading.setText("LOADING");
            }else {
                x.jLabelloading.setText(x.jLabelloading.getText()+".");
            }
            i++;
            x.jProgressBar2.setValue(i);
            try {
                Thread.sleep(30);
                if(i==100){
                    x.setVisible(false);
                    new DangNhap().setVisible(true);
                }
            } catch (InterruptedException ex) {}
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelloading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        int i=0;
        while ( i <=100){
            i++;
           jProgressBar2.setValue(i);
        }
        try {
            Thread.sleep(150);
        } catch (InterruptedException ex) {}
    }
}
