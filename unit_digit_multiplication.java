// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class unit_digit_multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int no=arr[n-1]%10 * arr[0];
        System.out.print(no+" ");
        for(int j=1;j<n;j++){
            int q=arr[j-1]%10*arr[j];
            System.out.print(q+" ");
        }
    }
}