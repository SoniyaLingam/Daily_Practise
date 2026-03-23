import java.util.*;
public class transpose{
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
                if(u==j){
                    res[u][j]=mat[u][j];
                }
                res[u][j]=mat[j][u];
                
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
