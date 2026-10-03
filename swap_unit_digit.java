import java.util.*;

public class swap_unit_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String[] b = new String[a];

        for (int i = 0; i < a; i++)
            b[i] = sc.next();

        for (int c = 0; c < a / 2; c++) {
            String temp = b[c];

            b[c] = b[c].substring(0, b[c].length() - 1)
                    + b[a - c - 1].charAt(b[a - c - 1].length() - 1);

            b[a - c - 1] = b[a - c - 1].substring(0, b[a - c - 1].length() - 1)
                    + temp.charAt(temp.length() - 1);
        }

        for (String x : b)
            System.out.print(x + " ");
    }
}