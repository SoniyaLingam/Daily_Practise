// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class pattern_row {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        int n=sc.nextInt();
        for(int u=0;u<n+n;u++){
            if(u<n){
                for(int j=0;j<u+1;j++){
                    System.out.print(u+1);
                }
            
            }
            else if(u==n){
                for(int j=0;j<n;j++){
                    System.out.print(n);
                }
            }
            else{
                
                for(int j=0;j<n-k-1;j++){
                    System.out.print(n-k-1);
                }
                k++;
            }
            System.out.println();
        }
        
    }
}
