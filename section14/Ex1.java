import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args){
        Employee e1 = new Employee("Jake", 35400);
        Manager m1 = new Manager("Tim", 49000, "Sales");
        Employee e2 = new Employee("Steve", 40000);
        Manager m2 = new Manager("Josh" , 50000,  "IT");
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(e1);
        emps.add(e2);
        emps.add(m2);
        emps.add(m1);
        for(int i = 0; i < emps.size(); ++i){
            System.out.println( emps.get(i).displayEmpInfo());
        }
    }    
}
