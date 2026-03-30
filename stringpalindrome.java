// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        char[]c=n.toCharArray();
        char[]r=new char[n.length()];
        int s=0;
        for(int u=n.length();u>0;u--){
            r[s]=c[u-1];
            s++;
        }
        String a=new String(r);
        if(a.equals(n)){
            System.out.print("Yes");
        }else{
            System.out.print("no");
        }
    
       
        
    }
}
