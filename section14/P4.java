public class P4 {
    public static void main(String[] args){
        // this doesnt work and will throw a abstract error
        // Shape s1 = new Shape(1,2);
        //this does work because its a child element
        Circle c1 = new Circle(1,2,3);
        c1.draw();
    }
}
