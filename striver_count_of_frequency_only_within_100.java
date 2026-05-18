// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class  striver_count_of_frequency_only_within_100{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]hash=new int[100];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        for(int u=0;u<n;u++){
            hash[arr[u]]+=1;
        }
        for(int u=0;u<100;u++){
            if(hash[u]>0){
                System.out.println(u+" "+hash[u]);
            }
            
        }
    }
}