import java.util.*;

class Series_digit_at_n_position{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
       
        for(int u=1;u<m;u++){
            sb.append(u);
        }
        String s=sb.toString();
        int c=0;
        char[]arr=s.toCharArray();
        for(char t:arr){
            c++;
            if(c==n){
                System.out.print(t);
                
            }
        }
        
        
    }
}