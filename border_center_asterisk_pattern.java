// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class border_center_asterisk_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        int k=1;
        int s=n/2;
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
               if((u==n-1 || u==0)||(j==0 || j==n-1)){
                   System.out.print("*"+" ");
               }
               
               else{
                   if(u==s &&j==s){
                       k++;
                       System.out.print("*"+" ");
                       continue;
                   }
                   System.out.print(k+" ");
                   k++;
               }
            }
            System.out.println();
        }
    }
}