import java.util.ArrayList;
public class P5 {
    public static void main(String[] args){
        //for earch loops
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] numbers = new int[10];
        for(int i = 0; i < 10; ++i){
            numbers[i] = i + 1;
        }
        for(int num: numbers){
            System.out.print(num);
        }
    }
}
