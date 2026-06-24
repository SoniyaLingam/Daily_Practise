// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class String_expansion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int u=0;u<n;u++){
            for(int j=0;j<=u;j++){
                char a=s.charAt(j);
                System.out.print(a);
            }
        }
    }
}