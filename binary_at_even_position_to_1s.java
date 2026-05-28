// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class binary_at_even_position_to_1s{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String n=Integer.toBinaryString(s);
        int a=Integer.parseInt(n);
        StringBuilder sb=new StringBuilder();
        int c=0;
        while(a>0){
            int d=a%10;
            if(c%2!=0){
                sb.append('1');
               
            }else{
                
                sb.append(d);
                
            }
            a/=10;
            c++;
        }
        
        sb.reverse();
        String sb1=sb.toString();
        //int no=Integer.parseInt(sb1);
        int so=Integer.parseInt(sb1,2);
        System.out.print(so);
        
    }
}