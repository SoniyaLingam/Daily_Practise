import java.util.*;
class factors_less_than{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        boolean f=false;
        for(int u=0;u<n;u++){
            int b=arr[u];
            int c=0;
            for(int j=1;j<=b;j++){
                if(b%j==0){
                    c++;
                }
            }
            if(c<=x){
                System.out.print(b+" ");
                f=true;
           
            }
        }
        if(!f){
            System.out.print("-1");
        }
    }
}