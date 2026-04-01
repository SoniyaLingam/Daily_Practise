// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class basicrecursion {
    public static void rec(int n){
        if(n==0){
            return;
        }
        System.out.print("Soni ");
        rec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rec(n);
        
    }
}