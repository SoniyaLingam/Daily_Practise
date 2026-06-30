import java.util.*;
class lower_bound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int k=sc.nextInt();
        int e=-1;
        int min=Integer.MAX_VALUE;
        for(int u=0;u<n;u++){
            if(arr[u]<k){
                int b=k-arr[u];
                if(b<min){
                    min=b;
                    e=u;
                }
            }
        }
        System.out.print(e+1);
        
        
    }
}