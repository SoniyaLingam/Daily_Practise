// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class stringreversal1stand2ndhalf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[]s=a.toCharArray();
        
        int n=a.length();
        char[]res=new char[n];
        int k=0;
        if(n%2!=0){
            for(int u=0;u<n;u++){
                if(u<n/2){
                    res[u]=s[n/2-u-1];
                }
                else if(u==n/2){
                    res[u]=s[u];
                }else{
                    res[u]=s[n-k-1];
                    k++;
                }
            }
        }else if(n%2==0){
            for(int u=0;u<n;u++){
                if(u<n/2){
                    res[u]=s[n/2-u-1];
                }

                
                else{
                    res[u]=s[n-k-1];
                    k++;
                }
            }
            
        }
        StringBuilder sb=new StringBuilder();
        for(char d:res){
            sb.append(d);
        }
        System.out.println(sb.toString());
    }
}