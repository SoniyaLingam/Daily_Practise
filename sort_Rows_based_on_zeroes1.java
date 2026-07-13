import java.util.*;

class sort_Rows_based_on_zeroes1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < r; i++) {

            int count = 0;

            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 0) {
                    count++;
                }
            }

            // Store {zero count, row number}
            list.add(new int[]{count, i + 1});
        }

        Collections.sort(list, (a, b) -> {

            if (a[0] != b[0]) {
                return a[0] - b[0];   // Sort by zero count
            }

            return a[1] - b[1];       // If equal, sort by row number
        });

        for (int[] x : list) {
            System.out.print(x[1] + " ");
        }
    }
}