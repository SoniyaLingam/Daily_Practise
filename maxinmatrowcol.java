import java.util.*;

public class maxinmatrowcol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

      
        for (int i = 0; i < n; i++) {
            int max = a[i][0];
            for (int j = 1; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.print(max + " ");
        }

        System.out.println();

       
        for (int j = 0; j < n; j++) {
            int max = a[0][j];
            for (int i = 1; i < n; i++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
