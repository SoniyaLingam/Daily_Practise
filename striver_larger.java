import java.util.*;
public class striver_larger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int s=Integer.MIN_VALUE;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]>s){
                s=arr[u];
            }
        }
        System.out.print(s);
        
        
    }
}