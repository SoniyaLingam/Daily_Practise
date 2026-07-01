import java.util.*;
class binary_rep{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int n=sc.nextInt();
        String s = Integer.toBinaryString(n);
        int k=s.length();
        int c=0;
        int b=0;
        for(int u=0;u<k;u++){
            if(s.charAt(u)=='1'){
                c++;
            }
        }
        
        for(int u=x;u<=y;u++){
            int q=u;
            int co=0;
            String so=Integer.toBinaryString(q);
            int ko=so.length();
            for(int j=0;j<ko;j++){
                if(so.charAt(j)=='1'){
                    co++;
                }
            }
            if(co==c){
                System.out.print(q+" ");
                b=1;
            }
            
        }
        if(b==0){
            System.out.print("-1");
        }
    }
}