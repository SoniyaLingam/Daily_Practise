import java.util.*;

class Check_if_there_exists_a_subsequence_with_sum_K{

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

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int u=0;u<n;u++){
            nums[u]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=countSubsequences(nums,k);
        if(c>0){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

        
    }
}