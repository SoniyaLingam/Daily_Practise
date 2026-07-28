import java.util.*;

class last_digit_forlongnumbers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n % 8 == 0) {
            System.out.print("Yes");
            return;
        }

        long a = n;

        int[] res = new int[3];

        for (int i = 0; i < 3; i++) {
            res[i] = (int)(a % 10);
            a /= 10;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                    if (i == j || j == k || i == k)
                        continue;

                    int num = res[i] * 100 + res[j] * 10 + res[k];

                    if (num % 8 == 0) {
                        System.out.print("Yes");
                        return;
                    }
                }
            }
        }

        System.out.print("No");
    }
}