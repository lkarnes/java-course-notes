import java.util.Scanner;

public class Chap10P3 {
    public static void main(String args[]){
        String type;
        double temp;
        Scanner inputTemp = new Scanner(System.in);
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the temp: ");
        temp = input.nextDouble();
        System.out.println("temp: " + temp);
        System.out.println("Enter C for Celcius or F for Farenheit");
        type = input.next();
        System.out.print(convert(temp, type));
    }
    static double ftoc(double temp) {
        double celcius;
        celcius = (temp - 32.0) * (5.0/9.0);
        return celcius;
    }
    static double ctof(double temp) {
        double f;
        f = temp * (9.0/5.0) + 32.0;
        return f;
    }
    static double convert(double temp, String type) {
        if(type.equals("C")){
            return temp * (9.0/5.0) + 32.0;
        }else {
            return (temp - 32.0) * (5.0/9.0);
        }
    }
}
