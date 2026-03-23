import java.util.*;
public class rotate90{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]mat=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        int[][] res=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                res[j][n-u-1]=mat[u][j];
            }
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                System.out.print(res[u][j]+" ");
            }
            System.out.println();
        }
    }
}
