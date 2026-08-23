import java.util.*;

public class pattern_info{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String[] b = new String[a * a];

        for (int i = 1; i <= a * a; i++) {
            b[i - 1] = String.valueOf(i * i);
        }

        int c = 0;

        for (int d = 0; d < a; d++) {
            System.out.print(" ".repeat(a - d - 1));

            for (int i = c; i < c + (2 * d + 1); i++) {
                System.out.print(b[i]);
                if (i < c + (2 * d + 1) - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println(" " + "*".repeat(a - d - 1));

            c += 2 * d + 1;
        }
    }
}