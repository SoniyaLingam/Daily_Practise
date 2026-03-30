
import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        char[]c=n.toCharArray();
        char[]r=new char[n.length()];
        int s=0;
        for(int u=n.length();u>0;u--){
            r[s]=c[u-1];
            s++;
        }
        System.out.print(new String(r));
       
        
    }
}
