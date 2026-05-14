// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class strivernto1recursion{
    static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n);
        
    }
}