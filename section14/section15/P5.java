import java.util.Random;
public class P5 {
    public static void main(String[] args){
        int rows = 3;
        int cols = 5;
        double average = 0;
        int total = 0;
        int min = 50;
        int max = 100;

        Random rand = new Random(System.currentTimeMillis());
        int[][] grades = new int[rows][cols];
        for(int r = 0; r < rows; ++r){
            for(int c = 0; c < cols; ++c){
                grades[r][c] = rand.nextInt(max-min + 1) + min;
            }
        }
        for(int r = 0; r < rows; ++r){
            int studentAvg = 0;
            System.out.print("Student " + (r + 1) + ": "); 
            for(int c = 0; c < cols; ++c){
                studentAvg += grades[r][c];
                System.out.print(grades[r][c] + " ");    
            }
            System.out.print("Total: "+ studentAvg/cols);
            System.out.println();
        }
        for(int r = 0; r < rows; ++r){
            for(int c = 0; c < cols; ++c){
                total += grades[r][c]; 
            }
            average = (Float.valueOf(total)/Float.valueOf(cols)) / Float.valueOf(rows);   
        }
        System.out.println("The average for the class is " + average);
    }
}
