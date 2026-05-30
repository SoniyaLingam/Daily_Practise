// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class char_asterisk_alternate_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n*2)-1;
        char c='a';
        for(int u=0;u<n;u++){
            if(u%2==0){
            for(int j=0;j<d;j++){
                if(j%2==0){
                    if(c>'z'){
                        c='a';
                    }
                    System.out.print(c++);
                }
                else{
                    System.out.print("*");
                }
            }
            }
            else{
            for(int j=0;j<d;j++){
                if(j%2!=0){
                     if(c>'z'){
                        c='a';
                    }
                    System.out.print(c++);
                }
                else{
                    System.out.print("*");
                }
            }
            
            }
            System.out.println();
        }
    }
}