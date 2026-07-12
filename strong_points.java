import java.util.*;
class strong_points{
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
        int co=0;
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                boolean p=true;
                if(u>0 && (arr[u][j]<=arr[u-1][j])){
                    p=false;
                }else if(u<r-1 && (arr[u][j]<=arr[u+1][j])){
                    p=false;
                }else if(j>0 && (arr[u][j]<=arr[u][j-1])){
                    p=false;
                }else if(j<c-1 && (arr[u][j]<=arr[u][j+1])){
                    p=false;
                }
                 if(p){
                co++;
            }
            }
           
        }
        System.out.print(co);
    }
}