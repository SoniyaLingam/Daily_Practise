// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striverprime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=true;
        for(int u=2;u<n;u++){
            if(n%u==0){
                f=false;
                break;
            }
        }
        if(f){
            System.out.print("prime");
        }else{
            System.out.print("not a prime");
        }
    }
}