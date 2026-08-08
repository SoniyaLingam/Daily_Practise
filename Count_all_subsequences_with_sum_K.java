import java.util.*;

class Count_all_subsequences_with_sum_K{

    public static int generate(int[] nums, int index, int sum, int k) {

        // Base case
        if (index == nums.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        // Include current element
        int take = generate(nums, index + 1,
                            sum + nums[index], k);

        // Don't include current element
        int notTake = generate(nums, index + 1,
                               sum, k);

        return take + notTake;
    }

    public static int countSubsequences(int[] nums, int k) {
        return generate(nums, 0, 0, k);
    }

    public static void main(String[] args) {

        int[] nums = {4, 9, 2, 5, 1};
        int k = 10;

        System.out.println(countSubsequences(nums, k));
    }
}