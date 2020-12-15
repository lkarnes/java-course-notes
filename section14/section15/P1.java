public class P1 {
    public static void main(String[] args){
        //difference from arraylist and array is an array has a set size where arraylist are infinite
        // the number is the amount of spaces
        final int size = 10;
        int[] numbers = new int[size];
        char[] letters = new char[20];
        //another initialization
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        String[] names = {"Logan", "Isabel", "Kindred"};
        //how to access
        for(int i = 0; i < size; ++i){
            numbers[i] = i + 1;
        }
        for(int i = 0; i < size; ++i){
            System.out.print(numbers[i] + "   ");
        }
        int total = 0;
        for(int i = 0; i < size; ++i){
           total += numbers[i]; 
        }
        System.out.println("total: " + total);

    }
}