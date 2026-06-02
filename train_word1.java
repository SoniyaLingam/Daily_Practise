
import java.util.*;
public class train_word1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        
        String[]arr=new String[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextLine();
            
        }
        for(int u=0;u<n;u++){
            String p=arr[u];
            int c=0;
            for(int j=0;j<n;j++){
                if(u!=j){
                String q=arr[j];
                int w=q.length();
                if(p.charAt(0)==q.charAt(w-1)){
                    c++;
                }
            }
            }
            if(c==0){
                String temp=arr[0];
                arr[0]=arr[u];
                arr[u]=temp;
                break;
            }
        }
        for(int u=0;u<n;u++){
            String d=arr[u];
            int on=d.length();
            for(int j=u+1;j<n;j++){
                String e=arr[j];
                if(d.charAt(on-1)==e.charAt(0)){
                    String temp=arr[u+1];
                    arr[u+1]=arr[j];
                    arr[j]=temp;
                    break;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
