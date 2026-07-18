import java.util.*;

class odd_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = y; i <= x; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        if (y < z) {
            for (int i = y; i <= z; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = z; i <= y; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}