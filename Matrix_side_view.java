import java.util.*;
class Matrix_side_view{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][]arr=new char[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
               arr[u][j]=sc.next().charAt(0); 
            }
        }
        char a=sc.next().charAt(0);
        if(a=='L' || a=='l'){
            for(int u=0;u<r;u++){
                for(int j=0;j<c;j++){
                    if(arr[u][j]<='z' && arr[u][j]>='a'){
                        System.out.print(arr[u][j]);
                        break;
                    }
                }
            }
        }
        if(a=='r' || a=='R'){
            for(int u=0;u<r;u++){
                for(int j=c-1;j>=0;j--){
                    if(arr[u][j]<='z' && arr[u][j]>='a'){
                        System.out.print(arr[u][j]);
                        break;
                    }
                }
            }
        }
    }
}