// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class string_rotation_check{
    public static String rot(String a,int v,int n1){
        char[]arr=a.toCharArray();
        StringBuilder sb=new StringBuilder();
        char[] res=new char[n1];
        for(int u=0;u<n1;u++){
            v=v%n1;
            res[v]=arr[u];
            v++;
        }
        for(int u=0;u<n1;u++){
            sb.append(res[u]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int n1=a.length();
        boolean f=false;
        for(int u=0;u<n1;u++){
            if(rot(a,u,n1).equals(b)){
                System.out.print("YES");
                f=true;
                return;
            }
        }
        if(!f){
            System.out.print("NO");
        }
    }
}