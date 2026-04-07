// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class recursionsum {
    public static int recfun(int n){
        if(n==0){
            return;
        }
        int sum += n;
        recfun(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        recfun(n);
        System.out.println(sum);
    }
}