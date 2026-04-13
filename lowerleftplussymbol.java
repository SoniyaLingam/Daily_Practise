// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class lowerleftplussymbol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            for(int k=0;k<u;k++){
                System.out.print("+"+" ");
            }
            for(int j=u;j<n;j++){
                System.out.print(n-u+" ");
            }
            System.out.println();
        }
        
    }
}