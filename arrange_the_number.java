// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class arrange_the_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]freq=new int[9];
       
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            freq[arr[u]]++;
        }
        int a=0;
       for(int u=0;u<9;u++){
           int min=0;
           for(int j=0;j<9;j++){
               if(min<freq[j]){
                   min=freq[j];
                   a=j;
               }
              
           }
           freq[a]=0;
           for(int uo=0;uo<min;uo++){
               System.out.print(a+" ");
           }
           
       }
       
            
        
        
        
    }
}