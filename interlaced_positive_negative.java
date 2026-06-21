import java.util.*;
class interlaced_positive_negative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int poo=0;
        int nee=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]>0){
                poo++;
            }else{
                nee++;
            }
        }
       
        int[]po=new int[poo];
        int[]ne=new int[nee];
        int[]res=new int[n];
        int k=0;
        int ko=0;
        for(int u=0;u<n;u++){
            int s=arr[u];
            if(s>0){
                po[k++]=s;
            }else{
                ne[ko++]=s;
            }
        }
        
     
        
        int c=0;
        int a=0;
        int b=0;
        while(a<nee && b<poo){
           
            res[c++]=ne[a++];
              
            res[c++]=po[b++];
                
            
            
        }
        while(a<nee){
            res[c++]=ne[a++];
            
        }
        while(b<poo){
            res[c++]=po[b++];
        }
        for(int u=0;u<n;u++){
            System.out.print(res[u]+" ");
        }
        
    }
}