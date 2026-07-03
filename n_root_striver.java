import java.util.*;
class n_root_striver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=1;
        int r=m;
        while(l<=r){
            int ans=1;
            int mid=(l+r)/2;
            for(int u=0;u<n;u++){
                ans*=mid;
                if(ans>m){
                    break;
                }
            }
            if(ans==m){
                System.out.print(mid);
                return;
            }
            else if(ans>m)r=mid-1;
            else if(ans<m)l=mid+1;
        }
        System.out.print(-1);
    }
}