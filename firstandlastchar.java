// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class firstandlastchar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[]b=s.toCharArray();
        System.out.print(b[0]);
        System.out.print(b[n-1]);
        
    }
}