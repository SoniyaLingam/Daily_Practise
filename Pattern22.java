// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n*2)-1;
        int t=0;
        int b=d-1;
        int l=0;
        int r=d-1;
        int a=n;
        int[][]num=new int[d][d];
        while(t<=b && l<=r){
            
            for(int u=l;u<=r;u++){
                num[t][u]=a;
            }
            t++;
            for(int u=t;u<=b;u++){
                num[u][r]=a;
            }
            r--;
            for(int u=r;u>=l;u--){
                num[b][u]=a;
            }
            b--;
            for(int u=b;u>=t;u--){
                num[u][l]=a;
            }
            l++;
            a--;
            
        }
        for(int u=0;u<d;u++){
            for(int j=0;j<d;j++){
                System.out.print(num[u][j]+" ");
            }
            System.out.println();
        }
    }
}