// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class recpalindrome{
    public static boolean rec(String a,int l,int r){
        if(l>r){
            return true;
        }
        if(a.charAt(l)!=a.charAt(r)){
            return false;
        }
        return rec(a,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        boolean s=rec(a,0,n-1);
        if(s){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        
    }
}