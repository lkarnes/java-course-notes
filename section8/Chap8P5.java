import java.util.Scanner;

public class Chap8P5 {
    public static void main(String[] args)
    {
        int grade;
        String letterGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        grade = input.nextInt();
        if(grade > 90){
            letterGrade = "A";
        }else if(grade >= 80){
            letterGrade = "B";
        }else if(grade >= 70){
            letterGrade = "C";
        }else if(grade >= 60){
            letterGrade = "D";
        }else if (grade >= 0){
            letterGrade = "F";
        }else{
            System.out.print("Input not recognized");
            letterGrade = "NAN";
        }
        System.out.print(letterGrade);
    }
}
