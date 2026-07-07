import java.util.*;
class Symmetric_or_not{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][]arr=new int[a][b];
        for(int u=0;u<a;u++){
            for(int j=0;j<b;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int h=0;
        int v=0;
      
        for(int u=0;u<a;u++){
            for(int j=0;j<b;j++){
                if(arr[u][j]==arr[u][b-j-1]){
                    h++;
                    
                }
            }
        }
        for(int u=0;u<b;u++){
            for(int j=0;j<a;j++){
                if(arr[j][u]==arr[a-j-1][u]){
                    v++;
                    
                }
            }
        }
        if(h==a*b && v==a*b){
            System.out.print("S");
            return;
        }
        else if(v==a*b){
            System.out.print("H");
            return;
        }
        else if(h==a*b){
            System.out.print("V");
            return;
        }else{
            System.out.print("-1");
        }
        
    }
}