import java.util.Random;
public class P4 {
    public static void main(String[] args){
        //2 dementional array defined by two set of brackets one for columns and one for rows 
        final int rows = 5;
        final int columns = 5;
        Random rand = new Random(System.currentTimeMillis());
        int[][] numbers = new int[rows][columns];

        for(int r = 0; r < rows; ++r) {
            for(int c = 0; c < columns; ++c){
                numbers[r][c] = rand.nextInt(101);
            }
        }
        //other intialization for 2d arrays
        // int[][] nums = {{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
    }
}
