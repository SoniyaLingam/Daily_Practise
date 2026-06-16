// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Prime_number_of_setbits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean wf=false;
        for(int u=a;u<=b;u++){
            int q=0;
            String c=Integer.toBinaryString(u);
            
            char[]arr=c.toCharArray();
            for(char g:arr){
                if(g=='1'){
                    q++;
                }
            }
            if(q==0 || q==1){
                continue;
            }
            boolean f=false;
            for(int j=2;j<q;j++){
                if(q%j==0){
                    f=true;
                    break;
                }
            }
            if(!f){
                wf=true;
                System.out.print(u+" ");
            }
            
        }
        if(!wf){
            System.out.print("-1");
        }
    }
}