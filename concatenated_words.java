// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class concatenated_words{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]s=sc.nextLine().split(" ");
        int n=s.length;
        List<String>li=new ArrayList<>();
        boolean[]f=new boolean[n];
        String res="";
        for(int u=0;u<n;u++){
            String b=s[u];
            if(f[u]){
                continue;
            }
            res=b;
            for(int j=0;j<n;j++){
                if(u==j){
                    continue;
                }
                String a=s[j];
                
                if(!f[u]){
                if(Character.toLowerCase(b.charAt(0)) ==
   Character.toLowerCase(a.charAt(0))){
                    res=res+a;
                    f[j]=true;
                }
                }
                
            }
            li.add(res);
        }
        Collections.sort(li, String.CASE_INSENSITIVE_ORDER);
        int z=li.size();
        for(int u=0;u<z;u++){
            System.out.println(li.get(u));
        }
        
    }
}