import java.util.Random;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        buildAL(numbers, 15);
        display(numbers);
        int maxPos = maximum(numbers);
        System.out.println("The biggest number is "+ numbers.get(maxPos));
    }
    static void display(ArrayList arr){
        for(int i = 0; i < arr.size(); ++i)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }
    static void buildAL(ArrayList<Integer> arr, int num){
        Random rand = new Random(System.currentTimeMillis());
        for(int i = 0; i < num; ++i)
            arr.add(rand.nextInt(101));

    }
    static int maximum(ArrayList<Integer> arr){
        int maxPos = 0;
        for(int i = 0; i < arr.size(); ++i)
            if (arr.get(i) > arr.get(maxPos))
                maxPos = i;
        return maxPos;
    }
}
