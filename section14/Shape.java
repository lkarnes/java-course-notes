public abstract class Shape {
    //turns class into a abstract class which stops the user from creating a class from this class and only allows them to create one of its children

    private int x;
    private int y;
    
    Shape(int xcor, int ycor) {
        x = xcor;
        y = ycor;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int xcor){
        x = xcor;
    }
    public  void setY(int ycor) {
        y = ycor;
    }
    public void set(int xcor, int ycor){
        setX(xcor);
        setY(ycor);
    }
    public void move(int x1, int y1){
        set(getX() + x1, getY() + y1);
    }
    //initializes the draw method without allowing the user to use it or writing it out
    public abstract void draw();
}

