import java.util.*;
public class Sumofdiagonal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int s=0;
       int s1=0;
       int n=sc.nextInt();
       int[][]m=new int[n][n];
       for(int u=0;u<n;u++){
           for(int j=0;j<n;j++){
               m[u][j]=sc.nextInt();
           }
       }

       for(int u=0;u<n;u++){
           for(int k=0;k<n;k++){
               if(u==k){
                   s+=m[u][k];
               }
               if(k==n-u-1){
                   s1+=m[u][k];
               }
               
           }
       }
       int d=s-s1;
       System.out.print(d);
          
        
    }
}