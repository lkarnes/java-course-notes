import java.util.Scanner;

public class Chap10P4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        String str;
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter a Charecter: ");
        str = strInput.nextLine();
        for(int pos = 0; pos < str.length(); ++pos){
            if(isVowl(str.charAt(pos))){
                System.out.println(str.charAt(pos) + " is a vowl");
            }else{
                System.out.println(str.charAt(pos) + " is not a vowl");
            }
        }
        if(isEven(num)){
            System.out.print(num + " Is Even!");
        }else{
            System.out.print( num + " Is Odd");
        }
    }
    static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    static boolean isVowl(char c){
        if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }else {
            return false;
        }
    }

}
