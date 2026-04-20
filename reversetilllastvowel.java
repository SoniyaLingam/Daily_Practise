// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class reversetilllastvowel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int u=s.length()-1;u>=0;u--){
            char a=s.charAt(u);
            c=u;
            if(a=='a' || a=='e' || a=='i' || a=='o' ||a=='u'){
                break;
            }
        }
        for(int u=c;u>=0;u--){
            char a=s.charAt(u);
            System.out.print(a);
        }
        int d=s.length()- c;
        int e=s.length()- d + 1;
        for(int u=e;u<s.length();u++){
            char a=s.charAt(u);
            System.out.print(a);
        }
    }
}