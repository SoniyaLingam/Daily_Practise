import java.util.*;

public class Sort_Numbers_Based_on_Even_and_Odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine(); // same as _ = input()

        String[] arr = sc.nextLine().split(" ");

        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums, (a, b) -> {
            boolean ae = a % 2 == 0;
            boolean be = b % 2 == 0;

            return Boolean.compare(ae, be);
        });

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}