import java.util.*;

public class rat_maze_backtrack {

    static void solve(int[][] arr, int[][] visited,
                      int row, int col, int n,
                      String path, List<String> li) {

        // Destination reached
        if (row == n - 1 && col == n - 1) {
            li.add(path);
            return;
        }

        // Mark current cell as visited
        visited[row][col] = 1;

        // Down
        if (row + 1 < n &&
            arr[row + 1][col] == 1 &&
            visited[row + 1][col] == 0) {

            solve(arr, visited, row + 1, col,
                  n, path + "D", li);
        }

        // Left
        if (col - 1 >= 0 &&
            arr[row][col - 1] == 1 &&
            visited[row][col - 1] == 0) {

            solve(arr, visited, row, col - 1,
                  n, path + "L", li);
        }

        // Right
        if (col + 1 < n &&
            arr[row][col + 1] == 1 &&
            visited[row][col + 1] == 0) {

            solve(arr, visited, row, col + 1,
                  n, path + "R", li);
        }

        // Up
        if (row - 1 >= 0 &&
            arr[row - 1][col] == 1 &&
            visited[row - 1][col] == 0) {

            solve(arr, visited, row - 1, col,
                  n, path + "U", li);
        }

        // Backtrack
        visited[row][col] = 0;
    }

    public static List<String> backtrack(int[][] arr, int n) {

        List<String> li = new ArrayList<>();
        int[][] visited = new int[n][n];

        if (arr[0][0] == 1) {
            solve(arr, visited, 0, 0, n, "", li);
        }

        return li;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<String> li = backtrack(arr, n);

        for (String s : li) {
            System.out.print(s + " ");
        }
    }
}