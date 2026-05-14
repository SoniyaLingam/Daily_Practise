// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striver1tonrecursion{
    static void func(int no,int n){
     
        if(n==0){
            return;
        }
        System.out.print(no+" ");
        func(no+1,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(1,n);
        
    }
}