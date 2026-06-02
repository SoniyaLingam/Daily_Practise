// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striver_Missing_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=Integer.MIN_VALUE;
        int m=0;
        int k=1;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]>max){
                max=arr[u];
            }
        }
        Arrays.sort(arr);
        for(int u=0;u<max;u++){
            if(arr[u]!=k){
                m=k;
                break;
            }
            k++;
        }
        System.out.print(m);
    }
}