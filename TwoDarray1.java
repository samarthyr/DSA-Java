import java.util.*;

public class TwoDarray1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        //2d array
        int[][] number = new int[row][col];

        //input
        //row
        for(int i=0;i<row;i++){
            //cols
            for(int j=0;j<col;j++){
                number[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(number[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}