// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class flowchart_with_function{
    public static void printseries(int m,int n){
        int ctr=m;
        while(ctr>=n){
            System.out.print(ctr);
            ctr--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int ctr;
        if(x>y){
            printseries(x,y);
        }else{
            printseries(y,x);
        }
        if(y>z){
            printseries(y,z);
        }
        else{
            printseries(z,y);
        }
    }
}