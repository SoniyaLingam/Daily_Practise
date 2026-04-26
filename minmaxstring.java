// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class minmaxstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String maxstring="";
        String minstring="";
        int max=0;
        int min=Integer.MAX_VALUE;
        boolean f=false;
        for(String u:s){
            String rev=new StringBuilder(u).reverse().toString();

            if(u.equals(rev)){
                f=true;
                if(u.length()==max || u.length()==min)continue;
                if(u.length()>max){
                    max=u.length();
                    maxstring=u;
                }
                if(u.length()<min){
                    min=u.length();
                    minstring=u;
                }
            }
        }
        if(!f){
            System.out.print("-1");
        }
        else{
        System.out.println(maxstring);
        System.out.print(minstring);
            
        }
    }
}