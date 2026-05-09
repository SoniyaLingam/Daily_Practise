// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            for(int j=0;j<u+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}