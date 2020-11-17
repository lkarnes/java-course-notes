import java.util.Scanner;
public class Chap8Exercise {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String answer = "Watson";
        String response = "";
        String correct = "You Guessed it! " + answer;
        System.out.println("Lets Play a guessing game you have three tries");
        System.out.println("What is the name of the computer that played Jeopardy?");
        response = input.nextLine();
        if(response.equals(answer)){
            System.out.print(correct);
        }else
        {
            System.out.print("Wrong! next hint it starts with W: ");
            response = input.nextLine();
            if(response.equals(answer)){
                System.out.print(correct);  
            }else
            {
                System.out.print("Wrong again! next hint is it ends with N: ");
                response = input.nextLine();
                if(response.equals(answer)){
                    System.out.print(correct);
                }else{
                    System.out.print("Wrong! the answer is " + answer + "! Nice Try!");
                }
            }
        }
    }
}
