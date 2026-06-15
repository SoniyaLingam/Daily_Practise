// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class profit_loss{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]arr1=new int[n];
        
        int p=0;
        int l=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            arr1[u]=sc.nextInt();
           
        }
        int m=sc.nextInt();
        for(int u=0;u<n;u++){
             if(arr[u]>arr1[u]){
            double r=((arr[u]-arr1[u])*100)/arr[u];
            if(r>=m){
                l++;
            }
            }
            else{
                double s=((arr1[u]-arr[u])*100)/arr[u];
                if(s>=m){
                    p++;
                }
            }
        }
        System.out.print(p+" "+l);
        
    }
}