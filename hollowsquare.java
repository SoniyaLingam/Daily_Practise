// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class hollowsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            if(u==0 || u==n-1){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else if(u%2!=0){
               for(int j=0;j<n;j++){
                    System.out.print(" ");
                }
            }
            else if(u%2==0){
                for(int j=0;j<n;j++){
                    if(j==0 || j==n-1){
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