// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class striveralldivisor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=1;u<=n;u++){
            if(n%u==0){
                System.out.print(u+" ");
            }
        }
    }
}