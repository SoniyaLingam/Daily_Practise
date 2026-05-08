import java.util.*;

public class stepsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) != 1) {
                System.out.print("no");
                return;
            }
        }

        System.out.print("yes");
    }
}