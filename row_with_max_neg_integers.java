import java.util.*;

public class row_with_max_neg_integers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] a = new int[R][C];

        int maxNeg = 0;
        int maxRow = -1;

        for (int i = 0; i < R; i++) {

            int negCount = 0;

            for (int j = 0; j < C; j++) {

                a[i][j] = sc.nextInt();

                if (a[i][j] < 0)
                    negCount++;
            }

            if (negCount > maxNeg) {
                maxNeg = negCount;
                maxRow = i;
            }
        }

        if (maxRow == -1) {
            System.out.println("-1");
        } 
        else {
            for (int j = 0; j < C; j++) {
                System.out.print(a[maxRow][j] + " ");
            }
        }

        sc.close();
    }
}