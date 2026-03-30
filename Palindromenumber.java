// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n;
        int rev=0;
        while(n>0){
            
            
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
       if(rev==s){
           System.out.print("True");
       }else{
           System.out.print("False");
       }
    }
}