import java.util.*;
class count_of_n{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int co=0;
        for(int u=x+1;u<y;u++){
            int d=u;
            while(d>0){
                int c=d%10;
                if(c==n){
                    co++;
                }
                d/=10;
            }
        }
        System.out.print(co);
        
        
    }
}