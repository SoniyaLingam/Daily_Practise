import java.util.*;
public class recursionsum{
    public static int recsum(int n){
        if(n==1){
            return 1;
        }
        return n+recsum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=recsum(n);
        System.out.print(sum);
    }
}
