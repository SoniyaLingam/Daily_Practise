import java.util.*;
class horizontal_vertical_zig_zag{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        int k=1;
        int s=1;
        for(int u=0;u<n;u++){
            if(u%2==0){
            for(int j=u;j<n;j++){
                
                arr[u][j]=k;
                k++;
            }
            }
            else{
                for(int j=n-1;j>=u;j--){
                    arr[u][j]=k;
                    k++;
                }
            }
            
        }
        for(int u=0;u<n;u++){
            if(u%2==0){
                for(int j=u;j<n;j++){
                    if(u==j){
                        s++;
                        continue;
                    }
                    arr[j][u]=s;
                    s++;
                }
            }else{
                for(int j=n-1;j>=u;j--){
                    if(u==j){
                        s++;
                        continue;
                    }
                    arr[j][u]=s;
                    s++;
                }
            }
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                System.out.print(arr[u][j]+" ");
            }
            System.out.println();
        }
    }
    
}