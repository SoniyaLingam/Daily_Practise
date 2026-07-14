// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class distinct_elements_strivers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int k=sc.nextInt();
        int n=s.length();
        int c=0;
        for(int u=0;u<n;u++){
            
            for(int j=u+1;j<=n;j++){
                Set<Character>set=new HashSet<>();
                String q=s.substring(u,j);
                int d=q.length();
                for(int uo=0;uo<d;uo++){
                    set.add(q.charAt(uo));
                }
                if(set.size()==k){
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}