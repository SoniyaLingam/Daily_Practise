import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            for(int s=0;s<n-u-1;s++){
                System.out.print(" ");
            }
            for(int j=0;j<2*u+1;j++){
                System.out.print("*");
            }
             for(int s=0;s<n-u-1;s++){
                System.out.print(" ");
            }  
        
        System.out.println();
        }
    }
}

