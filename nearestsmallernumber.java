import java.util.*;

public class nearestsmallernumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int maxSmaller = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < m) {
                if (maxSmaller == -1 || arr[i] > maxSmaller) {
                    maxSmaller = arr[i];
                }
            }
        }

        System.out.println(maxSmaller);
    }
}