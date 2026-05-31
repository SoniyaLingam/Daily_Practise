import java.util.*;
public class striver_smaller{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int s=Integer.MAX_VALUE;
        for(int u=0;u<n;u++){
            int a=sc.nextInt();
            if(a<s){
                s=a;
            }
        }
        System.out.print(s);
        
        
    }
}