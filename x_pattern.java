// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class x_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                if(j==0 || u==0 || u==n-1 || j==n-1){
                    System.out.print("*");
                }
                else if(u==j || u==n-j-1){
                    System.out.print("*");
                }
                else if(!(u==j || u==n-j-1)){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}