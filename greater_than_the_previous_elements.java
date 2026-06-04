// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class greater_than_the_previous_elements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int max=0;
        System.out.print(arr[0]+" ");
        for(int u=1;u<n;u++){
           if(arr[u]>max){
               System.out.print(arr[u]+" ");
               max=arr[u];
           }
        }
        
        
    }
}