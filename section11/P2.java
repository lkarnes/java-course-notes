import java.util.ArrayList;
public class P2 {
    public static void main(String[] args){
        //initialization
        // part 2-5
        // ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // ArrayList<Double> numbers = new ArrayList<Double>();
        //adding
        nums.add(0);
        for(int i = 1; i < 10; ++i)
            nums.add(i);
        int total = 0;
        for(int i = 0; i < nums.size(); ++i)
            //access
            total += nums.get(i);
        System.out.println(total);
        display(nums);
        change(nums, 4);
        display(nums);
    }
    static void display(ArrayList arr){
        for(int i = 0; i < arr.size(); ++i)
            System.out.print(arr.get(i) + " ");
            System.out.println();
    }
    static void change(ArrayList<Integer> arr, int amount){
        int val;
        for(int i = 0; i < arr.size(); ++i){
            val = arr.get(i);
            arr.set(i, val + amount);
        }
            
    }
}
