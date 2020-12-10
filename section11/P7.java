import java.util.Random;
import java.util.ArrayList;

public class P7 {
    public static void main(String[] args){
        Random rand = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 100; ++i){
            numbers.add(rand.nextInt(101));
        }
        // if(numbers.indexOf(100) >= 0){
        //     System.out.println("100 was found at position " + numbers.indexOf(100));
        // }
        // if (numbers.contains(12)){
        //     System.out.println("12 in array");
        // } 
        int min = 0;
        for(int i = 1; i < numbers.size(); ++i){
            if (numbers.get(i) < numbers.get(min)){
                min = i;
            }
                
        }
            
        System.out.println(numbers);
        System.out.println(numbers.get(min));
    }
}
