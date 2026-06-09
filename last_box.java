// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class last_box{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--){
            if(arr[j]%10==0){
                System.out.print(arr[j]);
                return;
            }
        }
        System.out.print(arr[0]);
    }
}