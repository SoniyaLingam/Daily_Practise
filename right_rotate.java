// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class right_rotate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[]res=new int[n];
        for(int u=0;u<n;u++){
            res[(u+k)%n]=arr[u];
        }
        for(int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
    }
}