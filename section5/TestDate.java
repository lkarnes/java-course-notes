
public class TestDate {
    public static void main(String[] args)
    {
        Date myDate = new Date(11,18,1998);
        System.out.println(myDate.toString());
        myDate.setDate(2,9,2000);
        System.out.println(myDate.toString());
    }
}
