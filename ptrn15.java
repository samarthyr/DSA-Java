import java.util.*;
public class ptrn15{
    public static void main (String args[]){
        int n=5;

        //Upper part
        for(int i=1;i<=n;i++){
            //first half
            for(int j=1;j<=i;j++){
                if(i==1 | j==1 | j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //second half
            for(int j=1;j<=i;j++){
                if(i==1 | j==1 | j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){
            //first half
            for(int j=1;j<=i;j++){
                if(i==1 | j==1 | j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //second half
            for(int j=1;j<=i;j++){
                 if(i==1 | j==1 | j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}