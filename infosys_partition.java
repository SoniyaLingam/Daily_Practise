public class infosys_partition
{

    static int maxPartitionSum(int[] arr, int k) {
        return solve(arr, 0, k);
    }

    static int solve(int[] arr, int start, int k) {

        // Only one partition left
        if (k == 1) {
            int sum = 0;

            for (int i = start; i < arr.length; i++) {
                sum += arr[i];
            }

            return sum;
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Make the first partition
        for (int i = start; i <= arr.length - k; i++) {

            sum += arr[i];

            // Split remaining elements into k-1 partitions
            int remainingMax = solve(arr, i + 1, k - 1);

            // We want maximum partition sum
            int currentMax = Math.max(sum, remainingMax);

            max = Math.max(max, currentMax);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = 10;
        int k = 6;

        int result = maxPartitionSum(arr, k);

        System.out.println(result);
    }
}