import java.util.ArrayList;
public class P6 {
    public static void main(String[] args){
        ArrayList<Employee> emps = new ArrayList<Employee>();
        Employee emp1 = new Employee("Jake", 20000);
        Employee emp2 = new Employee("Matt", 21000);
        Employee emp3 = new Employee("Steve", 23000);
        Employee emp4 = new Employee("Bob", 24000);
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        for(Employee emp: emps){
            System.out.println(emp.displayEmpInfo());
        }

    }
}
