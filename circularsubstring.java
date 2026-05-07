import java.util.*;

public class circularsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();


        if (start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.print(s.charAt(i));
            }
        } else {
            for (int i = start; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }

            for (int i = 0; i <= end; i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
}