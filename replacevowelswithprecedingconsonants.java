// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class replacevowelswithprecedingconsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        
        for(int uo=0;uo<s.length();uo++){
            char u=s.charAt(uo);
            if(u=='a' || u=='e' || u=='i' || u=='o' || u=='u'){
                sb.append(sb.charAt(sb.length() - 1));
            }else{
                sb.append(u);
            }
        }
        System.out.print(sb.toString());
    }
}