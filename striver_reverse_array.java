// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class  striver_reverse_array{
    static void fun(int[]arr,int strt,int end){
        if(strt>=end){
            return;
        }
        int t=arr[strt];
        arr[strt]=arr[end];
        arr[end]=t;
        fun(arr,strt+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        fun(arr,0,n-1);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}