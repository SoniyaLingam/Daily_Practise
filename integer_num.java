import java.util.*;
class integer_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int c=0;
        for(int u=0;u<=n;u++){
            int b=u;
            int sum=0;
            while(b>0){
                sum+=(b%10);
                b/=10;
            }
            if(sum>=max && u>c){
                max=sum;
                c=u;
            }
        }
        System.out.print(c);
    }
}