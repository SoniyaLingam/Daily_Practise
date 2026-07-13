import java.util.*;
class sort_Rows_based_on_zeroes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        int[]res=new int[r];
         int[] rank = new int[r];
        boolean[] used = new boolean[r];

        for(int u=0;u<r;u++){
            int co=0;
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
                if(arr[u][j]==0){
                    co++;
                }
            }
            res[u]=co;
        }
        int pos = 1;
        int k=0;
        while (pos <= r) {

            int min = Integer.MAX_VALUE;
            int index = -1;

            
            for (int i = 0; i < r; i++) {
                if (!used[i] && res[i] < min) {
                    min = res[i];
                    index = i;
                }
            }

            rank[k] = index+1;;
            used[index] = true;
            pos++;
            k++;
        }

        for (int i = 0; i < r; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
        
