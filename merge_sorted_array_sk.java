import java.util.*;
class merge_sorted_array_sk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[]arr=new int[a];
        int[]arr1=new int[b];
        for(int u=0;u<a;u++){
            arr[u]=sc.nextInt();
        }
        for(int j=0;j<b;j++){
            arr1[j]=sc.nextInt();
        }
        int[]res=new int[a+b];
        int i=0;
        int j=0;
        int k=0;
        while(i<a && j<b){
            int s=arr[i];
            int d=arr1[j];
            if(s==d){
                res[k++]=s;
                res[k++]=d;
                i++;
                j++;
            }

            else if(s>d){
                res[k++]=s;
                i++;
            }
            else if(d>s){
                res[k++]=d;
                j++;
            }
        }
        while(i<a){
            res[k++]=arr[i++];
        }
        while(j<b){
            res[k++]=arr1[j++];
        }
        for(int u=0;u<a+b;u++){
            System.out.print(res[u]+" ");
        }
        
    }
}