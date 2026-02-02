Total Distance – Smallest to Largest

The program must accept an integer matrix of size R×C containing only unique integers as the input. The program must find the distance between the smallest integer and the 2nd smallest integer. Then the program must find the distance between the 2nd smallest integer and the 3rd smallest integer, and so on. Finally, the program must print the total distance as the output.

The distance between two integers X and Y in the matrix is defined as:
Maximum( |rowX − rowY| , |colX − colY| )

Boundary Conditions:
2 ≤ R, C ≤ 50
1 ≤ Matrix element value ≤ 10⁴

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contain C integer values separated by a space.

Output Format:
The first line contains an integer value representing the total distance.

Example Input/Output 1:
Input:
3 3
6 7 4
3 8 5
2 9 1

Output:
11 

import java.util.*;

public class Matrixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        int[] arr = new int[r * c];
        int idx = 0;

        Map<Integer, int[]> pos = new HashMap<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                arr[idx++] = mat[i][j];
                pos.put(mat[i][j], new int[]{i, j});
            }
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];

            int rowDiff = Math.abs(pos.get(a)[0] - pos.get(b)[0]);
            int colDiff = Math.abs(pos.get(a)[1] - pos.get(b)[1]);

            sum += Math.max(rowDiff, colDiff);
        }

        System.out.print(sum);
    }
}

Time complexity: O((r * c) * log(r * c))
Space complexity: O(r * c)