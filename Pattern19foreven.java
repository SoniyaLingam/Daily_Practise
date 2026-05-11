// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern19foreven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n/2;
        int a=0;
        int b=0;
        int c=n-2;
        for(int u=0;u<n;u++){
            if(u<d){
            for(int j=0;j<d-u;j++){
                System.out.print("*");
            }
            for(int k=0;k<a;k++){
                System.out.print(" ");
            }
            a+=2;
            for(int j=d-u;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            }
            if(u>=d){
                for(int j=0;j<=b;j++){
                    System.out.print("*");
                }
                for(int k=0;k<c;k++){
                    System.out.print(" ");
                }
                c-=2;
                for(int j=b;j>=0;j--){
                    System.out.print("*");
                }
                b+=1;
                System.out.println();
            }
        }
        
       
    }
}