// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class pattern_asterisk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=(n*2)+1;
        int k=1;
        for(int u=0;u<3;u++){
            for(int j=0;j<p;j++){
                if(u==1){
                    if(j%2!=0){
                        System.out.print(k);
                        k++;
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        
    }
}