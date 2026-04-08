// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class sumofedge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]m=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                m[u][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                if(u==0 || u==r-1 || j==0 || j==c-1){
                    sum+=m[u][j];
                }
            }
        }
       System.out.print(sum);
    }
}