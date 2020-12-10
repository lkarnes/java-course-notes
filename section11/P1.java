import java.util.ArrayList;
public class P1 {
    public static void main(String[] args){
        double average;
        int total = 0;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(77);
        grades.add(56);
        grades.add(99);
        for(int i = 0; i < grades.size(); ++i)
            total += grades.get(i);
        average = total / grades.size();
        System.out.print("total:" + total + "\n" + "average: " + average);
    }
}
