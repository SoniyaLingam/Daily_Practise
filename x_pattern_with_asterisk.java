// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class x_pattern_with_asterisk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(n*2)-1;
        int k=1;
        for(int u=0;u<d;u++){
            for(int j=0;j<d;j++){
                if(u==j || d-1-u==j){
                    System.out.print(k);
                }
                else{
                    System.out.print("*");
                }
            }
            if(u>=n-1){
                k--;
            }
            else{
            k++;
            }
            System.out.println();
        }
    }
}