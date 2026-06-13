import java.util.*;

public class Matched_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String s = sc.nextLine();
        String[] words = s.split(" ");

        
        List<Integer> patternCounts = getConsecutiveCounts(pattern);

        boolean found = false;

        for (String word : words) {
            if (word.length() != pattern.length()) {
                continue;
            }

            List<Integer> wordCounts = getConsecutiveCounts(word);

            if (patternCounts.equals(wordCounts)) {
                System.out.print(word + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }

    private static List<Integer> getConsecutiveCounts(String str) {
        List<Integer> counts = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                counts.add(count);
                count = 1;
            }
        }
        counts.add(count); 
        return counts;
    }
}