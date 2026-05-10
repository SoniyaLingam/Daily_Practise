// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Pattern9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n*2)-1;
        int a=1;
        int f=n-1;
        for(int c=0;c<=d;c++){
            if(c<n){
            for(int r=0;r<a;r++){
                System.out.print("*");
            }
            a+=1;
            
            System.out.println();
            }
            else if(c>n){
                for(int r=0;r<f;r++){
                    System.out.print("*");
                }
                f-=1;
                System.out.println();
            }
        }
    }
}