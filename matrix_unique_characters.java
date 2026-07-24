import java.util.*;

class matrix_unique_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                char ch = sc.next().charAt(0);
                set.add(ch);
            }

            if (set.size() >= max) {
                max = set.size();
                pos = i + 1;
            }
        }

        System.out.print(pos);
    }
}