public class findMissingxor{

    public static int findMissing(int[] arr, int n) {
        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        System.out.println("Missing number = " + findMissing(arr, n));
    }
}