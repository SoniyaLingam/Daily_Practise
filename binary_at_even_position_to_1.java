// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class binary_at_even_position_to_1{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String n=Integer.toBinaryString(s);
        StringBuilder sb=new StringBuilder();
        int a=n.length();
        for(int u=0;u<a;u++){
            if(u%2!=0){
                sb.append('1');
            }
            else{
                sb.append(n.charAt(u));
            }
        }
        String e=sb.toString();
        int d=Integer.parseInt(e,2);
        System.out.print(d);
        
    }
}