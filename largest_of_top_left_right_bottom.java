import java.util.*;
class largest_of_top_left_right_bottom{
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
        int ans=Integer.MAX_VALUE;
        boolean f=true;
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                f=true;
                if(u<r-1 && arr[u][j]<=arr[u+1][j]){
                    f=false;
                }else if(u>0 && arr[u][j]<=arr[u-1][j]){
                    f=false;
                }else if(j>0 && arr[u][j]<=arr[u][j-1]){
                    f=false;
                }else if(j<c-1 && arr[u][j]<=arr[u][j+1]){
                    f=false;
                }
                if(f){
                ans=Math.min(ans,arr[u][j]);
            }
            }
            
        }
        System.out.print(ans);
    }
}