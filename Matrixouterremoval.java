// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Matrixouterremoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]mat=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        for(int u=1;u<n-1;u++){
            for(int j=1;j<n-1;j++){
               
                System.out.print(mat[u][j]+" ");
                
            }
            System.out.println();
        }
        
    }
}