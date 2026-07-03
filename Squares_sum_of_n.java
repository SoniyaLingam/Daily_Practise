import java.util.*;
class Squares_sum_of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=(n*n)*n;
        int sum=0;
        int c=0;
        for(int u=1;u<p;u++){
            c=u*u;
            if(c <p){
                System.out.print(c+" ");
                sum+=c;
            }else{
                break;
            }
        }
        
        System.out.print("\n"+sum);
    }
}