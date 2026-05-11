// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Consonants_in_the_odd_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int u=0;u<n;u++){
            if(u%2==0){
                char c=s.charAt(u);

                if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')){
                    char ch=Character.toUpperCase(c);
                    System.out.println(c+" "+(int)c+" "+ch+" "+(int)ch);
                    
                }

            }
        }
    }
}