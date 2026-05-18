// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class string_circular_print{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int a=s.length();
        
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<n;u++){ 
            sb.append(s.charAt(u%a));
        }
        System.out.print(sb.toString());
    }
}