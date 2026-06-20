import java.util.*;
class Longest_common_prefix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[]arr=new String[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextLine();
        }
        boolean[]tr=new boolean[n];
        String i=arr[0];
        int b=i.length();
        int min=Integer.MAX_VALUE;
        int co=0;
        int q=0;
        tr[0]=true;
        for(int u=1;u<n;u++){
            String a=arr[u];
            int c=a.length();
            int d=Math.min(b,c);
            
            co=0;
            
            for(int uo=1;uo<=d;uo++){
                String e=i.substring(0,uo);
                String f=a.substring(0,uo);
                
                if(e.equals(f)){
                    tr[u]=true;
                    co++;
                }else{
                    break;
                }
                
            }
            
            if(co<min){
                min=co;
            }
            
            
        }
        for(int u=0;u<n;u++){
            if(tr[u]){
                q++;
            }
        }
        if(min>0 && q==n){
            String s=i.substring(0,min);
            System.out.print(s);
        }else{
            System.out.print("-1");
        }
    }
}