// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class absdifferenceofoddandeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int sum1=0;
        int sum2=0;
        for(int u=0;u<n.length();u++){
            int d=n.charAt(u)-'0';
            if(d%2==0){
                sum1+=d;
            }else{
                sum2+=d;
            }
        }
        System.out.print(Math.abs(sum1-sum2));
    }
}