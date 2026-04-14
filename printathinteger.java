// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class printathinteger{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        for(int u=1;u<=n;u++){
            int c=sc.nextInt();
            if(u%a==0){
                System.out.print(c+" ");
            }
        }
    }
}