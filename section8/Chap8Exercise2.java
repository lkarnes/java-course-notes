import java.util.Scanner;

public class Chap8Exercise2 {
    public static void main(String[] args)
    {
        String op;
        double number1, number2;
        Scanner inputOp = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = inputNumber.nextDouble();
        System.out.print("Enter the operator: ");
        op = inputOp.next();
        System.out.print("Enter the second Number: ");
        number2 = inputNumber.nextDouble();
        if(op.equals("+"))
            System.out.print(number1 + number2);
        else if (op.equals("-"))
            System.out.print(number1 - number2);
        else if (op.equals("*"))
            System.out.print(number1 * number2);
        else if (op.equals("/"))
            System.out.print(number1/number2);
        else
            System.out.print("ERROR");
    }
}
