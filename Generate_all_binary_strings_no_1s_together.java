import java.util.*;

class Generate_all_binary_strings_no_1s_together {

    public static void generate(int n, String curr, List<String> ans) {

        // Base case
        if (curr.length() == n) {
            ans.add(curr);
            return;
        }

        // Always add '0'
        generate(n, curr + "0", ans);

        // Add '1' only if previous character is not '1'
        if (curr.length() == 0 || curr.charAt(curr.length() - 1) != '1') {
            generate(n, curr + "1", ans);
        }
    }

    public static List<String> generateBinaryStrings(int n) {

        List<String> ans = new ArrayList<>();

        generate(n, "", ans);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> ans = generateBinaryStrings(n);

        System.out.println(ans);
    }
}