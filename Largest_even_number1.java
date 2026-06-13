import java.util.*;
public class Largest_even_number1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]a=s.split(" ");
        String d=a[0]+a[1];
        int n=d.length();
        char[]arr=d.toCharArray();
        Arrays.sort(arr);
        int[]arr1=new int[n];
        int k=0;
        int max=10;
        int ou=0;
        boolean f=false;
        for(int u=n-1;u>=0;u--){
            int lu=arr[u]-'0';
            if(lu%2==0 && max>lu && lu!=0){
                max=lu;
                ou=u;
                f=true;
            }
        }
        if(!f){
            System.out.print("-1");
            return;
        }
        for(int u=n-1;u>=0;u--){
            if(u==ou){
                continue;
            }
            arr1[k]=arr[u]-'0';
            k++;
        }
        arr1[n-1]=max;
        for(int u=0;u<n;u++){
            System.out.print(arr1[u]);
        }
        
        
        
    }
}