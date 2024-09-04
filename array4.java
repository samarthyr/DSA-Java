//Find the maximum & minimum number in an array of integers.

import java.util.*;

public class array4{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int num[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        //output
        for(int i=0;i<size;i++){
            if(num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                min = num[i];
            }
        }
    }
}