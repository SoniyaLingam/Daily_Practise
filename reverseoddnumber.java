
import java.util.ArrayList;
import java.util.Scanner;

public class reverseoddnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        while (true) {
            int n=sc.nextInt();            
        }
        int s=n.length();
        for(int u=s;u>0;u--){
            if(u%2==1){
                l.put(n[u]);
            }

        }
        for(int u=0;u<s;u++){
            System.out.print(l[u])
        }
    }
    }

