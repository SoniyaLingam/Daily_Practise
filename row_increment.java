import java.util.*;
class row_increment{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        int[]arr1=new int[r];
        int k=0;
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
                if(j==c-1){
                    arr1[k]=(arr[u][j])%10;
                    k++;
                }
            }
        }
        int d=0;
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=arr[u][j]+arr1[d];
                System.out.print(arr[u][j]+" ");
            }
            System.out.println();
            d++;
        }
        
        
    }
}