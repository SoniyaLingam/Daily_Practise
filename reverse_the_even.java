// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class reverse_the_even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]s=sc.nextLine().split(" ");
        int n=s.length;
        String[]so=new String[n];
        int k=0;
        for(int u=n-1;u>=0;u--){
            so[k]=s[u];
            k++;
        }
        for(int u=0;u<n;u++){
            if(u%2!=0){
                String a=so[u];
                so[u] = new StringBuilder(so[u]).reverse().toString();
            }
            System.out.print(so[u]+" ");
        }
        
    }
}