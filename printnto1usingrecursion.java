// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class printnto1usingrecursion{
    public static void rec(int n){
        
        if(n==0){
            return;
        }
        
    
        rec(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        rec(n);
       
    }
}