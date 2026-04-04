// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class countof1s{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=Integer.toBinaryString(n);
        int c=0;
        for(char u:a.toCharArray()){
            if(u=='1'){
                c++;
            }
        }
        System.out.print(c);
    }
}