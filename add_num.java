// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.math.BigInteger;
import java.util.*;
class add_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int u=0;u<a;u++){
            int n=sc.nextInt();
            sb.append(n);
        }
        for(int j=0;j<b;j++){
            int q=sc.nextInt();
            sb1.append(q);
        }
        BigInteger q=new BigInteger(sb.toString());
        BigInteger v=new BigInteger(sb1.toString());
        System.out.print(q.add(v));
        
    }
}