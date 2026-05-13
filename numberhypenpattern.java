// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class numberhypenpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n*2)+1;
        int a=n;
        int b=1;
        for(int u=0;u<n;u++){
            for(int j=0;j<n-u;j++){
                System.out.print(a);
            }
            for(int k=0;k<b;k++){
                System.out.print("-");
            }
            for(int j=n+1;j<d-u;j++){
                System.out.print(a);
            }
            a--;
            b+=2;
            System.out.println();
        }
    }
}