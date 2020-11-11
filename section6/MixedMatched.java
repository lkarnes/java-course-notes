public class MixedMatched {
    public static void main(String[] args)
    {
        // a double can be a int but a int cant be a double
        double dnum;
        int num = 2;
        dnum = num;
        System.out.println(dnum);
        //chars will return the ascii value of that char
        int num2;
        char c = 'c';
        num = c; 
        System.out.print(num);
    }
}
