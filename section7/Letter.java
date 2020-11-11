import java.util.Scanner;
public class Letter {
   public static void main(String[] args)
   {
    String name, present, yourName;
    int age;
    Scanner inputString = new Scanner(System.in);
    Scanner inputNum = new Scanner(System.in);
    System.out.print("Whats the name of the giver? ");
    name = inputString.nextLine();
    System.out.print("What is your Present?");
    present = inputString.nextLine();
    System.out.print("Whats your name");
    yourName = inputString.nextLine();
    System.out.print("How old are you?");
    age = inputNum.nextInt();
    System.out.println();
    System.out.println();
    System.out.println("Hello, " + name);
    System.out.println();
    System.out.println("thankyou for the " + present);
    System.out.println("I cant believe i am already " + age);
    System.out.println();
    System.out.println("goodbye," + yourName);
   } 
}
