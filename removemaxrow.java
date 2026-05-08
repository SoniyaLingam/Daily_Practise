import java.util.*;

public class removemaxrow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] m = new int[r][c];

        int maxSum = Integer.MIN_VALUE;
        int pos = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;

            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                sum += m[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                pos = i;
            }
        }

        for (int i = 0; i < r; i++) {
            if (i == pos) {
                continue;
            }

            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }
}