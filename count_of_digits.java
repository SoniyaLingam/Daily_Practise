// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class count_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        
        for(int u=0;u<n;u++){
            int c=0;
            String b=sc.next();
            int n1=Integer.parseInt(b);
            while(n1>0){
                int res=n1%10;
                if(res==a){
                    c++;
                }
                n1/=10;
            }
            System.out.print(c+" ");
        }
        
    }
}