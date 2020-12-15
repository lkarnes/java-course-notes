public class Manager extends Employee {
    private String department;
    Manager(String n, int s, String d){
        super(n,s);
        department = d;
    }

    public String getDepartment(){
        return department;
    }

    public String displayEmpInfo(){
        String empInfo = super.displayEmpInfo();
        return empInfo + "Department: " + department + "\n";
    }

    public void changeSalary(Employee e, int amount) {
        e.salary = amount;
    }
}
