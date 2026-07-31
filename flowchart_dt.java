// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class flowchart_dt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ctr=0;
        int sum=0;
        int d=0;
        while(ctr<=n){
            d=ctr*ctr*ctr;
            sum+=d;
            ctr+=1;
        }
        System.out.print(sum);
    }
}