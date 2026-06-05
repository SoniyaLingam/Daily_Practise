// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class unique_embedded_decimal_value{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        
        String s=Integer.toBinaryString(n);
        int a=s.length();
        int l=0;
        while(l<a){
            int c=l+1;
           
               while(c<=a){
                
                String e=s.substring(l,c);
                int d=Integer.parseInt(e,2);
                set.add(d);
                c++;
                   
               }
                
            
            l++;
        }
        for(int u:set){
            System.out.print(u+" ");
        }
        
    }
}