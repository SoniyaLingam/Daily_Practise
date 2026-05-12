// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n/2)+1;
        for(int u=0;u<n;u++){
            if(u==0 || u==n-1){
                for(int j=0;j<d;j++){
                    System.out.print("*");
                }
            }else if(u%2==0){
                for(int j=0;j<d+1;j++){
                    if(j==0 || j==d-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
       
    }
}