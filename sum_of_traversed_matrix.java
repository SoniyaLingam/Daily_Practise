// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class sum_of_traversed_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]arr=new int[n][m];
        for(int u=0;u<n;u++){
            for(int j=0;j<m;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int sum=arr[0][0]+Math.max(arr[0][1],arr[1][1]);
        for(int j=2;j<m;j++){
            int max=0;
            for(int u=0;u<n;u++){
                if(max<arr[u][j]){
                    max=arr[u][j];
                }
            }
            sum+=max;
        }
        System.out.print(sum);
    }
}