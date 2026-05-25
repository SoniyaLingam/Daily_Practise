import java.util.*;

public class least_occuring_digit_large_value{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] f = new int[10];

        String[] arr = sc.nextLine().split(" ");

        for (String x : arr) {

            for (int i = 0; i < x.length(); i++) {

                int d = x.charAt(i) - '0';

                f[d]++;
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {

            if (f[i] != 0 && f[i] < min) {
                min = f[i];
            }
        }

        for (int i = 0; i < 10; i++) {

            if (f[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}