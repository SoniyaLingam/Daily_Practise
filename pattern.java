// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("*");
                }
                
                else if(u==j){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}