// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striver_linear_search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=1;
        int m=0;
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        for(int u=0;u<n;u++){
            if(k==arr[u]){
                m=u+1;
                c=0;
                break;
            }
        }
        if(c==0){
            System.out.print("element found at"+m);
        }else{
            System.out.print("element not found");
        }

    }
}