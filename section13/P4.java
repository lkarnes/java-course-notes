public class P4 {
    public static void main(String[] args){
        Object anObject = new Employee("logan", 45000);
        System.out.println(anObject.getClass().getName());
        Employee e1 = (Employee)anObject; //casting needed to acess methods from the class
        System.out.println(e1.displayEmpInfo());
    }
}
