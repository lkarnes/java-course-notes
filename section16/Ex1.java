public class Ex1 {
    public static void main(String[] args){
        System.out.println(calc(2,3,'-'));
    }
    static double calc(double num1, double num2, char op){
        switch(op){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}
