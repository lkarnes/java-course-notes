public class P5 {
    public static void main(String[] args){
        Time theTime = new Time(9,0,0);
        System.out.println(theTime.display());
        theTime.incrementMinutes(1);
        System.out.println(theTime.display());
        theTime.incrementMinutes(20);
        System.out.println(theTime.display());
        theTime.incrementMinutes(50);
        System.out.println(theTime.display());
    }
}
