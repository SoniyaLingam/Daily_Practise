// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class nxt_number_unit_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        for(int u=0;u<n-1;u++){
            if(arr[u]%10==arr[u+1]%10){
                System.out.print(arr[u]+" ");
            }
        }
    }
}