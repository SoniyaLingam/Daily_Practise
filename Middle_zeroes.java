import java.util.*;

public class Middle_zeroes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        System.out.println(1);

        for (int a = 0; a < b - 2; a++) {
            System.out.println("1" + "0".repeat(a) + "1");
        }

        System.out.println("1".repeat(b));
    }
}