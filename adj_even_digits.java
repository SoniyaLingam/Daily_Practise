// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class adj_even_digits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int q=s.length();
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<q;u++){
            if(u==0){
                int d=s.charAt(u+1)-'0';
                if(d%2==0){
                    sb.append(s.charAt(u)-'0');
                }
            }
            if(u==(q-1)){
                int d=s.charAt(u-1)-'0';
                if(d%2==0){
                    sb.append(s.charAt(u)-'0');
                }
            }
            if(u!=0 && u!=(q-1)){
                int so=s.charAt(u-1)-'0';
                int d=s.charAt(u+1)-'0';
                if(so%2==0 && d%2==0){
                    sb.append(s.charAt(u)-'0');
                }
            }
        }
        String t=sb.toString();
        int f=t.length();
        if(f>0){
        
        System.out.print(t);
        }else{
            System.out.print("-1");
        }
    }
}