// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=1;
        int s=1;
        int di=2;
        for(int u=0;u<n;u++){
            if(n/2>u){
                for(int j=0;j<d;j++){
                    System.out.print("*");
                }
                
                for(int k=s;k<n-u-1;k++){
                    System.out.print(" ");
                }
                for(int j=0;j<d;j++){
                    System.out.print("*");
                }
                d++;
                s++;
            }
            if(n/2==u){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                
            }
           else if(n/2<u){
               for(int j=0;j<n-u;j++){
                   System.out.print("*");
               }
               for(int k=0;k<di;k++){
                   System.out.print(" ");
               }
               di+=2;
               for(int j=0;j<n-u;j++){
                   System.out.print("*");
               }
               
               
           }
           System.out.println();
        }
    }
}
