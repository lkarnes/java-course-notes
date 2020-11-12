import java.util.Scanner;
public class Chap8P4 {
    public static void main(String[] args)
    {
        int grade;
        String letterGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        grade = input.nextInt();
        if (grade >= 90)
        {
            if(grade >= 95)
            {
                letterGrade = "A+";
            }
            if(grade >= 93)
            {
                letterGrade = "A";
            }else
            {
                letterGrade = "A-";
            } 
            System.out.print("You got a "+ letterGrade);
        }
        else
        {
            System.out.print("you did not get a A");
        }
        
    }
}
