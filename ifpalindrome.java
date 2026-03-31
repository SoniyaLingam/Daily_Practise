// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class ifpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int u=0;u<n;u++){
            char ch=a.charAt(u);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        int od=0;
        for(int x:map.values()){
            if(x%2!=0){
                od++;
            }
        }
        if(od>1){
            System.out.print("no");
        }
        else{
            System.out.print("Yes");
        }
        
        
    }
}