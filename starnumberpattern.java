// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class starnumberpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n/2;
        int a=1;
        int b=1;
        int e=(n-3)/2;
        for(int u=0;u<n;u++){
            if(u==d){
                for(int j=0;j<n;j++){
                    System.out.print(a);
                    a++;
                }
            }
            for(int j=0;j<n;j++){
                if((u==j || u==n-j-1)&& u!=d && j!=d){
                    System.out.print("*");
                }else if(j==d && u!=d ){
                    System.out.print(u+1);
                    
                }else if(u!=d && j!=d && u!=j && u!=n-j-1){
                    System.out.print("-");
                }
            }
            
            System.out.println();
        }
    }
}