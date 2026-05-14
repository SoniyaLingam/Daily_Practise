// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striverarmstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int c=0;
        int sum=0;
        int o=n;
        while(n>0){
            n/=10;
            c++;
        }
        while(a>0){
            int res=a%10;
            sum+=Math.pow(res,c);
            a/=10;
        }
        if(sum==o){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}