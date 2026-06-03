import java.util.*;
public class longest_substring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        
        int l=0;
        int minlen=0;
        StringBuilder sb=new StringBuilder();
        String s=" ";
        boolean f=true;
        int[]freq=new int[256];
        for(int u=0;u<n;u++){
            
            char ch=a.charAt(u);
            freq[ch]++;
            if(freq[ch]<=1){
            sb.append(ch);
            }
            if(freq[ch]>1){
                f=false;
                
                int len=u-l;
                if(len>minlen){
                    minlen=len;
                    s=sb.toString();
                   
                    sb.setLength(0);
                    
                }
                freq = new int[256]; 
                l=u-1;
                
            }
        }
        if(f){
            System.out.print(a);
        }else{
        System.out.print(s);
        }
    }
}