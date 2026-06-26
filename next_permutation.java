import java.util.*;
class next_permutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        
        int k=n-1;
        int a=0;
        while(k>0 && arr[k]<=arr[k-1] ){
                        k--;
                        
            
        }
        if(k==0){
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
            return;
        }
        int index=k-1;
        a=arr[index];
        int b=0;
        for(int u=n-1;u>index;u--){
            if(arr[u]>a){
                b=u;
                break;
            }
        }
        int temp=arr[index];
        arr[index]=arr[b];
        arr[b]=temp;
       
        int left=index+1;
        int right=n-1;
        
        while(left<right){
            int temp1=arr[left];
            arr[left]=arr[right];
            arr[right]=temp1;
            left++;
            right--;
        }
        for(int u=0;u<n;u++){
            System.out.print(arr[u]+" ");
        }
        
        
        
        
    }
}