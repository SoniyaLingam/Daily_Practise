import java.util.*;
class Maximum_sum_value{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int max=0;
        int sum=arr[0];
        
        for(int u=0;u<n-1;u++){
            if(arr[u+1]>arr[u]){
                sum+=arr[u+1];
            }else{
                if(sum>max){
                    max=sum;
                }
                sum=arr[u+1];
                
                continue;
            }
        }
        if(sum>max){
            max=sum;
        }
        
        System.out.print(max);
    }
}