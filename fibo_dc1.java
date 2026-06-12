import java.util.*;

class fibo_dc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        HashSet<Integer> fib = new HashSet<>();

        int a = 0, b = 1;
        fib.add(0);
        fib.add(1);

        while (b <= max) {
            fib.add(b);
            int c = a + b;
            a = b;
            b = c;
        }

        for (int i = 0; i < n; i++) {
            if (fib.contains(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}