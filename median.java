// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]a=new int[3];
        Set<Integer>set=new HashSet<>();
        for(int u=0;u<3;u++){
            a[u]=sc.nextInt();
            set.add(a[u]);
        }
        if(set.size()!=a.length){
            System.out.print("-1");
            return;
        }
        Arrays.sort(a);
        System.out.print(a[1]);
        
        
    }
}