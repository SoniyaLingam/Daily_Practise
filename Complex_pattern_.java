import java.util.*;

public class Complex_pattern_{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] a = new String[20];

        int n = 0;
        int max = 0;

        while (true) {

            String s = sc.nextLine();

            if (s.length() == 0) {
                break;
            }

            a[n] = s;

            if (a[n].length() > max) {
                max = a[n].length();
            }

            n++;
        }

        int width = max + 2;

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {

            int total = max - a[i].length();

            int left = (total + 1) / 2;
            int right = total / 2;

            System.out.print("*");

            for (int j = 0; j < left; j++) {
                System.out.print("-");
            }

            System.out.print(a[i]);

            for (int j = 0; j < right; j++) {
                System.out.print("-");
            }

            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }
}