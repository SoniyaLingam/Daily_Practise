import java.util.*;

public class squareofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (ch == '-') continue;

            int d = ch - '0';
            int sq = d * d;

            if (d % 2 != 0) {
                System.out.print("-" + sq);
            } else {
                System.out.print(sq);
            }
        }
    }
}