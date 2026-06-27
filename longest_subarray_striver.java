// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class longest_subarray_striver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int c=0;
        int max=0;
        for(int u=0;u<n;u++){
            int sum=arr[u];
            c=0;
            for(int j=u+1;j<n;j++){
                int b=arr[j];
                sum+=b;
                c++;
                if(sum==0){
                    if(c>max){
                        max=c;
                    }
                }
            }
        }
        System.out.print(max+1);
    }
}