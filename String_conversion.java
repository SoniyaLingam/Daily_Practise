import java.util.*;
class String_conversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int n=a.length();
        int n1=b.length();
        int[]fre=new int[26];
        for(int u=0;u<n1;u++){
            int c=b.charAt(u)-'A';
            fre[c]++;
        }
        for(int u=0;u<n;u++){
            char d=a.charAt(u);
            if(d>='A' && d<='Z'){
                int f=d-'A';
                if(fre[f]>0){
                    int v=d-'A';
                    fre[v]--;
                    continue;
                }else{
                    System.out.print("No");
                    return;
                }
            }else if(d>='a' && d<='z'){
                char s=Character.toUpperCase(d);
                int v=s-'A';
                fre[v]--;
            }
        }
        int bo=0;
        for(int u=0;u<26;u++){
            if(fre[u]>0){
                bo=1;
                break;
            }
        }
        if(bo==1){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
        
        
    }
}