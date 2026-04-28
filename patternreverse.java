import java.util.*;

public class patternreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {

            // spaces as dashes
            for (int s = 1; s <= n - i; s++) {
                System.out.print("-");
            }

            int start = num;
            int end = num + i - 1;

            if (i % 2 == 0) {
                // EVEN row → reverse
                for (int j = end; j >= start; j--) {
                    System.out.print(j);
                    if (j > start) System.out.print("-");
                }
            } else {
                // ODD row → normal
                for (int j = start; j <= end; j++) {
                    System.out.print(j);
                    if (j < end) System.out.print("-");
                }
            }

            num += i;
            System.out.println();
        }
    }
}