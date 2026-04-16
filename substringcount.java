 // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class substringcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();
        int n=a.length();
        int c=0;
        for(int u=0;u<s.length()-n;u++){
            if(a.equals(s.substring(u,u+n))){
                c++;
            }
        }
        System.out.print(c+1);
    }
} 
