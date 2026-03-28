// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class pyramidnumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=1;
       
        
        for(int u=0;u<n;u++){
            for(int k=0;k<n-u-1;k++){
                System.out.print(" ");
            }
            int s=1;
            for(int j=0;j<d;j++){
               if(u>j-1){
                   System.out.print(s);
                   s++;
               }else{
                   System.out.print(s-2);
                   s--;
                   
               }
            }
            d+=2;
            
            System.out.println();
        }
    }
}