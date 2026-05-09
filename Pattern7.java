// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int u=0;u<n;u++){
            for(int k=0;k<n-u-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            c+=2;
            System.out.println();
        }
    }
}