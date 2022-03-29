
package Control;
import Model.MuonSachCode;
import java.sql.* ;
import java.util.ArrayList;


public class KetNoiCSDLMuonSach extends KetNoiCoSoDuLieu{
        private Connection con;
        public KetNoiCSDLMuonSach() throws ClassNotFoundException, SQLException{
           con = super.Connection();
        }
        public ArrayList <MuonSachCode> LayThongTin() throws SQLException{
            ArrayList <MuonSachCode> list = new ArrayList<>();
            list.clear();
            String sql = " SELECT * FROM muonsach ; " ;
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
            while (rs.next()){
                MuonSachCode x = new MuonSachCode();
                x.setSoPhieuMuon(rs.getInt(1));                
                x.setTenSach(rs.getString(2));
                x.setMaSoSach(rs.getInt(3));
                x.setSoLuong(rs.getInt(4));
                x.setNgayMuon(rs.getString(5));
                x.setTenSinhVien(rs.getString(6));
                x.setMaTheSinhVien(rs.getString(7));
                        
                list.add(x);
            }
            }catch(Exception e){
                e.printStackTrace();
                    }
            return list;
        }
        public ArrayList TimKiemThongTin(String loai,String tim) throws SQLException{
            ArrayList <MuonSachCode> list = new ArrayList<>();
            list.clear();
            String sql = " SELECT * FROM muonsach WHERE "+ loai+" = '"+tim+"'; " ;
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
            while (rs.next()){
                MuonSachCode x = new MuonSachCode();
                x.setSoPhieuMuon(rs.getInt(1));                
                x.setTenSach(rs.getString(2));
                x.setMaSoSach(rs.getInt(3));
                x.setSoLuong(rs.getInt(4));
                x.setNgayMuon(rs.getString(5));
                x.setTenSinhVien(rs.getString(6));
                x.setMaTheSinhVien(rs.getString(7));
                        
                list.add(x);

            }
            }catch(Exception e){
                e.printStackTrace();
                    }
            return list;
        }
        public boolean Them(MuonSachCode x) throws SQLException { 
            
           // String sql = "INSERT INTO muonsach(SoPhieuMuon,TenSach,MaSoSach,SoLuong,NgayMuon,TenSinhVien,MaTheSinhVien) VALUES (?,?,?,?,?,?,?)" ;
            String sql = "INSERT INTO muonsach(SoPhieuMuon,TenSach,MaSoSach,SoLuong,NgayMuon,TenSinhVien,MaTheSinhVien) VALUES (?,?,?,?,?,?,?)";
            System.out.println(sql);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,x.getSoPhieuMuon());
            ps.setString(2,x.getTenSach());
            ps.setInt(3,x.getMaSoSach());
            ps.setInt(4,x.getSoLuong());
            ps.setString(5, x.getNgayMuon());
            ps.setString(6,x.getTenSinhVien() );
            ps.setString(7,x.getMaTheSinhVien());
            
            return ps.executeUpdate()> 0 ;
        }
        public boolean Sua(MuonSachCode x ) throws SQLException{
            String sql = " UPDATE muonsach SET MaTheSinhVien = '"+x.getMaTheSinhVien()
            +"' , TenSach = '"+x.getTenSach()
            +"' , MaSoSach = "+x.getMaSoSach()
            +" , SoLuong = "+x.getSoLuong()
            +" , NgayMuon = '"+x.getNgayMuon()
            +"' , TenSinhVien = '"+x.getTenSinhVien()
            +"' WHERE SoPhieuMuon = "+x.getSoPhieuMuon()+" ; ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate() > 0 ;
        }
        
        public boolean Xoa(int SoPhieuMuon ) throws SQLException {
            String sql = " DELETE FROM muonsach WHERE SoPhieuMuon = " +SoPhieuMuon +" ;" ;
            PreparedStatement ps = con.prepareStatement(sql) ;
            return ps.executeUpdate() > 0 ;
        }
        
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new KetNoiCSDLMuonSach().LayThongTin();
    }
        
}
