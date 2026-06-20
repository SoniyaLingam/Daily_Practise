import java.util.*;

class matrix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] arr = new int[R][C];

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        for(int i = 0; i < R - 1; i++) {
            for(int j = 0; j < C - 1; j++) {

                int sum = arr[i][j]
                        + arr[i][j + 1]
                        + arr[i + 1][j]
                        + arr[i + 1][j + 1];

                if(sum == target) {

                    System.out.println(arr[i][j] + " " + arr[i][j + 1]);
                    System.out.println(arr[i + 1][j] + " " + arr[i + 1][j + 1]);

                    return;
                }
            }
        }
    }
}