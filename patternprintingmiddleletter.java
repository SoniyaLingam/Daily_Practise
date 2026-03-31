// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class patternprintingmiddleletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        
        for(int u=0;u<n;u++){
            for(int k=0;k<n-u-1;k++){
                System.out.print("*");
            }
            int k=0;
            int so=0;
            for(int j=n-u-1;j<n;j++){
                
                if(k<=n/2){
                    char a=s.charAt((n/2)+k);
                    System.out.print(a);
                    k++;
                }else{
                    char b=s.charAt(so);
                    System.out.print(b);
                    so++;
                    
                }
            }
            System.out.println();
        }
    }
}