// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class possible_palindrome_by_rearranging{
    public static boolean pali(String res){
        int[]fre=new int[26];
        int n=res.length();
        
        int o=0;
        for(int u=0;u<n;u++){
            int ai=res.charAt(u)-'a';
            fre[ai]++;
        }
        for(int u=0;u<26;u++){
            if(fre[u]%2!=0){
                o++;
            }
        }
        if(o>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]s=sc.nextLine().split(" ");
        int n=s.length;
        int c=0;
        for(int u=0;u<n;u++){
            String a=s[u];
            for(int j=0;j<n;j++){
                if(u==j){
                    continue;
                }
                String b=s[j];
                String res=a+b;
                if(pali(res)){
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}