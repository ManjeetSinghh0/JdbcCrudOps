public class Query {
    static String insert = "INSERT INTO employee (eid, ename, email, salary) VALUES (?,?,?,?)";
    static String select = "SELECT * FROM employee";
    static String update = "UPDATE employee SET ename = ? WHERE eid = ?";
    static String delete = "DELETE FROM employee WHERE eid = ?";
}
