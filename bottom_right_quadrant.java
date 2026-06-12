import java.util.*;
public class bottom_right_quadrant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int p=n/2;
        
        
        for(int u=p;u<n;u++){
            for(int j=p;j<n;j++){
                System.out.print(arr[u][j]+" ");
            }
            System.out.println();
        }
    }
}