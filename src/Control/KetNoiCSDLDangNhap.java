
package Control;


import Model.DangNhapCode;
import java.sql.*;
import java.util.ArrayList;


public class KetNoiCSDLDangNhap {
    private Connection con ;
    public KetNoiCSDLDangNhap(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String a = "jdbc:mysql://localhost:3306/quanlithuvien?allowPublicKeyRetrieval=true&useSSL=false";
            String b = "root";
            String c = "nguyenlehuuduy0909DUY";
            this.con = (Connection) DriverManager.getConnection(a,b,c);
            if(con==null){
            System.out.println("Conn bi Null");
        }
            //this.con =  DriverManager.getConnection(a,b,c);
          
        }catch(Exception e){
            System.out.println("Kết Nối Thanh cong");
            e.printStackTrace();
        }
        
    }
       
    public  ArrayList<DangNhapCode> LayThongTin() {
//         try{
//            Class.forName("com.mysql.jdbc.Driver");
//            String a = "jdbc:mysql://localhost:3306/quanlithuvien?allowPublicKeyRetrieval=true&useSSL=false";
//            String b = "root";
//            String c = "nguyenlehuuduy0909DUY";
//            this.con = (Connection) DriverManager.getConnection(a,b,c);
//            
            ArrayList<DangNhapCode> list = new ArrayList<>();
            list.clear();
            String sql = "SELECT * FROM taikhoandangnhap ;";
            try{
                PreparedStatement ps = con.prepareStatement(sql);//truy cap vao mysql lay thong tin
                ResultSet rs = ps.executeQuery() ;//
                while(rs.next()){
                    DangNhapCode x = new  DangNhapCode() ;
                    x.setTenDangNhap(rs.getString(1));
                    x.setMatKhau(rs.getString(2));
                    list.add(x);
                }
            }catch(SQLException e){
            }
            return list ;
         }
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.println("Thanh cong");
//        }
//        return null ;
//    }
    
    public boolean ThemTaiKhoan(DangNhapCode x) throws SQLException{
        String sql ="INSERT INTO taikhoandangnhap (TenDangNhap,MatKhau,HoVaTen,GioiTinh,NgaySinh,DienThoai,Email,QueQuan) VALUES (?,?,?,?,?,?,?,?)";
        System.out.println(sql);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,x.getTenDangNhap());
        ps.setString(2,x.getMatKhau());
        ps.setString(3,x.getHoVaTen());
        ps.setString(4,x.getGioiTinh());
        ps.setString(5,x.getNgaySinh());
        ps.setString(6,x.getDienThoai());
        ps.setString(7,x.getEmail());
        ps.setString(8,x.getQueQuan());
        
        return ps.executeUpdate() > 0 ;
    }
    
    public static void main(String[] args ){
        KetNoiCSDLDangNhap x = new KetNoiCSDLDangNhap() ;
        x.LayThongTin() ;
    }
}
