import java.util.*;
class forward_and_reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=sc.nextInt();
        int b=sc.nextInt();
        
        if(a>=b){
            for(int u=a;u<=b;u++){
                System.out.print(u+" ");
            }
            for(int u=x;u>=b;u--){
                System.out.print(u+" ");
            }
        }else{
            for(int u=b;u<=a;u++){
                System.out.print(u+" ");
            }
            for(int u=x;u>=a;u--){
                System.out.print(u+" ");
            }
        }
        
    }
}