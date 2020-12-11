public class Calc {
    private double number;
    Calc(double n){
        number += n;
    }
    public void add(double n){
        number += n;
    }
    public void subtract(double n){
        number -= n;
    }
    public void multiply(double n) {
        number *= n;
    }
    public void divided(double n){
        number = number / n;
    }
    public double show(){
        return number;
    }
}
