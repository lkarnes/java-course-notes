import java.util.Scanner;

public class Chap10P2 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        double ftemp, ctemp;
        System.out.print("Enter the temp in Farenheit: ");
        ftemp = input.nextDouble();
        ctemp = ftoc(ftemp);
        System.out.print(ctemp+ " C");
    }
    static double ftoc(double temp) {
        double celcius;
        celcius = (temp - 32.0) * (5.0/9.0);
        return celcius;
    }
}
