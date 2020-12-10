public class Part6 {
    public static void main(String[] args){
        //Pass By Value
        int number = 12;
        System.out.println("number squared: " + square(number));
        System.out.println("original number: " + number);
    }

    static int square(int num){
        num *= num;
        System.out.println("num in square method: " + num);
        return num;
    }
}
