import java.util.*;

class Diagnol_Matrix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] main = new int[n];
        int[] opposite = new int[n];

        // Store both diagonals
        for (int i = 0; i < n; i++) {
            main[i] = arr[i][i];
            opposite[i] = arr[i][n - 1 - i];
        }

        int[] mainSuffix = new int[n];
        int[] oppositeSuffix = new int[n];

        // Compute suffix sums
        mainSuffix[n - 1] = main[n - 1];
        oppositeSuffix[n - 1] = opposite[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            mainSuffix[i] = main[i] + mainSuffix[i + 1];
            oppositeSuffix[i] = opposite[i] + oppositeSuffix[i + 1];
        }

        // Total of suffix sums
        int mainTotal = 0;
        int oppositeTotal = 0;

        for (int i = 0; i < n; i++) {
            mainTotal += mainSuffix[i];
            oppositeTotal += oppositeSuffix[i];
        }

        // Print according to larger total
        if (oppositeTotal > mainTotal) {
            for (int i = 0; i < n; i++) {
                System.out.print(oppositeSuffix[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < n; i++) {
                System.out.print(mainSuffix[i] + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(mainSuffix[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < n; i++) {
                System.out.print(oppositeSuffix[i] + " ");
            }
        }
    }
}