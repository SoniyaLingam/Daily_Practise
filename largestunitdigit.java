// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class largestunitdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c>d){
            System.out.println(a);
        }
        else if(c<d){
            System.out.println(b);
        }else if(c==d){
            if(a>b){
                System.out.print(a);
            }else{
                System.out.print(b);
            }
        }
    }
}