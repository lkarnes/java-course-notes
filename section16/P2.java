import java.util.Scanner;

public class P2 {
//switch statements
    public static void main(String[] args){
        char letter;
        String letterGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter Grade: ");
        letterGrade = input.nextLine();
        letter = letterGrade.charAt(0);
        switch(letter){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
