// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class fibo_dc{
    public static int fibo(int a){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        return fibo(a-1)+fibo(a-2);
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]>max){
                max=arr[u];
            }
        }
        int[]f=new int[max];
        for(int u=0;u<max;u++){
            f[u]=fibo(u);
        }
        boolean s=false;
        for(int u=0;u<n;u++){
            int b=arr[u];
            for(int c:f){
                if(b==c ){
                    if(c==1 && !s){
                       s=true;
                       System.out.print(b+" ");
                    }
                    if(c!=1){
                        System.out.print(b+" ");
                    }
                    
                }
            }
        }
        
    }
}