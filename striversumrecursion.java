// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striversumrecursion{
    static int func(int n){
        if(n==0){
            return 0;
        }
        return func(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=func(n);
        System.out.print(res);
    }
}