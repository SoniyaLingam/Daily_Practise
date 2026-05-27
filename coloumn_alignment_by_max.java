import java.util.*;

public class coloumn_alignment_by_max{
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

        int[] sum = new int[c];

        for (int j = 0; j < c; j++) {

            for (int i = 0; i < r; i++) {

                sum[j] += arr[i][j];
            }
        }

        for (int i = 0; i < c - 1; i++) {

            int min = i;

            for (int j = i + 1; j < c; j++) {

                if (sum[j] < sum[min]) {
                    min = j;
                }
            }

            int temp = sum[i];
            sum[i] = sum[min];
            sum[min] = temp;

            for (int k = 0; k < r; k++) {

                int t = arr[k][i];
                arr[k][i] = arr[k][min];
                arr[k][min] = t;
            }
        }

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}