import java.util.*;
public class dt2826{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[]a=sc.nextLine().split("\\s+");
        boolean[]b=new boolean[a.length];
        for(int u=0;u<a.length;u++){
            if(b[u])continue;
            String w1=a[u];
            System.out.print(w1);
            char[]d=w1.toCharArray();
            Arrays.sort(d);
            b[u]=true;
            for(int j=u+1;j<a.length;j++){
                if(b[j])continue;
                String w2=a[j];
                char[]s=w2.toCharArray();
                Arrays.sort(s);
                if(Arrays.equals(d,s)){
                    System.out.print(" "+a[j]);
                    b[j]=true;
                }

            }
            System.out.println();
        }
    }
}