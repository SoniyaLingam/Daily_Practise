import java.util.*;
public class factrec{
    public static int factrec(int n){
        if(n==1){
            return 1;
        }
        return n*factrec(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factrec(n);
        System.out.print(fact);
    }
}