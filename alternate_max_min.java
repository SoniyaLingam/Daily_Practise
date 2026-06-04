// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class alternate_max_min{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        for(int u=0;u<n;u++){
            for(int j=u+1;j<n;j++){
                if(arr[u]>arr[j]){
                    int temp=arr[u];
                    arr[u]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int i=0;
        int j=n-1;
        if(n%2==0){
            while(i<j){
                System.out.print(arr[j]+" "+arr[i]+" ");
                i++;
                j--;
            }
            
        }
        else{
            while(i<=j){
                if(i==j){
                    System.out.print(arr[i]+" ");
                    i++;
                    break;
                }
                System.out.print(arr[j]+" "+arr[i]+" ");
                i++;
                j--;
            }
        }
        
        
    }
}