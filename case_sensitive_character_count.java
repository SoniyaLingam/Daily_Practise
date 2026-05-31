// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class case_sensitive_character_count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int q=s.length();
        char t=sc.next().charAt(0);
        int count=0;
        if(t=='u'||t=='U'){
            int d=(char)'A'+n-1;
            for(int u=0;u<q;u++){
                
                if(d==s.charAt(u)){
                    count++;
                }
            }
        }
        else{
            int d=(char)'a'+n-1;
            for(int u=0;u<q;u++){
                
                if(d==s.charAt(u)){
                    count++;
                }
            }
            
        }
        if(count!=0){
            System.out.print(count);
        }else{
            System.out.print("-1");
        }
    }
}