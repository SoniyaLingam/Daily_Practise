import java.util.*;

public class common_char {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        for(char ch = 'a'; ch <= 'z'; ch++) {

            if(s1.indexOf(ch) != -1 && s2.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
    }
}