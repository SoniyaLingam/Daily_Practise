import java.util.*;
class median_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        int[]res=new int[r*c];
        int k=0;
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
                res[k]=arr[u][j];
                k++;
            }
        }
        Arrays.sort(res);
        int t=r*c;
        int q=t/2;
        if(t%2==0){
            System.out.print((res[q]+res[q-1])/2);
        }else{
            System.out.print(res[q]);
        }
        
    }
}