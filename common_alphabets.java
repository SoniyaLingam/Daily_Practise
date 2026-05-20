// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class common_alphabets{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[]f=new int[26];
        for(int u=0;u<n;u++){
            String s=sc.next();
            boolean[]v=new boolean[26];
            for(int j=0;j<s.length();j++){
                int a=s.charAt(j)-'a';
                if(!v[a]){
                    f[a]++;
                    v[a]=true;
                }
            }
        }
        int c=0;
        for(int j=0;j<26;j++){
            if(f[j]==n){
                c++;
            }
        }
        System.out.print(c);
    }
}