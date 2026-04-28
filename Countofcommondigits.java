import java.util.*;

public class Countofcommondigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int count = 0;

        for (int d = 0; d <= 9; d++) {
            boolean common = true;

            for (int i = 0; i < n; i++) {
                if (!arr[i].contains(String.valueOf(d))) {
                    common = false;
                    break;
                }
            }

            if (common) count++;
        }

        System.out.println(count);
    }
}