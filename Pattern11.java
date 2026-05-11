// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n+(n-2);
        for(int u=0;u<n;u++){
           int c=1;
           for(int j=0;j<u+1;j++){
               System.out.print(c);
               c++;
           }
           for(int k=0;k<d;k++){
               System.out.print(" ");
           }
           d-=2;
           for(int t=u+1;t>0;t--){
               System.out.print(t);
           }
           System.out.println();
       }
    }
}