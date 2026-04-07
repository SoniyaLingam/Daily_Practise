// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class maximumincoloumn {
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
        
        for(int u=0;u<c;u++){
            int max=0;
            for(int j=0;j<r;j++){
                if(m[j][u]>max){
                    max=m[j][u];
                }
                
            }
            System.out.print(max+" ");
        }
    }
}