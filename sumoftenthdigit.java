// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class sumoftenthdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int u=0;u<n;u++){
            int a=sc.nextInt();
            s+=(a/10)%10;
        }
        System.out.print(s);
    }
}