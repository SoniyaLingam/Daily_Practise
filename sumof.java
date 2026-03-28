// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class sumof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[]m=new double[n];
        int sum1=0,sum2=0;
        for(int u=0;u<n;u++){
            m[u]=sc.nextDouble();
            int a=(int)m[u];
            double b=a+0.5;
            if(m[u]<=b){
                sum2+=a;
            }else{
                sum1+=a;
            }
        }
        System.out.print(sum1+" ");
        System.out.print(sum2);
        
    }
}