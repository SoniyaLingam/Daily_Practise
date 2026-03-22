import java.util.*;
public class rightsidetrianglepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            for(int k=1;k<u+1;k++){
                System.out.print(" ");
            }
            for(int j=u;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}