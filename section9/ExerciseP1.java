import java.util.Scanner;
public class ExerciseP1 {
    public static void main(String[] args)
    {
        String answer = "Watson";
        String response = "";
        int tries = 0;
        Scanner input = new Scanner(System.in);
        while (tries <= 3){
            System.out.print("Enter the name of the computer that played jeopardy: ");
            response = input.next();
            ++tries;
            if (response.equals(answer)) {
                System.out.print("Thats right!");
                break;
            }else if( tries == 3){
                System.out.println("Sorry the answer was " + answer);
                break;
            }else {
                System.out.println("sorry try again");
            }
        }
    }
}
