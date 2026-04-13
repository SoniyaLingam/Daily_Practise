// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class trainjourney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0,sum1=0;
        int[][]m=new int[a][2];
        for(int u=0;u<a;u++){
            for(int j=0;j<2;j++){
                m[u][j]=sc.nextInt();
            }
        }
        for(int u=0;u<a;u++){
            sum+=m[u][0];
            sum1+=m[u][1];
        }
        System.out.print(b+sum-sum1);
        
    }
}