import java.util.Random;

public class P3 {
    public static void main(String[] args){
        final int size = 100;
        int[] numbers = new int[size];
        buildArr(numbers, size);
        displayArr(numbers, size);
        System.out.println(sumArr(numbers, size));
    }
    static void buildArr(int[] arr, int size){
        Random rand = new Random(System.currentTimeMillis());
        for(int i = 0; i < size; ++i){
            arr[i] = rand.nextInt(101);
        }
    }
    static void displayArr(int[] arr, int size) {
        for(int i = 0; i < size; ++i){
            System.out.print(arr[i] + " ");
            if((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    static int sumArr(int[] arr, int size){
        int total = 0;
        for(int i = 0; i < size; ++i){
            total += arr[i];
        }
        return total;
    }
}
