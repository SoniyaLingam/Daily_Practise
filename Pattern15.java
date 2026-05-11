// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a='A';
        for(int u=0;u<n;u++){
          
            for(int j=0;j<u+1;j++){
                System.out.print(a);
    
            }
            a++;
            System.out.println();
        }
    }
}