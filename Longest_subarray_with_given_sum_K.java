// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Longest_subarray_with_given_sum_K{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=0;
        int c=0;
        for(int u=0;u<n;u++){
            int sum=arr[u];
            for(int j=u+1;j<n;j++){
                if(sum!=k && sum<k){
                    sum+=arr[j];
                    c++;
                    if(sum==k){
                       if(c>max){
                           max=c;
                           break;
                       } 
                    }
                }
            }
            
        }
        System.out.print(max);
        
        
        
    }
}