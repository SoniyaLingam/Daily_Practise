// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class halfdiamondpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ki=1;
        for(int u=0;u<n;u++){
            for(int k=0;k<n-u-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<ki;j++){
                System.out.print("*");
               
                
            }
            ki+=2;
            System.out.println();
        }
    }
}