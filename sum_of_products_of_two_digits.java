import java.util.*;

class sum_of_products_of_two_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        if(n <= 2) {
            System.out.print(s);
            return;
        }

        List<String> li = new ArrayList<>();

        int k = 2;

        for(int u = 0; u < n; u += 2) {

            if(k <= n) {
                li.add(s.substring(u, k));
            } else {
                li.add(s.substring(u, n));
            }

            k += 2;
        }

        int sum = 0;

        for(int i = 0; i < li.size() - 1; i += 2) {

            int a = Integer.parseInt(li.get(i));
            int b = Integer.parseInt(li.get(i + 1));

            sum += a * b;
        }

        if(li.size() % 2 != 0) {
            sum += Integer.parseInt(li.get(li.size() - 1));
        }

        System.out.print(sum);
    }
}