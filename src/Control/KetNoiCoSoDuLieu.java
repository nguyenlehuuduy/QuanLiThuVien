 
package Control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class KetNoiCoSoDuLieu {
    
    public Connection Connection() {
        Connection con = null ;
        try{
               Class.forName("com.mysql.jdbc.Driver");
            String a = "jdbc:mysql://localhost:3306/quanlithuvien?allowPublicKeyRetrieval=true&useSSL=false";
            String b = "root";
            String c = "nguyenlehuuduy0909DUY";
            con = (Connection) DriverManager.getConnection(a, b, c);

            }catch (Exception e){
                e.printStackTrace();
            }
        return con;
    }
    
}
