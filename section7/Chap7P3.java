import java.util.Scanner;
public class Chap7P3 {
    public static void main(String[] args)
    {
        //import Scanner from java.utils and create a new instance
        //can be switched to double or float just by putting nextFloat or nextDouble
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;
        System.out.print("Enter First Number:");
        number1 = input.nextInt();
        System.out.println("the number is " + number1 + "!");
        System.out.print("Enter Second Number:");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("The sum is " + sum);
    }
}
