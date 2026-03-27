
import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]m=new int[n];
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int u=0;u<n;u++){
            m[u]=sc.nextInt();
            set.add(m[u]);
        }
        for(int x:set){
            System.out.print(x+" ");
        }
    }
}