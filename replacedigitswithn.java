// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class replacedigitswithn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        char[]a=n.toCharArray();
        int b=n.length();
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<b;u++){
            int y=a[u]-'0';
            y=y-1;
            if(y<b){
                sb.append(a[y]);
            }else{
                sb.append("0");
            }
        }
        System.out.print(sb.toString());
        
    }
}