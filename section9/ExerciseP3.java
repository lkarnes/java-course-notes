import java.util.Scanner;
public class ExerciseP3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String  sentence = "";
        int numVowles = 0;
        System.out.print("Write your sentence here:");
        sentence = input.nextLine();
        for(int pos = 0; pos < sentence.length(); pos++)
        {
            if (sentence.charAt(pos) == 'a'){
                ++numVowles;
            }else if(sentence.charAt(pos) == 'e'){
                ++numVowles;
            }else if(sentence.charAt(pos) == 'i'){
                ++numVowles;
            }else if(sentence.charAt(pos) == 'o'){
                ++numVowles;
            }else if(sentence.charAt(pos) == 'u'){
                ++numVowles;
            }
        }
        System.out.print("this sentence contains "+ numVowles + " Vowels!");
    }
}
