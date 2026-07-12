import java.util.*;

class sum_of {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        String[] arr = s.split(" ");

        int q = arr.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int u = 0; u < q; u++) {
            int d = Integer.parseInt(arr[u]);

            for (int j = 0; j < q; j++) {

                if (u == j) {
                    continue;
                }

                int x = Integer.parseInt(arr[j]);

                if (n == d + x && x <= d) {
                    map.put(x, d);
                }
            }
        }

        for (int key : map.keySet()) {
    System.out.println(key + " " + map.get(key));
}
    }
}