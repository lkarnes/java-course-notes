import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        int num1, num2;
        String op;
        Scanner input = new Scanner(System.in);
        Scanner charInput = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter the operator: ");
        op = charInput.next();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();

        if(op.equals("+")){
            System.out.println(add(num1,num2));
        }else if(op.equals("-")){
            System.out.println(sub(num1,num2));
        }else if(op.equals("*")){
            System.out.println(mult(num1,num2));
        }else if(op.equals("/")){
            System.out.println(div(num1, num2));
        }else{
            System.out.println("ERROR NOT A VALID OPERATOR");
        }

    }
    static double add(double num1, double num2){
        return num1 + num2;
    }
    static double sub(double num1, double num2){
        return num1 - num2;
    }
    static double mult(double num1, double num2){
        return num1 * num2;
    }
    static double div(double num1, double num2){
        return num1 / num2;
    }
}
