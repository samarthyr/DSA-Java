import java.util.*;

public class ptrn14{
    public static void main(String args[]){
        int n=4;
        
        //Upper Half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int star=(2*i)-1;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }System.out.println();
        }
        //Lower Half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int star=(2*i)-1;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}