import java.util.*;

public class Interlace_coloumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String[][] d = new String[a][b];
        String[][] e = new String[a][c];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                d[i][j] = sc.next();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                e[i][j] = sc.next();
            }
        }

        for (int f = 0; f < a; f++) {
            int g = 0, h = 0;

            while (g < b && h < c) {
                System.out.print(d[f][g] + " " + e[f][h] + " ");
                g++;
                h++;
            }

            while (g < b) {
                System.out.print(d[f][g] + " ");
                g++;
            }

            while (h < c) {
                System.out.print(e[f][h] + " ");
                h++;
            }

            System.out.println();
        }
    }
}