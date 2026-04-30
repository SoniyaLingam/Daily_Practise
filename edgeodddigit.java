import java.util.*;

public class edgeodddigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Traverse matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

               
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {

                 
                    if (a[i][j] % 2 != 0) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
        }
    }
}
