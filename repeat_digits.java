import java.util.*;

class repeat_digits{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {

            if (i < 10) {
                System.out.print(i + " ");
                continue;
            }

            int n = i;
            int last = n % 10;
            boolean same = true;

            while (n > 0) {
                if (n % 10 != last) {
                    same = false;
                    break;
                }
                n /= 10;
            }

            if (!same) {
                System.out.print(i + " ");
            }
        }
    }
}