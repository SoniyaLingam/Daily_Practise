import java.util.*;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        // Traverse each column
        for (int j = 0; j < c; j++) {

            int i = 0;

            while (i < r - 1) {

                // Start of a consecutive group
                if (arr[i][j] == 1 && arr[i + 1][j] == 1) {

                    count++;

                    // Skip the remaining 1's in the same group
                    while (i + 1 < r && arr[i + 1][j] == 1) {
                        i++;
                    }
                }

                i++;
            }
        }

        System.out.print(count);
    }
}