// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class divisibleby23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            int a=sc.nextInt();
            if(a%2==0 && a%3==0){
                System.out.print(a+" ");
            }
        }
    }
}