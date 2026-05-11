// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int u=0;u<n;u++){
            for(int j=0;j<u+1;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}