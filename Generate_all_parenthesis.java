import java.util.*;

class Generate_all_parenthesis{

    public void generate(int open, int close, int n, String curr, List<String> ans) {

        // Base case
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        // Add '(' if possible
        if (open < n) {
            generate(open + 1, close, n, curr + "(", ans);
        }

        // Add ')' if possible
        if (close < open) {
            generate(open, close + 1, n, curr + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        generate(0, 0, n, "", ans);

        return ans;
    }
}