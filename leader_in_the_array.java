import java.util.*;
class leader_in_the_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int a=0;
        int b=0;
        for(int u=0;u<n;u++){
            a=arr[u];
            int c=0;
            for(int j=u+1;j<n;j++){
                b=arr[j];
                if(a>b){
                    c++;
                }
            }
            if(c==n-u-1){
                System.out.print(a+" ");
            }
        }
    }
}