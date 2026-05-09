// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=(n*2)-1;
        for(int u=0;u<n;u++){
            for(int k=0;k<u;k++){
                System.out.print(" ");
            }
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            c-=2;
            System.out.println();
        }
    }
}