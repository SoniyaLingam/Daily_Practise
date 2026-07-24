
import java.util.*;
class skillrack_flowchart{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double m=sc.nextDouble();
        int n=sc.nextInt();
        while(n>0){
            m/=10;
            n--;
        }
        System.out.printf("%.4f",m);
    }
}