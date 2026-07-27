import java.util.*;
class sum_of_top_left{
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
        int sum=0;
        int q=r/2;
        int t=c/2;
        if(r%2==0){
            q--;
        }
        if(c%2==0){
            t--;
        }
        for(int u=0;u<=q;u++){
            for(int j=0;j<=t;j++){
                sum+=arr[u][j];
            }
        }
        System.out.print(sum);
    }
}