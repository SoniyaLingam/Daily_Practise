// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class reversearrayrecursion {
    public static void rec(int m[],int u){
        int n=m.length;
        if(u==n/2){
            return;
        }
        if(u<n/2){
            int t=m[u];
            m[u]=m[n-u-1];
            m[n-u-1]=t;
            
        }
        rec(m,u+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]m=new int[n];
        for(int u=0;u<n;u++){
            m[u]=sc.nextInt();
        }
        rec(m,0);
        for(int u=0;u<n;u++){
            System.out.print(m[u]+" ");
        }
        
    }
}