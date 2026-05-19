// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striver_highest_frequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        boolean[]v=new boolean[n];
        int mc=0;
        int s=0;
        for(int u=0;u<n;u++){
            
            if(!v[u]){
                int c=1;
                for(int j=u+1;j<n;j++){
                    if(arr[u]==arr[j]){
                        c++;
                        v[j]=true;
                    }
                    
                }
                if(c>mc){
                    mc=c;
                    s=arr[u];
                }
                
            }
            
        }
        System.out.println(s+" "+mc);
    }
}