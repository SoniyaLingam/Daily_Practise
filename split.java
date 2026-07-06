import java.util.*;

class SplitArray {

    static int countSubarrays(int[] arr, int maxSum) {

        int subarrays = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] <= maxSum) {
                sum += arr[i];
            } else {
                subarrays++;
                sum = arr[i];
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            max = Math.max(max, arr[i]);
            total += arr[i];
        }

        for (int limit = max; limit <= total; limit++) {

            int parts = countSubarrays(arr, limit);

            if (parts == k) {
                System.out.println(limit);
                break;
            }
        }
    }
}