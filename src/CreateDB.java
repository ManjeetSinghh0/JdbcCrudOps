import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDB {
    static Connection con;
    public static Connection getCon(){
        if(con==null){
            try{
                String url = "jdbc:mysql://localhost:3306/basic_crud";
                String name = "root";
                String pass = "teejnam";

                con = DriverManager.getConnection(url, name, pass);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return con;
    }
}
