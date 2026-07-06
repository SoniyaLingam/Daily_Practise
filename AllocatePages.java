import java.util.*;

class AllocatePages {

    static int countStudents(int[] arr, int pages) {

        int students = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] <= pages) {
                sum += arr[i];
            } else {
                students++;
                sum = arr[i];
            }
        }

        return students;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            total += arr[i];
        }

        if (m > n) {
            System.out.println(-1);
            return;
        }

        for (int pages = max; pages <= total; pages++) {

            int students = countStudents(arr, pages);

            if (students == m) {
                System.out.println(pages);
                return;
            }
        }
    }
}