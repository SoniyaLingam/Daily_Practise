// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class positiondigitsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        
        while(a>0 || b>0){
            s=a%10+b%10;
            a/=10;
            b/=10;
            System.out.print(s+" ");
        }
        
    }
}