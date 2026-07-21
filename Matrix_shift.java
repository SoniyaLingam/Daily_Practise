
import java.util.*;
class Matrix_shift{
    public static int[] lef(int[]arr,int a,int b){
        b=b%a;
        int[]ress=new int[a];
        for(int u=0;u<a;u++){
            ress[(u+b)%a]=arr[u];
        }
        return ress;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n*n;
        int[]arr=new int[n*n];
        int[][]ar=new int[n][n];
        int k=0;
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                ar[u][j]=sc.nextInt();
                arr[k++]=ar[u][j];
            }
        }
        int b=sc.nextInt();
        int[]res=lef(arr,a,b);
        int ko=0;
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                ar[u][j]=res[ko++];
                System.out.print(ar[u][j]+" ");
            }
            System.out.println();
        }
    }
}