import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] w=a.trim().split("\\s+");
        StringBuilder r=new StringBuilder();
        int n=w.length;
        for(int u=n-1;u>=0;u--){
            r.append(w[u]);
            if(u!=0)r.append(" ");

        }
        System.out.println(r.toString());

    }
}

