
import java.util.*;
public class  striver_fibonacci{
    static int fun(int n){
        if(n<=1){
            return n;
        }
       
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            System.out.print(fun(u)+" ");
        }
    }
}