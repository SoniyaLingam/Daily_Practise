import java.util.*;
class Monkey{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]>max){
                max=arr[u];
            }
        }
        int x=sc.nextInt();
        int c=0;
        for(int u=1;u<=max;u++){
            c=0;
            while(true){
                for(int j:arr){
                    int b=j-u;
                    while(b>0){
                        c++;
                        b-=u;
                    }
                    c++;
                }
                if(c<=x){
                    System.out.print(u);
                    return;
                }
                else{
                    break;
                }
            }
            
            
            
        }
        System.out.print("-1");
     
        
    }
}