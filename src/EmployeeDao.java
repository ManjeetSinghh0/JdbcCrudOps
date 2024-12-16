import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {
    public static void createEmp(Employee employee) throws SQLException{

        Connection con = CreateDB.getCon();
        String query = Query.insert;

        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, employee.getEid());
        pstmt.setString(2, employee.getEname());
        pstmt.setString(3, employee.getEmail());
        pstmt.setInt(4, employee.getSalary());

        System.out.println("ps = " + pstmt + ":" + employee);
        pstmt.executeUpdate();   
        pstmt.close();
    }

    public static void updateEmp(String name, int id) throws SQLException{
        Connection con = CreateDB.getCon();
        String query = Query.update;

        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setInt(2, id);

        System.out.println("ps = " + pstmt + ": " + name + " Updated");

        pstmt.executeUpdate();
        pstmt.close();
    }

    public static void deleteEmp(int id) throws SQLException{
        Connection con = CreateDB.getCon();
        String query = Query.delete;

        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        System.out.println(pstmt);

        pstmt.executeUpdate();
        pstmt.close();
    }

    public static ArrayList<Employee> getAllEmp() throws SQLException{

        ArrayList<Employee> empList = new ArrayList<>();
        Connection con = CreateDB.getCon();
        String query = Query.select;

        PreparedStatement pstmt = con.prepareStatement(query);
        System.out.println("st" + pstmt);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            empList.add(emp);
        }

        rs.close();
        pstmt.close();
        return empList;

    }
}


