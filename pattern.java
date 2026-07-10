import java.util.*;
class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char a=s.charAt(0);
        char b=s.charAt(1);
        int r=n;
        int c=(r*2)-1;
        int w=0;
        int t=1;
        for(int u=0;u<r;u++){
            for(int k=0;k<r-u-1;k++){
                    System.out.print(" ");
            }
            for(int q=0;q<t;q++){
                if(w==0){
                    System.out.print(a);
                    w=1;
                }
                else if(w==1){
                    System.out.print(b);
                    w=0;
                }
            }
            t+=2;
            System.out.println();
        }
        
    }
}