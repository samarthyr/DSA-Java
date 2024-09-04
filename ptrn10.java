//butterfly pattern

import java.util.*;
public class ptrn10{
    public static void main (String args[]){
        int n=5;
        //Upper part
        for(int i=1;i<=n;i++){
            //First part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){
            //First part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}