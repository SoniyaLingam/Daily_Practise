
import java.util.*;
class String_character_mixing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int n=a.length();
        for(int u=0;u<n;u++){
            char s=a.charAt(u);
            for(int j=0;j<n;j++){
                char t=b.charAt(j);
                if(u==j){
                    System.out.print(s);
                }else{
                    System.out.print(t);
                }
            }
            System.out.print(" ");
        }
    }
}