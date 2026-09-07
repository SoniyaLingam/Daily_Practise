import java.util.*;

public class greater_smaller_values{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int f = sc.nextInt();

            if (f >= b)
                c.add(f);
            else
                d.add(f);
        }

        List<Integer> result = c.size() >= d.size() ? c : d;

        for (int f : result)
            System.out.print(f + " ");
    }
}