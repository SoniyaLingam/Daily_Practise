// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern17a{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            char a='A';
            for(int k=0;k<n-u-1;k++){
                System.out.print(" ");
            }
            
            for(int j=0;j<u+1;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}