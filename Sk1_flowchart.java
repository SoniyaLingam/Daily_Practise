
import java.util.*;
class Sk1_flowchart{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ctr=1;
        while(ctr<=n && ctr%2!=0){
            System.out.print(ctr);
            ctr+=2;
        }
    }
}