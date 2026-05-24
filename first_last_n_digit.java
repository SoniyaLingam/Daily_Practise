// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class first_last_n_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int l=s.length();
        int b=l-n;
        int c=n;
        boolean f=true;
        for(int u=0;u<c;u++){
            if(s.charAt(u)=='0' && f){
                c++;
            }else{
            f=false;
            System.out.print(s.charAt(u)-'0');
            }
        }
        System.out.println();
        for(int u=b;u<l;u++){
            System.out.print(s.charAt(u)-'0');
        }
        
    }
}