import java.util.*;
public class Largest_even_number{
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
        for(int u=n-1;u>=0;u--){
            arr1[k]=arr[u]-'0';
            k++;
        }
        int g=n-1;
        while(true){
            if(arr1[g]==0){
                g--;
            }else{
                int temp=arr1[g];
                arr1[g]=arr1[n-1];
                arr1[n-1]=temp;
                break;
            }
        }
        
        int j=n-1;
        boolean f=true;
        while(j>=0 && arr1[n-1]%2!=0){
            if(arr1[j]!=0 && arr1[j]%2==0){
                int temp=arr1[n-1];
                arr1[n-1]=arr1[j];
                arr1[j]=temp;
                f=false;
                break;
                
            }
            j--;
        }
        if(f){
            System.out.print("-1");
            return;
        }else{
        for(int u=0;u<n;u++){
            System.out.print(arr1[u]);
        }
    }
        
        
    }
}