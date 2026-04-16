// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class oddevencount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int o=0,e=0;
        for(char c:s.toCharArray()){
            if(c%2==0){
                e++;
            }else{
                o++;
            }
        }
        if(o>e){
            System.out.print(o);
        }else{
            System.out.print(e);
        }
    }
}