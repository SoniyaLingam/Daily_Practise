
import java.util.*;
class Sk_flowchart{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        int res=0;
        while(n>0){
            res=(res+((n%10)*p));
            p=p*2;
            n/=10;
        }
        System.out.print(res);
    }
}