import java.util.*;
class vertical_zig_zag{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int k=1;
        for(int u=0;u<n;u++){
            
                if(u%2==0){
                    for(int j=0;j<n;j++){
                    if(arr[j][u]!=k){
                        System.out.print("NO");
                        return;
                    }
                    k++;
                    }
                }
                else if(u%2!=0){
                    for(int j=n-1;j>=0;j--){
                    if(arr[j][u]!=k){
                        System.out.print("NO");
                        return;
                    }
                    k++;
                    }
                }
        }
            System.out.print("YES");
    }
        
        
}
