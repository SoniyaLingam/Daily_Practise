// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[]b=a.toCharArray();
        Set<Character>set=new HashSet<>();
        int l=0,m=0;
        for(int r=0;r<a.length();r++){
            while(set.contains(b[r])){
                set.remove(b[l]);
                l++;
            }
            set.add(b[r]);
            m=Math.max(m,r-l+1);
        }
        System.out.print(m);
    }
}