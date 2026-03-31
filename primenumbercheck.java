// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class primenumbercheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0 || n==1){
            System.out.print("no");
            return;
        }
        for(int u=2;u<n;u++){
            if(n%u==0){
                System.out.print("no");
                return;
            }
        }
        System.out.print("yes");
    }
}