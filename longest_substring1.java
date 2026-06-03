import java.util.*;

public class longest_substring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int n = a.length();

        int[] freq = new int[256];

        int l = 0;
        int maxlen = 0;
        String s = "";

        for (int u = 0; u < n; u++) {

            char ch = a.charAt(u);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[a.charAt(l)]--;
                l++;
            }

            int len = u - l + 1;

            if (len > maxlen) {
                maxlen = len;

                StringBuilder sb = new StringBuilder();

                for (int i = l; i <= u; i++) {
                    sb.append(a.charAt(i));
                }

                s = sb.toString();
            }
        }

        System.out.println(s);
    }
}