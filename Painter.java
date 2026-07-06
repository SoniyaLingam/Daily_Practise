import java.util.*;
class Painter{
    public static int func(int[]arr,int h){
        int a=1;
        int b=0;
        for(int u=0;u<arr.length;u++){
            if(b+arr[u]<=h){
                b+=arr[u];
            }else{
                a++;
                b=arr[u];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=0;
        int t=0;
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            max=Math.max(max,arr[u]);
            t+=arr[u];
        }
        for(int u=max;u<=t;u++){
            int q=func(arr,u);
            if(q<=m){
                System.out.print(u);
                return;
            }
        }
        
    }
}