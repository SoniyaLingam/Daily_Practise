import java.util.*;

public class slidingwindowmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int prevMax = -1;

        for (int i = 0; i <= n - w; i++) {

            int currMax = Integer.MIN_VALUE;

           
            for (int j = 0; j < w; j++) {
                currMax = Math.max(currMax, arr[i + j]);
            }

            
            if (i == 0) {
                System.out.print(currMax + " ");
            } else {
                System.out.print(Math.max(currMax, prevMax) + " ");
            }

            prevMax = currMax;
        }
    }
}