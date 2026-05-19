// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striver_count_of_frequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        boolean[]v=new boolean[n];
        for(int u=0;u<n;u++){
            int c=0;
            if(!v[u]){
                for(int j=0;j<n;j++){
                    if(arr[u]==arr[j]){
                        c++;
                        v[j]=true;
                    }
                }
                System.out.println(arr[u]+" "+c);
            }
           
        }
    }
}