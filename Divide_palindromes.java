// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Divide_palindromes{
    static boolean palifunc(String c){
        int l=0;
        int r=c.length()-1;
        while(l<r){
            if(c.charAt(l)!=c.charAt(r)){
                    return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int u=1;u<s.length();u++){
            String a=s.substring(0,u);
            String b=s.substring(u);
            if(palifunc(a)&&palifunc(b)){
                System.out.print(a+" "+b);
                
                break;
            }
        }
    }
}