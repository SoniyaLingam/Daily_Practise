// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern9onlyodddiamond{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n/2;
        int e=1;
        int a=1;
        int q=n-2;
        int t=n/2;
        for(int u=0;u<n+1;u++){
            if(u<=c){
                for(int k=0;k<t;k++){
                    System.out.print(" ");
                }
                t--;
                for(int j=0;j<a;j++){
                    System.out.print("*");
                }
                a+=2;
                System.out.println();
            }
            if(u==c+1){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            if(u>c){
                
                for(int k=0;k<e;k++){
                    System.out.print(" ");
                }
                e+=1;
                for(int j=0;j<q;j++){
                    System.out.print("*");
                }
                q-=2;
                System.out.println();
            }
        }
       
    }
}