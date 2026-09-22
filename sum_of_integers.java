import java.util.*;

public class sum_of_integers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int n = sc.nextInt();

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for (int d : b)
            freq.put(d, freq.getOrDefault(d, 0) + 1);

        int sum = 0;

        for (int d : b) {
            if (freq.get(d) == 1)
                sum += d;
        }

        System.out.println(sum == 0 ? -1 : sum);
    }
}