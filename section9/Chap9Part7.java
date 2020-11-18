import java.util.Scanner;
public class Chap9Part7 {
    public static void main(String[] args)
    {
        //break and continue
        String spaces = "there are spaces in this string";
        int numSpaces = 0;
        for(int i = 0; i < spaces.length(); ++i){
            if (spaces.charAt(i) != ' '){
                continue;
            }
            ++numSpaces;
        }
        System.out.println("there are " + numSpaces + " spaces!");
        int number = 7;
        int guess;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("enter your guess:");
            guess = input.nextInt();
            if(guess == number){
                break;
            }
        }
        System.out.print("You Got it!");
    }
}
