import java.util.*;
class xor_striver{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int c=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int k=sc.nextInt();
        
        for(int u=0;u<n;u++){
            int a=arr[u];
            int xor=0;
            for(int j=u;j<n;j++){
                int b=arr[j];
                xor^=b;
                if(xor==k){
                    c++;
                }
                
            }
        }
        System.out.print(c);
    }
}