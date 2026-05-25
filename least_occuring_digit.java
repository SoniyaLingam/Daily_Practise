import java.util.*;

public class least_occuring_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]f=new int[10];
        String s=sc.nextLine();
        ArrayList<Integer>l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        String[]b=s.split(" ");
        for(String x:b){
            int a=Integer.parseInt(x);
            while(a>0){
                int d=a%10;
                f[d]++;
                a/=10;
            }
        }
        for(int u=0;u<10;u++){
            if(f[u]<min && f[u]!=0){
                min=f[u];
            }
        }
        for(int u=0;u<10;u++){
            if(f[u]==min){
                l.add(u);
            }
        }
        Collections.sort(l);
        for(int q:l){
            System.out.print(q+" ");
        }
    }
}