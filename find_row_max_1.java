import java.util.*;

class find_row_max_1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int co=0;
        int max=0;
        int n=-1;
        
        for(int u=0;u<r;u++){
            co=0;
            for(int j=0;j<c;j++){
                if(arr[u][j]==1){
                    
                     co++;
                }
            }
            if(co>max){
                max=co;
                n=u;
            }
        }
        System.out.print(n);

        
    }
}