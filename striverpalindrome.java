// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class striverpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n;
        int res=0;
        while(n>0){
            res=(n%10)+res*10;
            n/=10;
        }
        if(res==b){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("not a palindrome");
        }
    }
}