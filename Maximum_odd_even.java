import java.util.*;
class Maximum_odd_even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        
        for(int u=0;u<n;u++){
            int max=0;
            int max1=0;
            if(arr[u]%2==0){
                max=arr[u];
                for(int j=u;j<n;j++){
                    if(arr[j]%2==0 && arr[j]>max){
                        max=arr[j];
                    }
                }
                System.out.print(max+" ");
            }
            
            else if(arr[u]%2!=0){
                max1=arr[u];
                for(int j=u;j>=0;j--){
                    if(arr[j]%2!=0 && arr[j]>max1){
                        max1=arr[j];
                    }
                }
                System.out.print(max1+" ");
            }
        }
        
    }
}