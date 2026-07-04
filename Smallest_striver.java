// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Smallest_striver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(max<arr[u]){
                max=arr[u];
            }
        }
        int x=sc.nextInt();
        for(int u=1;u<=max;u++){
            int no=u;
            int c=0;
            for(int uo=0;uo<n;uo++){
                if(arr[uo]%no==0){
                    int a=arr[uo]/no;
                    c+=a;
                }else{
                    int b=(arr[uo]/no)+1;
                    c+=b;
                }
                
            }
            if(c<=x){
                System.out.print(u);
                return;
            }
        }
        System.out.print("-1");
        
    }
}