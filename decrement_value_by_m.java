// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class decrement_value_by_m{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            
            if(m%10==0){
                m/=10;
            }else{
            m--;
            }
        }
        System.out.print(m);
    }
}