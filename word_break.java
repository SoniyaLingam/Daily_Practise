import java.util.*;

public class word_break
{

    public static boolean backtrack(String s, String curr, List<String> wordDict) {

       
        if (s.equals(curr)) {
            return true;
        }

        
        if (curr.length() > s.length()) {
            return false;
        }

        
        for (String word : wordDict) {

            String newCurr = curr + word;

            
            if (backtrack(s, newCurr, wordDict)) {
                return true;
            }
        }

        
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        return backtrack(s, "", wordDict);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        List<String> wordDict = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            wordDict.add(sc.nextLine());
        }

        System.out.println(wordBreak(s, wordDict));
    }
}