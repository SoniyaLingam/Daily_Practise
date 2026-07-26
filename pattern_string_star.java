// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class pattern_string_star{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[][]res=new char[n][n];
        int q=n/2;
        int k=n-1;
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                if(u==j || u==n-j-1){
                    res[u][j]=s.charAt(k);
                }
                if(j==q){
                    res[u][j]=s.charAt(u);
                }
                if(u==q){
                    res[u][j]=s.charAt(j);

                }
                if(!(u==j || u==n-j-1 || j==q || u==q)){
                    res[u][j]='*';
                }
                
                
            }
            k--;
        }
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                System.out.print(res[u][j]);
            }
            System.out.println();
        }
    }
}