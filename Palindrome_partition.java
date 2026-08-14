import java.util.*;

public class Palindrome_partition {

    public static boolean isPalindrome(String s, int start, int end) {

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void generate(String s, int index,
                                List<String> curr,
                                List<List<String>> ans) {

        // Base case
        if (index == s.length()) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Try every possible substring
        for (int i = index; i < s.length(); i++) {

            // Check if s[index...i] is palindrome
            if (isPalindrome(s, index, i)) {

                // Take the palindrome substring
                curr.add(s.substring(index, i + 1));

                // Recursively process remaining string
                generate(s, i + 1, curr, ans);

                // Backtrack
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        generate(s, 0, curr, ans);

        System.out.println(ans);
    }
}