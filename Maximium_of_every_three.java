// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Maximium_of_every_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]b=new int[n];
        for(int u=0;u<n;u++){
            b[u]=sc.nextInt();
        }
        for(int u=0;u<n;u+=3){
            if(b[u]>b[u+1] && b[u]>b[u+2]){
                System.out.print(b[u]+" ");
            
            }else if(b[u+1]>b[u] && b[u+1]>b[u+2]){
                System.out.print(b[u+1]+" ");
            }else{
                System.out.print(b[u+2]+" ");
            }
        }
        
    }
}