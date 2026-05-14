// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class strivergcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            int res=b;
            b=a%b;
            a=res;
        }
        System.out.print(a);
    }
}