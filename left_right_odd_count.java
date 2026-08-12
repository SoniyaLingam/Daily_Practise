// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class left_right_odd_count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            nums[u]=sc.nextInt();
            if(nums[u]%2!=0){
                arr[u]=1;
            }else{
                arr[u]=0;
            }
        }
        int k=0;
        while(k<n){
            
            int c=0;
            int d=0;
            for(int u=0;u<k;u++){
                if(arr[u]==1){
                    c++;
                }
            }
            for(int u=k+1;u<n;u++){
                if(arr[u]==1){
                    d++;
                }
            }
            if(c==d){
                System.out.print(nums[k]+" ");
            }else{
                System.out.print("-1"+" ");
            }
            k++;
        }

    }
}