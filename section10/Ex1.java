import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double bill, tip, disc;
        System.out.print("Enter the bill amount: ");
        bill = input.nextDouble();
        System.out.println("Enter a Discount or put 0: ");
        disc = input.nextDouble();
        bill = discount(bill, disc);
        tip = tip(bill);
        System.out.println("the new bill is " + bill);
        System.out.println("the tip is "+ tip);
        System.out.println("total with tip: " + (tip + bill));
        
        

    }
    static double discount(double bill, double disc){
        return bill - disc;
    }
    static double tip(double bill){
        return bill * 0.15;
    }
}
