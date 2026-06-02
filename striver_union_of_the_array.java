// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striver_union_of_the_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        TreeSet<Integer>set=new TreeSet<>();
        for(int u=0;u<n;u++){
            int s=sc.nextInt();
            set.add(s);
        }
        for(int u=0;u<n1;u++){
            int d=sc.nextInt();
            set.add(d);
        }
        
        for(int a:set){
            System.out.print(a+" ");
        }

    }
}