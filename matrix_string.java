// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class matrix_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][]arr=new char[n][n];
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                arr[u][j]=sc.next().charAt(0);
            }
        }
        char[]res=new char[n*n];
        char[]rev=new char[n*n];
        
     
        int k=0;
        for(int u=0;u<n;u++){
            if(u%2==0){
                for(int j=0;j<n;j++){
                    res[k]=arr[u][j];
                    k++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    res[k]=arr[u][j];
                    k++;
                }
            }
            
        }
        int ko=0;
        for(int u=n-1;u>=0;u--){
            if(n%2==0){
            if(u%2==0){
                for(int j=0;j<n;j++){
                    rev[ko]=arr[u][j];
                    ko++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    rev[ko]=arr[u][j];
                    ko++;
                }
            }
        }else{
            if(u%2!=0){
                for(int j=0;j<n;j++){
                    rev[ko]=arr[u][j];
                    ko++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    rev[ko]=arr[u][j];
                    ko++;
                }
            }

        }
            
        }
      
        boolean f=true;
        if(n%2==0){
        for(int u=0;u<((n*n)/2);u++){
            if(res[u]==rev[u]){
                System.out.print(res[u]+" ");
                f=false;
            }
        }
    }else{
        for(int u=0;u<((n*n)/2)+1;u++){
            if(res[u]==rev[u]){
                System.out.print(res[u]+" ");
                f=false;
            }
        }
    }
        if(f){
            System.out.print("-1");
        }
    }
}