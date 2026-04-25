// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Positionsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
        for(char u:a.toCharArray()){
            int n=u-'a' + 1;
            sum+=n;
        }
        System.out.print(sum);
    }
}