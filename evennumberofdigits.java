// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class evennumberofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            int a=sc.nextInt();
            int o=a;
            int c=0;
            while(a>0){
                a/=10;
                c++;
            }
            if(c%2==0){
                System.out.print(o+" ");
            }
        }
    }
}