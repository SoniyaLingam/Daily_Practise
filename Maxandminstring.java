// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Maxandminstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]s=sc.nextLine().split(" ");
        String m="";
        String mi="";
        int max=0;
        int min=Integer.MAX_VALUE;
        for(String u:s){
           
             
            if(u.length()==0)continue;
            if(u.length()>max){
                m=u;
                max=u.length();
            }
            if(u.length()<min){
                mi=u;
                min=u.length();
            }
        }
        System.out.print(m+" "+mi);
        
    }
}