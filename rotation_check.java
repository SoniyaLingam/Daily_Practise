import java.util.*;
class rotation_check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int b=0;
        for(int u=0;u<n;u++){
            if(arr[u]<min){
                b=u;
                min=arr[u];
            }
        }
        System.out.print(b);
    }
}