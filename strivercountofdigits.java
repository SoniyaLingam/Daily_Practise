// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class strivercountofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        System.out.print(c);
    }
}