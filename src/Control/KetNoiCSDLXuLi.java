 
package Control;

import Model.XuLiCode;
import java.sql.* ;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class KetNoiCSDLXuLi extends KetNoiCoSoDuLieu{
    private Connection con;

    public KetNoiCSDLXuLi() throws ClassNotFoundException {
        con = super.Connection();
        }
        public ArrayList LayThongTinn() throws SQLException{
            ArrayList <XuLiCode>  list = new ArrayList<> ();
            list.clear();
            String sql = " SELECT * FROM xuli ;" ;
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    XuLiCode x = new XuLiCode();
                    x.setMaViPham(rs.getInt(1));
                    x.setMaTheDocGia(rs.getInt(2));
                    x.setTenDocGia(rs.getString(3));
                    x.setTenSach(rs.getString(4));
                    x.setNgayMuon(rs.getString(5));
                    x.setNgayMat(rs.getString(6));
                    x.setLyDo(rs.getString(7));
                    x.setTienPhat(rs.getString(8));
                    
                    list.add(x);
                    
                }
                       
            }catch (Exception e){
                e.printStackTrace();
            }
            return list;
}
            public ArrayList<XuLiCode> TimKiemThongTin(String timkiem)  {
            ArrayList<XuLiCode> list = new ArrayList<> () ;
            list.clear();
            String sql = " SELECT * FROM xuli WHERE MaViPham = "+timkiem+" ; ";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
            while(rs.next()){
                XuLiCode x = new XuLiCode() ;
                    x.setMaViPham(rs.getInt(1));
                    x.setMaTheDocGia(rs.getInt(2));
                    x.setTenDocGia(rs.getString(3));
                    x.setTenSach(rs.getString(4));
                    x.setNgayMuon(rs.getString(5));
                    x.setNgayMat(rs.getString(6));
                    x.setLyDo(rs.getString(7));
                    x.setTienPhat(rs.getString(8));
                    
                    list.add(x);
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        return list;           
        }
        
        
        
        
        public boolean  Xoa(int mavipham) throws SQLException{
            String sql = " DELETE FROM xuli WHERE MaViPham = "+mavipham+" ;";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        }
        public boolean Them(XuLiCode x) throws SQLException {{
           
            String sql = "INSERT INTO xuli(MaViPham,MaTheDocGia,TenDocGia,TenSach,NgayMuon,NgayMat,LyDo,TienPhat) VALUES (?,?,?,?,?,?,?,?) ; ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, x.getMaViPham());
            ps.setInt(2,x.getMaTheDocGia());
            ps.setString(3, x.getTenDocGia());
            ps.setString(4,x.getTenSach());
            ps.setString(5, x.getNgayMuon());
            ps.setString(6,x.getNgayMat());
            ps.setString(7, x.getLyDo());
            ps.setString(8,x.getTienPhat());
            
            return ps.executeUpdate() > 0;
        }  
}
        public boolean  Sua(XuLiCode x ) throws SQLException {
            String sql = " UPDATE xuli SET MaTheDocGia = "+x.getMaTheDocGia()
                    +" TenDocGia = '"+x.getTenDocGia()+"'"
                    +" TenSach = '"+x.getTenSach()+"'"
                    +" NgayMuon = '"+x.getNgayMuon()+"'"
                    +" NgayMat = '"+x.getNgayMat()+"'"
                    +" LyDo = '"+x.getLyDo()+"'"
                    +"TienPhat = '"+x.getTienPhat()+"'"
                    +" WHERE MaViPham = "+x.getTienPhat();
                PreparedStatement ps = con.prepareStatement(sql);
                return ps.executeUpdate() > 0 ;
        }
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            new KetNoiCSDLXuLi().LayThongTinn() ;
    }
}   
   
