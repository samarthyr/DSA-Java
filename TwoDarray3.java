
//Transpose of the matrix

import java.util.*;

public class TwoDarray3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        //2d array
        int[][] matrix = new int[row][col];

        //input
        //row
        for(int i=0;i<row;i++){
            //cols
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Transpose of the matrix:");
        //output
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}