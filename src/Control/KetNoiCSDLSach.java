  package Control;

import java.sql.*;
import Model.SachCode;
import java.util.ArrayList;
import java.sql.DriverManager;

public class KetNoiCSDLSach extends KetNoiCoSoDuLieu{

    private Connection con;

    public KetNoiCSDLSach() throws ClassNotFoundException {
       
           con = super.Connection();
    }
    public ArrayList<SachCode> LayThongTin() {   
        
        ArrayList<SachCode> list = new ArrayList<>();
        list.clear();
        String sql = "SELECT * FROM sach ;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachCode x = new SachCode();
                x.setMasach(rs.getInt(1));
                x.setTensach(rs.getString(2));
                x.setTheLoaiSach(rs.getString(3));
                x.setTacGia(rs.getString(4));
                x.setSoLuong(rs.getInt(5));
                x.setTinhTrang(rs.getString(6));
                x.setNhaXuatBan(rs.getString(7));
                x.setNamXB(rs.getInt(8));
                x.setTomTatNoiDung(rs.getString(9));

                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<SachCode> LayThongTinSachDaMuonHet() {     
        ArrayList<SachCode> list = new ArrayList<>();
        list.clear();
        String sql = "SELECT * FROM sach where soluong = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachCode x = new SachCode();
                x.setMasach(rs.getInt(1));
                x.setTensach(rs.getString(2));
                x.setTheLoaiSach(rs.getString(3));
                x.setTacGia(rs.getString(4));
                x.setSoLuong(rs.getInt(5));
                x.setTinhTrang(rs.getString(6));
                x.setNhaXuatBan(rs.getString(7));
                x.setNamXB(rs.getInt(8));
                x.setTomTatNoiDung(rs.getString(9));

                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<SachCode> TimKiemThongTin(String loai,String tim) {
        ArrayList<SachCode> list = new ArrayList<>();
        list.clear();
        String sql = "SELECT * FROM sach WHERE "+loai+" = '"+tim+"' ;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();// truy cap vao csdl de lay thong tin
            while (rs.next()) {
                SachCode x = new SachCode();
                x.setMasach(rs.getInt(1));
                x.setTensach(rs.getString(2));
                x.setTheLoaiSach(rs.getString(3));
                x.setTacGia(rs.getString(4));
                x.setSoLuong(rs.getInt(5));
                x.setTinhTrang(rs.getString(6));
                x.setNhaXuatBan(rs.getString(7));
                x.setNamXB(rs.getInt(8));
                x.setTomTatNoiDung(rs.getString(9));
               
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean Xoa(int maSach) throws SQLException {
        String sql = "DELETE FROM sach WHERE MaSach = "+maSach+" ;";
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeUpdate() > 0;
    }
    
    public boolean Sua(SachCode x) throws SQLException {
        String sql = "UPDATE sach SET TenSach = '"+x.getTensach()+"'"
                    + " , TheLoaiSach = '"+x.getTheLoaiSach()+"'"
                    + " , TacGia = '"+x.getTacGia()+"'"
                    + " , SoLuong = "+x.getSoLuong()
                    + " , TinhTrang = '"+x.getTinhTrang()+"'"
                    + " , NhaXuatBan = '"+x.getNhaXuatBan()+"'"
                    + " , NamXB = '"+x.getNamXB()+"'"
                    + " , TomTatNoiDung = '"+x.getTomTatNoiDung()+"'"
                + " WHERE MaSach = "+x.getMasach()+" ;";
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeUpdate() > 0;
    }

    public boolean Them(SachCode x) throws SQLException {

        String sql = " INSERT INTO sach(MaSach,TenSach,TheLoaiSach,TacGia,SoLuong,TinhTrang,NhaXuatban,NamXB,TomTatNoiDung) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,x.getMasach());
        ps.setString(2, x.getTensach());
        ps.setString(3, x.getTheLoaiSach());
        ps.setString(4, x.getTacGia());
        ps.setInt(5, x.getSoLuong());
        ps.setString(6, x.getTinhTrang());
        ps.setString(7, x.getNhaXuatBan());
        ps.setInt(8, x.getNamXB());
        ps.setString(9,x.getTomTatNoiDung());
//        ps.setBytes(10 ,x.getImage());
        return ps.executeUpdate() > 0; 
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new KetNoiCSDLSach().LayThongTin();
    }
}
