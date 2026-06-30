import java.util.*;
class floor_and_ceil_sorted_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
       
        
        int k=sc.nextInt();
        int b=0;
        int v=0;
        for(int u=0;u<n;u++){
            
            int a=arr[u];
            if(a>=k){
                int co=0;
                co=a-k;
                if(co<min){
                    min=co;
                    b=arr[u];
                    
                }
            }if(a<=k){
                int c=0;
                c=k-a;
                if(c<min1){
                    min1=c;
                    v=arr[u];
                    
                }
                
                
            }
        }
        System.out.print(b+" "+v);
    }
}