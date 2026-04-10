// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class characterrepeatntimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt();
        Map<Character,Integer>map=new HashMap<>();
        
        for(char b:a.toCharArray()){
            map.put(b,map.getOrDefault(b,0)+1);
        }
       for(char c:a.toCharArray()){
           int q=map.get(c);
           if(q==n){
               System.out.print(c);
               map.put(c,0);
               
           }
       }
    }
}