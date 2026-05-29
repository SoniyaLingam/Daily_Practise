// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Circular_round{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int d=0;
        
        do{
            
           
            c+=b;
            if(c>n){
                c = ((c - 1) % n) + 1;
                
            }
            
            d++;
        }while(c!=a);
        System.out.print(d);
    }
}