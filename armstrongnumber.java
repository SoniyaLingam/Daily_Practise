// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class armstrongnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n;
        int a=0;
        int t=n;
        while(t>0){
            a++;
            t/=10;
        }
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(int)Math.pow(d,a)+rev;
            n/=10;
        }
        if(rev==s){
            System.out.print("Yes");
        }else{
            System.out.print("no");
        }
        
        
    
       
        
    }
}