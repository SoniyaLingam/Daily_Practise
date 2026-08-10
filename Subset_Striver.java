import java.util.*;

class Subset_Striver {

    public static void subsetof(int[] num, int k, int sum,
                                Set<Integer> li) {

        // Base case
        if (k == num.length) {
            li.add(sum);
            return;
        }

        // Take
        subsetof(num, k + 1, sum + num[k], li);

        // Don't take
        subsetof(num, k + 1, sum, li);
    }

    public static List<Integer> subset(int[] num) {

        Set<Integer> set = new HashSet<>();

        subsetof(num, 0, 0, set);

        List<Integer> li = new ArrayList<>(set);

        Collections.sort(li);

        return li;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        List<Integer> li = subset(num);

        System.out.println(li);
    }
}