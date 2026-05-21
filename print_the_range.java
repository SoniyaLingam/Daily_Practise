// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class print_the_range{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        for(int u=0;u<n-1;u++){
            int q=arr[u];
            int t=arr[u+1];
            if(u%2==0){
                for(int j=q;j<=t;j++){
                    System.out.print(j+" ");
                    
                }
            }
            if(u%2!=0){
                for(int j=t;j>=q;j--){
                    System.out.print(j+" ");
                }
            }
        }
    }
}