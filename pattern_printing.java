import java.util.*;
class pattern_printing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        int[][]arr=new int[n][n];
        for(int j=0;j<n;j++){
            for(int u=0;u<n-j;u++){
                arr[u][j]=k;
                
                k++;
            }
            
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n-u;j++){
                System.out.print(arr[u][j]+" ");
            }
            System.out.println();
        }
        
    }
}