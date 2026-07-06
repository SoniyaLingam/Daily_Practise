import java.util.*;

class Median_of_the_sorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] ar = new int[a];
        int[] arr = new int[b];

        for (int i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[a + b];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge the two sorted arrays
        while (i < a && j < b) {

            if (ar[i] <= arr[j]) {
                res[k++] = ar[i++];
            } else {
                res[k++] = arr[j++];
            }
        }

        // Copy remaining elements of first array
        while (i < a) {
            res[k++] = ar[i++];
        }

        // Copy remaining elements of second array
        while (j < b) {
            res[k++] = arr[j++];
        }

        int n = a + b;

        if (n % 2 == 0) {

            double median = (res[n / 2] + res[(n / 2) - 1]) / 2.0;
            System.out.print(median);

        } else {

            System.out.print(res[n / 2]);
        }
    }
}