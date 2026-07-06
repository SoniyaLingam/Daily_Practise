import java.util.*;
class number_split{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int b=0;
        int min=Integer.MAX_VALUE;
        for(int u=0;u<n;u++){
            int sum1=0;
            int sum2=0;
            for(int k=0;k<u+1;k++){
                sum1+=arr[k];
            }
            for(int j=u+1;j<n;j++){
                sum2+=arr[j];
            }
            int c=Math.abs(sum2-sum1);
            if(c<min){
                min=c;
                b=sum2;
            }
            
        }
        System.out.print(b);
    }
}