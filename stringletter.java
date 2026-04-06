// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class stringletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        Set<Character>set=new HashSet<>();
        for(char u:s.toCharArray()){
            set.add(u);
        }
        int distinct=set.size();
        int l=0,c=0,min=Integer.MAX_VALUE;
        Map<Character,Integer>map=new HashMap<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1){
                c++;
            }
            while(c==distinct){
                min=Math.min(min,r-l+1);
                char lch=s.charAt(l);
                map.put(lch,map.get(lch)-1);
                if(map.get(lch)==0){
                    c--;
                }
                l++;
            }
        }
        System.out.print(min);
    }
}