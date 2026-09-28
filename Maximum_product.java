import java.util.*;

public class Maximum_product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int n = sc.nextInt();

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);

        System.out.println(b[n - 1] * b[n - 2]);
    }
}