// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Consecutive_digits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]arr=s.toCharArray();
        int n=s.length();
        boolean[]f=new boolean[n];
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<n;u++){
            int d=arr[u]-'0';
            int c=0;
            if(f[u]){
                continue;
            }
            for(int j=u+1;j<n;j++){
                
                if(d==arr[j]-'0'){
                    f[j]=true;
                    c++;
                }
                
            }
            if(c==0){
                for(int j=0;j<2;j++){
                    sb.append(d);
                }
            }
            else{
                for(int k=0;k<c+1;k++){
                    sb.append(d);
                }
            }
        }
        System.out.print(sb.toString());
        
    }
}