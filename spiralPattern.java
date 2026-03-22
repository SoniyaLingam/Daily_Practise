// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class spiralPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]mat=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        int left=0;
        int top=0;
        int bottom=r-1;
        int right=c-1;
        while(top<=bottom && left<=right){
            for(int u=left;u<=right;u++){
                System.out.print(mat[top][u]+" ");
            }
            top++;
            for(int u=top;u<=bottom;u++){
                System.out.print(mat[u][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int u=right;u>=left;u--){
                    System.out.print(mat[bottom][u]+" ");
                }
                bottom--;
            }else if(left<=right){
                for(int u=bottom;u>=top;u--){
                    System.out.print(mat[u][left]+" ");
                }
                left++;
            }
        }
    }
}