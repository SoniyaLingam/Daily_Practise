// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Hellopattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        char c=' ';
        
        char[][]mat=new char[n][n];
        for(int u=0;u<a.length();u++){
            for(int j=0;j<a.length();j++){
                if(u==j || j==n-u-1){
                    mat[u][j]=a.charAt(u);
                }else{
                    mat[u][j]=c;
                }
            }
        }
        for(int u=0;u<a.length();u++){
            for(int j=0;j<a.length();j++){
                System.out.print(mat[u][j]);
            }
            System.out.println();
        }
        
    }
}