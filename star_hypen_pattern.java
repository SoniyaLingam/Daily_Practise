// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class star_hypen_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n/2;
        for(int u=0;u<n;u++){
            if(u<=d){
                for(int j=0;j<u+1;j++){
                    if((u%2==0 && j%2!=0) || (u%2!=0 && j%2==0)){
                        System.out.print("-");
                    }else{
                        System.out.print("*");
                    }
                }
            }else{
                for(int j=0;j<n-u;j++){
                   if((u%2==0 && j%2!=0) || (u%2!=0 && j%2==0)){
                       System.out.print("-");
                   }else{
                       System.out.print("*");
                   }
                }
                
            }
            System.out.println();
        }
    }
}