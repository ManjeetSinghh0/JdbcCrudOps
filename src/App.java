import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Management System!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 = create, 2 = read, 3 = update, 4 = delete, 5 = exit");
            int choice = sc.nextInt();

            if (choice == 5 || (choice <1 || choice > 5) ) {
                System.out.println("Exiting the Employee Management System. Goodbye!");
                break;
            }
            switch (choice) {
                case 1: System.out.println("eid, ename, email, salary");
                        int eid = sc.nextInt();
                        sc.nextLine();
                        String ename = sc.nextLine();
                        String email = sc.nextLine();
                        int salary = sc.nextInt();
                        sc.nextLine(); // to consume /n after salary(int) input
                        Employee emp = new Employee(eid, ename, email, salary);
                        EmployeeDao.createEmp(emp);
                    break;

                case 2: ArrayList<Employee> list = EmployeeDao.getAllEmp();
                        for(Employee em : list){
                            System.out.println(em);
                        }
                    break;

                case 3: System.out.println("ename, eid");
                        sc.nextLine(); // Consume the leftover newline from the previous input that is 3
                        ename = sc.nextLine();
                        eid = sc.nextInt();
                        EmployeeDao.updateEmp(ename, eid);
                    break;

                case 4: System.out.println("eid");
                    eid = sc.nextInt();
                    EmployeeDao.deleteEmp(eid);
                break;
                        
            }
        }
        sc.close();
    }
}
