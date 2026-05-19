
import java.util.*;
public class adj_odd_digits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int j=s.charAt(1);
        if(j%2!=0){
            int q=s.charAt(0)-'0';
            sb.append(q);
        }
        for(int u=1;u<n-1;u++){
            int a=s.charAt(u-1)-'0';
            int b=s.charAt(u+1)-'0';
            if(a%2!=0 && b%2!=0){
                int c=s.charAt(u)-'0';
                sb.append(c);
            }
        }
        int e=s.charAt(n-2)-'0';
        if(e%2!=0){
            int so=s.charAt(n-1)-'0';
            sb.append(so);
        }
        System.out.print(sb.toString());
        
    }
}