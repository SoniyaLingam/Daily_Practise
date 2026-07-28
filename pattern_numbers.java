// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class pattern_numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=n*2;
        int ki=0;
        for(int u=0;u<=n;u++){
            int k=n-u+1;
            int d=n;
            int c=0;
            for(int j=0;j<=q;j++){
                if(u==j){
                    System.out.print("0");
                }
                if(u>j){
                    System.out.print(k);
                    k++;
                    
                }
                
                if(u<j && c<ki){
                    System.out.print(d);
                    c++;
                    d--;
                }
            }
            ki+=1;
            System.out.println();
        }
    }
}