// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class fibbonaci{
    public static int fib(int u){
        if(u==0){
            return 0;
        }
        if(u==1){
            return 1;
        }
        return fib(u-1)+fib(u-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int u=0;u<a;u++){
            System.out.print(fib(u)+" ");
        }
        
    }
}
