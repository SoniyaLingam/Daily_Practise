import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[] need = new int[256];
        int[] have = new int[256];

        int required = b.length();

        for (int i = 0; i < b.length(); i++) {
            need[b.charAt(i)]++;
        }

        int left = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int start = -1;

        for (int right = 0; right < a.length(); right++) {

            char ch = a.charAt(right);
            have[ch]++;

            if (need[ch] > 0 && have[ch] <= need[ch]) {
                count++;
            }

            while (count == required) {

                int len = right - left + 1;

                if (len < minLen) {
                    minLen = len;
                    start = left;
                }

                char leftChar = a.charAt(left);

                have[leftChar]--;

                if (need[leftChar] > 0 &&
                    have[leftChar] < need[leftChar]) {
                    count--;
                }

                left++;
            }
        }

        if (start == -1) {
            System.out.println("No Window Found");
        } else {
            for (int i = start; i < start + minLen; i++) {
                System.out.print(a.charAt(i));
            }
        }
    }
}