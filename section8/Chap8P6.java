import java.util.Scanner;
public class Chap8P6 {
    public static void main(String[] args)
    {
        String message = "the recommended activity is ";
        String activity = "No Value selected";
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Tempurature: ");
        temp = input.nextInt();
        if (temp > 85){
            activity = "swimming";
        }else if(temp > 70){
            activity = "tennis";
        }else if (temp > 32){
            activity = "golf";
        }else if (temp > 0){
            activity = "dancing";
        }else if (temp <= 0) {
            activity = "bonfire";
        }else {
            System.out.print("Value not valid");
        }
        System.out.print(message + activity);
    }
}
