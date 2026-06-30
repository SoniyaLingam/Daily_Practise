import java.util.*;
class repeating_and_missing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int[]f=new int[n+1];
        for(int u=0;u<n;u++){
            int a=arr[u];
            f[a]++;
        }
        for(int u=1;u<=n;u++){
            if(f[u]>1){
                System.out.print(u+" ");
            }else if(f[u]==0){
                System.out.print(u+" ");
            }
        }
    }
}