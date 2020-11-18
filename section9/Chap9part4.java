public class Chap9part4 {
    public static void main(String[] args)
    {
        double balance = 5000;
        double rate = 1.02;
        int years = 0;
        while(balance <= 100000)
        {
            balance *= rate;
            ++years;
        }
        System.out.print("It will take " + years + " to reach $100,000");

    }
}
