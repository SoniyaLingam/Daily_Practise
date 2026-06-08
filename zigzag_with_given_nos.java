import java.util.*;

class zigzag_with_given_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int size = r * c;
        int[] seq = new int[size];

        int index = 0;
        int value = 1;

        while (index < size) {
            int count = sc.nextInt();

            for (int i = 0; i < count && index < size; i++) {
                seq[index++] = value;
            }
            value++;
        }

        int k = 0;
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = seq[k++];
            }
        }

        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}