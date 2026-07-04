import java.util.*;
class Rotate_clockwise_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int[][]res=new int[n][n];
        int k=0;
        for(int j=0;j<n;j++){
            k=0;
            for(int u=n-1;u>=0;u--){
                res[j][k]=arr[u][j];
                k++;
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