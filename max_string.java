
import java.util.Scanner;

public class max_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(Math.max(b[0], Math.max(b[a - 1], b[a / 2])));

        sc.close();
    }
}
