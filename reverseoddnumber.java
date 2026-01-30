import java.util.Scanner;
public class reverse {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int l=1;
        int r=(n%2==0)?n-1:n-2;
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l+=2;
            r-=2;
        }
        for(int u=0;u<n;u++){
            System.out.print(arr[u]);
        }
    }
    
}


