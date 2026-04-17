// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class uniquenumbercountwithinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        Set<Integer>set=new HashSet<>();
        for(int u=0;u<n;u++){
            int c=sc.nextInt();
            set.add(c);
        }
        for(int j:set){
            if(j>=a && j<=b){
                s++;
            }
        }
        System.out.print(s);
    }
}