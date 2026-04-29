import java.util.*;

public class Swapofdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Convert positions (1-based → 0-based)
        int temp = arr[x - 1];
        arr[x - 1] = arr[y - 1];
        arr[y - 1] = temp;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}