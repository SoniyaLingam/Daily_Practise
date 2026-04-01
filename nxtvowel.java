// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class nxtvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        for(int u=0;u<n;u++){
            char ne=a.charAt(u);
            for(int j=u+1;j<n;j++){
                char c=a.charAt(j);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    ne=c;
                    break;
                }
            }
            System.out.print(ne);
        }
    }
}