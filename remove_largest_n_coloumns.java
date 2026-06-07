import java.util.*;

class remove_largest_n_coloumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int u = 0; u < r; u++) {
            for (int j = 0; j < c; j++) {
                arr[u][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int u = 0; u < c; u++) {
            int sum = 0;

            for (int j = 0; j < r; j++) {
                sum += arr[j][u];
            }

            map.put(sum, u);
        }

        for (int u = 0; u < n; u++) {
            map.remove(map.lastKey());
        }

        for (int u = 0; u < r; u++) {
            for (int j = 0; j < c; j++) {
                if (map.containsValue(j)) {
                    System.out.print(arr[u][j] + " ");
                }
            }
            System.out.println();
        }
    }
}