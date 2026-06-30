import java.util.*;
class nearest_multiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b=n;
        for(int u=5;u>=0;u--){
            if((b-u)%10==0){
                System.out.print(b-u);
                return;
            }
        }
        for(int j=1;j<5;j++){
            if((b+j)%10==0){
                System.out.print(b+j);
                return;
            }
        }
        
    }
}