import java.util.*;
class Matrix_equal_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int n=sc.nextInt();
        int a=0;
        int b=0;
        int co=0;
        int d=0;
        
        int sum=0;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                sum=arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1];
                if(sum==n){
                    a=arr[i][j];
                    b=arr[i+1][j];
                    co=arr[i][j+1];
                    d=arr[i+1][j+1];
                    System.out.println(a+" "+co);
                    System.out.println(b+" "+d);
                }
            }
        }
    }
}