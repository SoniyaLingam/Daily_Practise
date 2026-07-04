import java.util.*;
class capacity_to_ship{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=0;
        int sum=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]>max){
                max=arr[u];
            }
            sum+=arr[u];
        }
        int x=sc.nextInt();
        
        for(int u=max;u<=sum;u++){
            int r=1;
            int curr=0;
            for(int w:arr){
                if(curr+w<=u){
                    curr+=w;
                }else{
                    r++;
                    curr=w;
                }
            }
            if(r<=x){
                System.out.print(u);
                return;
            }
        }
        System.out.print("-1");
    }
}