import java.util.Scanner;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());
        String contChar;
        int number, guess;
        number = rand.nextInt(11);
        char cont = 'y';
        do {
            System.out.print("Guess a number: ");
            guess = inputNum.nextInt();
            if(guess == number){
                System.out.println("You are correct the number is " + guess);
                break;
            }
            System.out.println("Incorrect... Would you like to try again? y/n?");
            contChar = input.nextLine();
            cont = contChar.charAt(0);
        }while(cont != 'n');

    }    
}
