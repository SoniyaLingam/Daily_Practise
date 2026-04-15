// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class smallbasedonunitdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%10==b%10){
            if(a>b){
                System.out.print(a);
            }else{
                System.out.print(b);
            }
        }
        else if(a%10>b%10){
            System.out.print(b);
        }else{
            System.out.print(a);
        }
    }
}