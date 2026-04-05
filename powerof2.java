
import java.util.*;
public class powerof2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>2){
            a/=2;
            
        }
        if(a%2==0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        
    }
}