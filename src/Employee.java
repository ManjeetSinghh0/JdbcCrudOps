public class Employee {
    private int eid;
    private String ename;
    private String email;
    private int salary;

    public Employee(int eid, String ename, String email, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.email = email;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }
    public String getEname() {
        return ename;
    }
    public String getEmail() {
        return email;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", salary=" + salary + "]";
    }

    
}
