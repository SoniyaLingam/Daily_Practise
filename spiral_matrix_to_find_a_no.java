// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class spiral_matrix_to_find_a_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int y=0;
        int s=0;
        while(top<=bottom && left<=right){
            for(int u=left;u<=right;u++){
                
                s=arr[top][u];
                y++;
                if(y==k){
                    System.out.print(s);
                    return;
                }
            }
            top++;
            for(int u=top;u<=bottom;u++){
                
                s=arr[u][right];
                y++;
                if(y==k){
                    System.out.print(s);
                    return;
                }
                
            }
            right--;
            for(int u=right;u>=left;u--){
                
                s=arr[bottom][u];
                y++;
                if(y==k){
                    System.out.print(s);
                    return;
                }
            }
            bottom--;
            for(int u=bottom;u>=top;u--){
                
                s=arr[u][left];
                y++;
                if(y==k){
                    System.out.print(s);
                    return;
                }
            }
            left++;
            
        }
    }
}