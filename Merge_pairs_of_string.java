
import java.util.*;
public class Merge_pairs_of_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<n;j++){
            String a=sc.nextLine();
            String[]b=a.split(" ");
            String c=b[0];
            String d=b[1];
            int e=c.length();
            int f=d.length();
            int g=Math.min(e,f);
            for(int u=0;u<g;u++){
                    System.out.print(c.charAt(u));
                    System.out.print(d.charAt(u));
            }
            if(e!=f){
            int o=Math.max(e,f);
            int h=o-g;
            if(e==o){
                for(int u=g;u<e;u++){
                    System.out.print(c.charAt(u));
                }
            }
            if(f==o){
                for(int u=g;u<f;u++){
                    System.out.print(d.charAt(u));
                }
            }
            }
        System.out.println();   
        }
    }
}