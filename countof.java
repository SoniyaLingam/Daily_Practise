import java.util.Scanner;
public class countof{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]w=s.split("\\s+");
        int n=w.length;
        int max=w[0].length();
        for(int u=1;u<n;u++){
            if(max<w[u].length()){
                max=w[u].length();
            }
        }
        System.out.println(n);
        System.out.println(max);

    }
}