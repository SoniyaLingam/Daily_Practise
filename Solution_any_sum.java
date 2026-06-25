import java.util.*;

class Solution_any_sum {

    public static List<List<Integer>> nSum(int[] nums, int n, int target) {
        Arrays.sort(nums);
        return solve(nums, 0, n, target);
    }

    private static List<List<Integer>> solve(int[] nums, int start, int n, int target) {

        List<List<Integer>> res = new ArrayList<>();

        if (n == 2) {

            int left = start;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[left] + nums[right];

                if (sum == target) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    res.add(temp);

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }

            return res;
        }

        for (int i = start; i <= nums.length - n; i++) {

            if (i > start && nums[i] == nums[i - 1])
                continue;

            List<List<Integer>> sub =
                    solve(nums, i + 1, n - 1, target - nums[i]);

            for (List<Integer> list : sub) {

                List<Integer> temp = new ArrayList<>();

                temp.add(nums[i]);
                temp.addAll(list);

                res.add(temp);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        if (size < n) {
            System.out.println("Not Possible");
            return;
        }

        List<List<Integer>> ans = nSum(nums, n, target);

        System.out.println(ans);
    }
}