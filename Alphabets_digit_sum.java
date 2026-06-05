// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Alphabets_digit_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[]freq=new int[256];
        int n=s.length();
        String s1=s.toLowerCase();
        char[]a=s1.toCharArray();
        boolean[]arr=new boolean[n];
        int sum=0;
        for(int u=0;u<n;u++){
            if(a[u]=='0' || a[u]=='1' || a[u]=='2' || a[u]=='3' || a[u]=='4' || a[u]=='5' || a[u]=='6' || a[u]=='7' || a[u]=='8' || a[u]=='9'){
                sum=sum+a[u]-'0';
                arr[u]=true;
            }
        }
        int ch1=0;
      
        for(int u=0;u<n;u++){
            if(!arr[u]){
                ch1=(int)((a[u]-'a'+sum)%26)+'a';
           
                System.out.print((char)ch1);
            }
            
        }
        
    }
}