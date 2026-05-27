import java.util.*;

public class Chess_Board{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[][] arr = new char[n][n];

        boolean valid = true;

        for (int i = 0; i < n; i++) {

            String s = sc.next();

            for (int j = 0; j < n; j++) {

                arr[i][j] = s.charAt(j);

                if (arr[i][j] != 'W' && arr[i][j] != 'B') {
                    valid = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i + 1 < n) {

                    if (arr[i][j] == arr[i + 1][j]) {
                        valid = false;
                    }
                }

                if (j + 1 < n) {

                    if (arr[i][j] == arr[i][j + 1]) {
                        valid = false;
                    }
                }
            }
        }

        if (valid) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }
    }
}