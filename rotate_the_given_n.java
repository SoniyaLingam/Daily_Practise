import java.util.*;
class rotate_the_given_n{
    public static void rot(int[]res,int a,int x){
        a=a%x;
        int[]re=new int[x];
        for(int u=0;u<x;u++){
            re[u]=res[(u+a)%x];
        }
        for(int u=0;u<x;u++){
            System.out.print(re[u]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=n%x;
        int c=n-b;
        int d=x;
        for(int u=0;u<c;u+=x){
            int[]res=new int[x];
            int k=0;
            for(int j=u;j<d;j++){
                res[k]=arr[j];
                k++;
            }
            d+=x;
            rot(res,a,x);
        }
        if(b>0){
            int[]f=new int[b];
            int k=0;
            for(int u=c;u<n;u++){
                f[k]=arr[u];
                k++;
            }
            rot(f,a,b);
        }
    }
}