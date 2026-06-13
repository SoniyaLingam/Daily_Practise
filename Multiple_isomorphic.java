// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Multiple_isomorphic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int po=s.length();
        String p=sc.nextLine();
        String[]a=p.split(" ");
        int n=a.length;
        boolean g=false;
        for(int u=0;u<n;u++){
            int[]map1=new int[256];
            int[]map2=new int[256];
            String q=a[u];
            int d=q.length();
            boolean f=true;
            if(po==d){
                
                for(int uo=0;uo<po;uo++){
                    char w=s.charAt(uo);
                    char t=q.charAt(uo);
                    if(map1[w]==0 && map2[t]==0){
                        map1[w]=t;
                        map2[t]=w;
                    }else if(map1[w]!=t || map2[t]!=w){
                        f=false;
                        break;
                    }
                }
            }
            else{
                f=false;
            }
            if(f){
                g=true;
                System.out.print(q+" ");
            }
            
        }
        if(!g){
            System.out.print("-1");
        }
    }
}