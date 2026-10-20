//-------------DC--------------------(Java)
import java.util.*;

public class step_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();
        int a = Integer.parseInt(sc.nextLine());
        int b = 1, c = 1;

        System.out.println(s.charAt(0));

        while (b < s.length()) {
            if (c == 1) {
                for (int d = 1; d < a; d++) {
                    if (b >= s.length()) break;
                    System.out.println("*".repeat(d) + s.charAt(b));
                    b++;
                }
            } else {
                for (int d = a - 2; d >= 0; d--) {
                    if (b >= s.length()) break;
                    System.out.println("*".repeat(d) + s.charAt(b));
                    b++;
                }
            }
            c = 1 - c;
        }
    }
}