// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Maximumvowelscount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String res="";
        String[]a=new String[n];
        int max=0;
        for(int u=0;u<n;u++){
            a[u]=sc.nextLine();
            int c=0;
            for(char b:a[u].toCharArray()){
                if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){
                    c++;
                }
            }  
            if(max<c){
                res=a[u];
                max=c;
            }
            
        }
        System.out.println(res);
    }
}