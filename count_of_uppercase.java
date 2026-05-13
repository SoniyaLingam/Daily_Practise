// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class count_of_uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int c=0;
        for(int u=0;u<n;u++){
            char ch=s.charAt(u);
            if(Character.isUpperCase(ch)){
                c++;
            }
        }
        System.out.print(c);
    }
}