
import java.util.*;
public class findxvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int c=0;
        for(char u:s.toCharArray()){
            if(u=='a' || u=='e' || u=='i' || u=='o' ||u=='u' || u=='A'|| u=='E' || u=='I' || u=='O' || u=='U'){
                c++;
                if(c>n){
                    break;
                }
                System.out.print(u);
            }
        }
    }
}