// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class patternbinarytriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int u=0;u<n;u++){
           

           for(int j=0;j<u+1;j++){
               if(u%2==0){
                   if(j%2==0){
                        System.out.print("0");
                   }else{
                       System.out.print("1");
                   }
               }else{
                   if(j%2!=0){
                       System.out.print("0");
                   }else{
                       System.out.print("1");
                   }
               }
           }
           System.out.println();
        }
    }
}
