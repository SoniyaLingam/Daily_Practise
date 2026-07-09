import java.util.*;

class amount_of_waiters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] amount = new int[n];

        for (int i = 0; i < n; i++) {
            amount[i] = sc.nextInt();
        }

        for (int i = 0; i < w; i++) {

            int sum = 0;

            for (int j = i; j < n; j += w) {
                sum += amount[j];
            }

            System.out.print(sum + " ");
        }
    }
}