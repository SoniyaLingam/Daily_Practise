// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class striverreverseanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n>0){
            res=(n%10)+res*10;
            n/=10;
        }
        System.out.print(res);
    }
}