import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str;
        ArrayList<String> p = new ArrayList<String>();

        System.out.print("Enter a Sentence to check if its a Palindrome: ");
        str = input.nextLine();
        buildAL(p, str);
        if(isPalindrome(p)){
            System.out.print("This is a Palindrome");
        }else{
            System.out.print("This is not a Palindrome");
        }

    }
    static void display(ArrayList arr){
        for(int i = 0; i < arr.size(); ++i)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }

    static void buildAL(ArrayList<String> pword, String word){
        for(int i = 0; i < word.length(); ++i)
            pword.add(word.charAt(i) + "");
    }

    static boolean isPalindrome(ArrayList<String> word) {
        ArrayList<String> rword = new ArrayList<String>();
        rword.addAll(word);
        Collections.reverse(rword);
        for(int i = 0; i < word.size(); ++i)
            if(!(rword.get(i).equals(word.get(i))))
                return false;
        return true;
    }
}
