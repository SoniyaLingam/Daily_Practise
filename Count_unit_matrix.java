// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Count_unit_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int u=0;u<n-1;u++){
            for(int j=0;j<n-1;j++){
                int a=arr[u][j]+arr[u+1][j]+arr[u+1][j+1]+arr[u][j+1];
                if(a==4){
                    c++;
                }
                
            }
        }
        System.out.print(c);
    }
}