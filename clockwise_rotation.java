import java.util.*;
class clockwise_rotation {
    public static void rot(int[]arr,int k,int n){
        k=k%n;
        int[]res=new int[n];
        for(int u=0;u<n;u++){
            res[k%n]=arr[u];
            k++;
        }
        for(int u=0;u<n;u++){
            System.out.print(res[u]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int k=sc.nextInt();
        rot(arr,k,n);
        
    }
}