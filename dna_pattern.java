// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class dna_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n/2;
        int k=0;
        int t=(n/2)-2;
       
        while(k<=p){
             for(int u=0;u<n;u++){
            if(u==p-1 || u==p){
                 System.out.print("*");
                 if(u==p){
                        break;
                 }
            }
            
            else{
                System.out.print("-");
            }
            
        }
        System.out.println();
        if(k>=p){
            break;
        }
        for(int u=1;u<n-1;u++){
            if(u<p){
            for(int j=0;j<n;j++){
                
                if(u==p-j-1){
                    System.out.print("*");
                }
                if(u==j-p+1){
                    System.out.print("*");
                    break;
                }
               
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
            }else if(u>p){
                for(int j=0;j<n;j++){
                    if(u==p+j){
                        System.out.print("*");
                    }
                    if(u==n-j+t){
                        System.out.print("*");
                        break;
                    }
                     else{
                    System.out.print("-");
                }
                }
                System.out.println();
            }
            
        }
        k++;

    }
    }
}