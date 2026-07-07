import java.util.*;
class String_count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int n=a.length();
        int n1=b.length();
        int c=0;
        for(int u=0;u<n;u++){
        
            for(int j=u;j<n;j++){
                String s=a.substring(u,j+1);
                if(s.equals(b)){
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}