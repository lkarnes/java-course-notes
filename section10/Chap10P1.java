public class Chap10P1 {
    public static void main(String[] args)
    {
        int num = 12;
        System.out.println(square(num));
    }
    //methods go outside of main
    static int square(int number)
    {
       return number * number; 
    }
}
