public class P1{
    public static void main(String[] args){
        Employee e1 = new Employee("Logan", 200001);
        System.out.println(e1.displayEmpInfo());
        Manager m1 = new Manager("Jack", 45000, "Sales");
        // System.out.print(m1.getName() + ": $" + m1.getSalary() + " department: " + m1.getDepartment());
        System.out.println(m1.displayEmpInfo());
        m1.changeSalary(e1, 25000);
        System.out.println(e1.displayEmpInfo());
    }
}