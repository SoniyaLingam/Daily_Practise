// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class hundredthdigitodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int r1=(a/100)%10;
        int r2=(b/100)%10;
        int r3=(c/100)%10;
        if(r1%2!=0){
            System.out.print(a);
            return;
        }else if(r2%2!=0){
            System.out.print(b);
            return;
        }else if(r3%2!=0){
            System.out.print(c);
            return;
        }
    }
}