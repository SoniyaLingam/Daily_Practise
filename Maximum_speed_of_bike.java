// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Maximum_speed_of_bike{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=40;
        int max=0;
        for(int u=0;u<n;u++){
            int c=sc.nextInt();
            if(c==a || c==b){
                if(c==a){
                    s+=a;
                }else{
                    s-=b;
                }
            }
            if(s>max){
                max=s;
            }
        }
        System.out.print(max);
    }
}