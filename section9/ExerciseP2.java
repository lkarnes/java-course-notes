import java.util.Scanner;
public class ExerciseP2 {
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        double num1, num2;
        String operator;
        while(true){
            System.out.print("Enter First Number");
            num1 = input1.nextDouble();
            System.out.print("Enter Operator");
            operator = input2.next();
            System.out.print("Enter First Number");
            num2 = input3.nextDouble();
            if(op.equals("+")){
                System.out.print(num1 + num2);
            }else if(op.equals("-")){
                System.out.print(num1 - num2);
            }else if(op.equal("*")){
                System.out.print(num1 * num2);
            }else{
                break;
            }
            System.out.print("Calculator turning off...");
        }
    }
}
