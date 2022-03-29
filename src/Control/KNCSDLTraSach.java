
package Control;
import java.sql.* ;
import java.util.ArrayList;
import Model.TraSachCode ;

public class KNCSDLTraSach extends KetNoiCoSoDuLieu {
        private Connection con;
        public KNCSDLTraSach() throws ClassNotFoundException, SQLException{
            con = super.Connection();
        }
        public ArrayList <TraSachCode> LayThongTin() throws SQLException{
            ArrayList <TraSachCode> list = new ArrayList<>();
            list.clear();
            String sql = " SELECT * FROM classtrasach ; " ;
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
            while (rs.next()){
                TraSachCode x = new TraSachCode();
                x.setSoPhieuMuon(rs.getInt(1));                
                x.setTenSach(rs.getString(2));
                x.setMaSoSach(rs.getInt(3));
                x.setSoLuong(rs.getInt(4));
                x.setNgayTra(rs.getString(5));
                x.setTenSinhVien(rs.getString(6));
                x.setMaTheSinhVien(rs.getString(7));
                        
                list.add(x);
            }
            }catch(Exception e){
                e.printStackTrace();
                    }
            return list;
        }
        public ArrayList TimKiemThongTin(String mathe ,String sophiemuon) throws SQLException{
            ArrayList <TraSachCode> list = new ArrayList<>();
            list.clear();
            String sql = " SELECT * FROM classtrasach WHERE "+mathe+" = '"+sophiemuon+"' ; " ;
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
            while (rs.next()){
                TraSachCode x = new TraSachCode();
                x.setSoPhieuMuon(rs.getInt(1));                
                x.setTenSach(rs.getString(2));
                x.setMaSoSach(rs.getInt(3));
                x.setSoLuong(rs.getInt(4));
                x.setNgayTra(rs.getString(5));
                x.setTenSinhVien(rs.getString(6));
                x.setMaTheSinhVien(rs.getString(7));
                        
                list.add(x);

            }
            }catch(Exception e){
                e.printStackTrace();
                    }
            return list;
        }
        public boolean Them(TraSachCode x) throws SQLException {        
            String sql = "INSERT INTO classtrasach(SoPhieuMuon,TenSach,MaSoSach,SoLuong,NgayTra,TenSinhVien,MaTheSinhVien) VALUES (?,?,?,?,?,?,?)" ;
            System.out.println(sql);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,x.getSoPhieuMuon());
            ps.setString(2,x.getTenSach());
            ps.setInt(3,x.getMaSoSach());
            ps.setInt(4,x.getSoLuong());
            ps.setString(5, x.getNgayTra());
            ps.setString(6,x.getTenSinhVien() );
            ps.setString(7,x.getMaTheSinhVien());
            
            return ps.executeUpdate()> 0 ;
        }
        public boolean Sua(TraSachCode x ) throws SQLException{
            String sql = " UPDATE classtrasach SET MaTheSinhVien = '"+x.getMaTheSinhVien()+"'"
            +" , TenSach = "+x.getTenSach()
            + " , MaSoSach = "+x.getMaSoSach()
            +" , SoLuong = '"+x.getSoLuong()+"'"
            +" , NgayTra = '"+x.getNgayTra()+"'"
            +" , TenSinhVien = '"+x.getTenSinhVien()+"'"
            +" WHERE SoPhieuMuon = "+x.getSoPhieuMuon()+" ; ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate() > 0 ;
        }
        
        public boolean Xoa(int SoPhieuMuon ) throws SQLException {
            String sql = "DELETE FROM classtrasach WHERE SoPhieuMuon = "+ SoPhieuMuon +" ;" ;
            PreparedStatement ps = con.prepareStatement(sql) ;
            return ps.executeUpdate() > 0 ;
        }
        
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new KetNoiCSDLMuonSach().LayThongTin();
    }
        
}
