// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class l_maximum_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int max=0;
        for(int u=0;u<r-1;u++){
            
            for(int j=0;j<c-1;j++){
                int d=arr[u][j]+arr[u+1][j]+arr[u+1][j+1];
                if(d>max){
                    max=d;                
                    
                }
            }
        }
        System.out.print(max);
    }
}