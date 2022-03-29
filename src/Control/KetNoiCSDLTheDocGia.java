package Control;

import Model.TheDocGiaCode;
import java.sql.*;
import java.util.ArrayList;

public class KetNoiCSDLTheDocGia extends KetNoiCoSoDuLieu {

    private Connection con;

    public KetNoiCSDLTheDocGia() throws Exception {
        con = super.Connection();
    }

    public ArrayList<TheDocGiaCode> LayThongTin() throws SQLException {
        ArrayList<TheDocGiaCode> list = new ArrayList<>();
        list.clear();
        String sql = " SELECT * FROM thedocgia ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheDocGiaCode x = new TheDocGiaCode();
                x.setMaThe(rs.getInt(1));
                x.setTenDocGia(rs.getString(2));
                x.setGioiTinh(rs.getString(3));
                x.setNgaySinh(rs.getString(4));
                x.setDiaChi(rs.getString(5));
                x.setDienThoai(rs.getString(6));
                x.setNgaytao(rs.getString(7));
                x.setNgayHetHan(rs.getString(8));

                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<TheDocGiaCode> TimKiemThongTin(String timkiem) {
        ArrayList<TheDocGiaCode> list = new ArrayList<>();
        list.clear();
        String sql = " SELECT * FROM thedocgia WHERE " + timkiem + "; ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheDocGiaCode x = new TheDocGiaCode();
                x.setMaThe(rs.getInt(1));
                x.setTenDocGia(rs.getString(2));
                x.setGioiTinh(rs.getString(3));
                x.setNgaySinh(rs.getString(4));
                x.setDiaChi(rs.getString(5));
                x.setDienThoai(rs.getString(6));
                x.setNgaytao(rs.getString(7));
                x.setNgayHetHan(rs.getString(8));

                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean Them(TheDocGiaCode x) throws SQLException {
        String sql = " INSERT INTO thedocgia(MaThe,TenDocGia,GioiTinh,NgaySinh,DiaChi,DienThoai,NgayTao,NgayHetHan) VALUES (?,?,?,?,?,?,?,?) ";
        System.out.println(sql);

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, x.getMaThe());
        ps.setString(2, x.getTenDocGia());
        ps.setString(3, x.getGioiTinh());
        ps.setString(4, x.getNgaySinh());
        ps.setString(5, x.getDiaChi());
        ps.setString(6, x.getDienThoai());
        ps.setString(7, x.getNgaytao());
        ps.setString(8, x.getNgayHetHan());

        return ps.executeUpdate() > 0;

    }

    public boolean Sua(TheDocGiaCode x) throws SQLException {
        String sql = " UPDATE thedocgia SET  TenDocGia = '" + x.getTenDocGia() + "'"
                + " , GioiTinh = '" + x.getGioiTinh() + "'"
                + " , NgaySinh = '" + x.getNgaySinh() + "'"
                + " , DiaChi = '" + x.getDiaChi() + "'"
                + " , DienThoai = '" + x.getDienThoai() + "'"
                + " , NgayTao = '" + x.getNgaytao() + "'"
                + " , NgayHetHan = '" + x.getNgayHetHan() + "'"
                + "WHERE MaThe = " + x.getMaThe() + " ;";

        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeUpdate() > 0;

    }

    public boolean Xoa(int mathe) throws SQLException {
        String sql = "DELETE FROM thedocgia WHERE MaThe = '" + mathe + "' ;";
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeUpdate() > 0;
    }

    public static void main(String[] args) throws Exception {
        new KetNoiCSDLTheDocGia().LayThongTin();
    }

}
