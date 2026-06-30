import java.util.*;
class count_of_inversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int c=0;
        for(int u=0;u<n;u++){
            int a=arr[u];
            for(int j=u+1;j<n;j++){
                if(arr[j]<a){
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}