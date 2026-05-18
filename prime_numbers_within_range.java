// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class prime_numbers_within_range{
    static boolean isprime(int u){
        if(u<2){
            return false;
        }
        for(int j=2;j<u;j++){
            
            if(u%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int mul=1;
        for(int u=x;u<=y;u++){
            if(isprime(u)){
                mul*=u;
            }
        }
        System.out.print(mul);
    }
}