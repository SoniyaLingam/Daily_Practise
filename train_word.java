
import java.util.*;
class train_word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[]arr=new String[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextLine();
        }
        
        boolean[]bo=new boolean[n];
        int c=0;
        for(int u=0;u<n;u++){
            String s=arr[u];
            boolean f=true;
            for(int j=0;j<n;j++){
                String q=arr[j];
                int n1=q.length();
                if(u!=j){
                    if(s.charAt(0)==q.charAt(n1-1)){
                        f=false;
                        break;
                    }
                }
            }
            if(f){
                System.out.println(arr[u]);
                bo[u]=true;
                c=u;
                break;
            }
        }
       String d=arr[0];
        for(int u=1;u<n;u++){
            d=arr[c];
            int fe=d.length();
           
            for(int j=0;j<n;j++){
            
            String ef=arr[j];
            
            if(!bo[j]){
               if(ef.charAt(0)==d.charAt(fe-1)){
                   System.out.println(ef);
                   bo[j]=true;
                   c=j;
                   break;
               }
            }
            }
                  
        }
    }
}
