// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class expand_alphabets_for_single_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sb="";
        for(int u=0;u<s.length();u++){
            char b=s.charAt(u);
            if(Character.isDigit(b)){
                int c=b-'0';
                while(c>0){
                    System.out.print(sb);
                    c--;
                    
                }
                sb="";

            }
            else{
            sb+=b;
            }
            
        }
    }
}