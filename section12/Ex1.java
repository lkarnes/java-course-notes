public class Ex1 {
    public static void main(String[] args){
        Calc calculator = new Calc(2);
        System.out.println(calculator.show());
        calculator.add(10);
        System.out.println(calculator.show());
        calculator.subtract(2);
        System.out.println(calculator.show());
        calculator.multiply(3);
        System.out.println(calculator.show());
        calculator.divided(2);
        System.out.println(calculator.show());
    }
}
