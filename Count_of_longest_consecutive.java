import java.util.*;

class Count_of_longest_consecutive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = Integer.toBinaryString(n);

        int a = s.length();
        int max = 0;

        for (int u = 0; u < a; u++) {

            char b = s.charAt(u);

            if (b == '1') {

                int j = u;
                int d = 0;

                while (j < a && s.charAt(j) == '1') {
                    d++;
                    j++;
                }

                max = Math.max(max, d);

                u = j - 1;
            }
        }

        System.out.print(max);
    }
}