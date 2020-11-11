import java.util.Scanner;
public class Chap7P4 {
    public static void main(String[] args)
    {
        //next for single word nextLine for full strings spaaces cutt of strings with next
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = input.nextLine();
        System.out.print("Hello, " + name);

    }
}
