// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class striver_array_sorted{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean f=false;
        int n=sc.nextInt();
        int[]arr=new int[n];
        int c=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
         for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                if (f) {
                    c=1;
                };
                f = true;
            }
        }
        if(c==1){
            System.out.print("false");
        }else{
            System.out.print("true");
        }

    }
}