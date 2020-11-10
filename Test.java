public class Test {
    private String first;
    private String middle;
    private String last;
    
    //constructor methods
    public Test(String f, String m, String l)
    {
        first = f;
        middle = m;
        last = l;
    }
    public Test(String f, String l)
    {
        first = f;
        middle = "";
        last = l;
    }
    public Test(String l)
    {
        first = "";
        middle = "";
        last = l;
    }
    //defualt constructor
    public Test()
    {
        first = "";
        middle = ""; 
        last = "";
    }
    //methods
    public String displayName()
    {
        return first + " " + middle + " " + last;
    }

    public String getInitials()
    {
        return first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
    }
    public String toString()
    {
        return first + " " + middle + " " + last;
    }
}
    
