
import java.util.*;
public class number_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int u=0;u<r;u++){
            int d=u+1;
            for(int j=0;j<c;j++){
                System.out.print(d+" ");
                d++;
            }
            System.out.println();
        }
        
    }
}