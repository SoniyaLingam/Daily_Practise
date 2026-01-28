import java.util.Scanner;
public class dc281{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int d=sc.nextInt();
        int w=sc.nextInt();
        int[][] n=new int[s][d];
        for(int u=0;u<s;u++){
            for(int j=0;j<d;j++){
                n[u][j]=w;
                System.out.print(n[u][j]+" ");


            }
            System.out.println();
        }
    }
}
