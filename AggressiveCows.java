import java.util.*;

class AggressiveCows {

    static boolean canPlace(int[] arr, int k, int dist) {

        int cows = 1;
        int last = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - last >= dist) {
                cows++;
                last = arr[i];
            }

            if (cows == k)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int maxDistance = arr[n - 1] - arr[0];
        int ans = 0;

        for (int d = 1; d <= maxDistance; d++) {

            if (canPlace(arr, k, d))
                ans = d;
            else
                break;
        }

        System.out.println(ans);
    }
}