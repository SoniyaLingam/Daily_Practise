
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class non_alphabets{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int u=0;u<n;u++){
            char a=s.charAt(u);
            if(!((a>='A'&&a<='Z')||(a>='a' && a<='z'))){
                System.out.print(a);
            }
        }
    }
}