// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class   Interchange_diagnols_in_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        for(int u=0;u<n;u++){
            
                
            int temp=arr[u][u];
            arr[u][u]=arr[u][n-u-1];
            arr[u][n-u-1]=temp;
                
            
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                System.out.print(arr[u][j]+" ");
                
            }
            System.out.println();
        }
       
    }
}