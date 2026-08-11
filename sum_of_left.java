// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class sum_of_left{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]num=new int[n];
        for(int u=0;u<n;u++){
            num[u]=sc.nextInt();
        }
        int sum=0;
        for(int u=0;u<n;u++){
            System.out.print(sum+" ");
            sum+=num[u];
            
        }
    }
}