import java.util.*;
public class snake{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]mat=new int[n][n];
        int s=1;
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                if(u%2!=0){
                    
                    mat[u][n-j-1]=s;
                    s++;
                    
                    
                }
                else{
                    mat[u][j]=s;
                    s++;
                }
            }
            
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                System.out.print(mat[u][j]+" ");
            }
            System.out.println();
        }
    }
}