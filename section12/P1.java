public class P1 {
    public static void main(String[] args){
        Time theTime = new Time();
        System.out.println(theTime.display());
        theTime.setTime(1, 12, 11);
        System.out.println(theTime.display());
        theTime.setHours(12);
        System.out.println(theTime.getHours());
    }
}