import java.util.*;

class planting_trees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n && k > 0; i++) {
            if (arr[i] == 0) {
                int left = (i == 0) ? 0 : arr[i - 1];
                int right = (i == n - 1) ? 0 : arr[i + 1];

                if (left == 0 && right == 0) {
                    arr[i] = 1;
                    k--;
                }
            }
        }

        if (k <= 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
