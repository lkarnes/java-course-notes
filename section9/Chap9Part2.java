public class Chap9Part2 {
    public static void main(String[] args)
    {
        double balance = 5000;
        double rate = 1.02;
        int year  = 1;
        while(year <= 10)
        {
            balance = balance * rate;
            ++year;
        }
        System.out.print("After 10 years your balance will be $" + balance);
    }
}
