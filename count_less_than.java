// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class count_less_than{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int q=Math.min(m,n);
        int c=0;
        int[]arr1=new int[m];
        int[]arr2=new int[n];
        for(int u=0;u<m;u++){
            arr1[u]=sc.nextInt();
        }
        for(int u=0;u<n;u++){
            arr2[u]=sc.nextInt();
        }
        for(int u=0;u<q;u++){
            if(arr1[u]<=arr2[u]){
                c++;
            }
        }
        System.out.print(c);
        
    }
}