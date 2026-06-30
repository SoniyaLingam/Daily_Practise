import java.util.*;
class count_of_occurence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        int c=0;
        int k=sc.nextInt();
        for(int u=0;u<n;u++){
            if(arr[u]==k){
                c++;
            }
        }
        System.out.print(c);
    }
}