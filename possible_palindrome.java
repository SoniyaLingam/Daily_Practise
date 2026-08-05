import java.util.*;

class possible_palindrome {

    public static boolean pali(String res) {

        int i = 0;
        int j = res.length() - 1;

        while (i < j) {
            if (res.charAt(i) != res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");

        int n = s.length;

        int c = 0;

        for (int u = 0; u < n; u++) {

            String a = s[u];

            for (int j = 0; j < n; j++) {

                if (u == j) {
                    continue;
                }

                String b = s[j];

                String res = a + b;

                if (pali(res)) {
                    c++;
                }
            }
        }

        System.out.print(c);
    }
}