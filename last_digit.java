// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class last_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%8==0){
            System.out.print("Yes");
            return;
        }
        else{
            int c=0;
            int a=n;
            String b=Integer.toString(a);
            if(b.length()<3){
                System.out.print("No");
                return;
            }
            int[] res=new int[3];
            int k=0;
            while(a>0){
                if(c==3){
                    break;
                }
                int d=a%10;
                res[k++]=d;
                c++;
                a/=10;
                
            }
            for(int u=0;u<3;u++){
                for(int j=0;j<3;j++){
                    for(int ks=0;ks<3;ks++){
                        StringBuilder sb=new StringBuilder();
                        if((u==j)||(u==ks)||(j==ks)){
                            continue;
                        }
                        sb.append(res[u]);
                        sb.append(res[j]);
                        sb.append(res[ks]);
                        String so=sb.toString();
                        int dos=Integer.parseInt(so);
                        if(dos%8==0){
                            System.out.print("Yes");
                            return;
                        }
                    }
                }
            }
            
        }
        System.out.print("No");
    }
}