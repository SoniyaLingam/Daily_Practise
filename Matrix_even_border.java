import java.util.*;

class Matrix_even_border{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] arr = new int[M][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int r = 0; r <= M - N; r++) {
            for (int c = 0; c <= M - N; c++) {

                boolean valid = true;

                // Top row
                for (int j = c; j < c + N; j++) {
                    if (arr[r][j] % 2 != 0) {
                        valid = false;
                        break;
                    }
                }

                // Bottom row
                if (valid) {
                    for (int j = c; j < c + N; j++) {
                        if (arr[r + N - 1][j] % 2 != 0) {
                            valid = false;
                            break;
                        }
                    }
                }

                // Left column
                if (valid) {
                    for (int i = r + 1; i < r + N - 1; i++) {
                        if (arr[i][c] % 2 != 0) {
                            valid = false;
                            break;
                        }
                    }
                }

                // Right column
                if (valid) {
                    for (int i = r + 1; i < r + N - 1; i++) {
                        if (arr[i][c + N - 1] % 2 != 0) {
                            valid = false;
                            break;
                        }
                    }
                }

                if (valid) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}