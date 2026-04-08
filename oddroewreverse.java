// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class oddroewreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]m=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                m[u][j]=sc.nextInt();
            }
        }
        int[][]res=new int[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                if(u%2==0){
                    res[u][j]=m[u][n-j-1];
                }
                else{
                    res[u][j]=m[u][j];
                }
            }
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                System.out.print(res[u][j]+" ");
            }
            System.out.println();
        }
    }
}