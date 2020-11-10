package section5;

public class Name {
    private String first;
    private String middle;
    private String last;
    
    //constructor methods
    public Name(String f, String m, String l)
    {
        first = f;
        middle = m;
        last = l;
    }
    public Name(String f, String l)
    {
        first = f;
        middle = "";
        last = l;
    }
    public Name(String l)
    {
        first = "";
        middle = "";
        last = l;
    }
    //defualt constructor
    public Name()
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
    public static void main(String[] args)
    {
        
    }
}
