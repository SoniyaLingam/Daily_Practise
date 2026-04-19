
import java.util.*;
public class appendnstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[]a=new String[n];
        for(int u=0;u<n;u++){
            a[u]=sc.nextLine();
        }
        StringBuilder sb=new StringBuilder();
        for(int u=n-1;u>=0;u--){
            sb.append(a[u]);
        }
        System.out.print(sb.toString());
    }
}
