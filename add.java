The function/method containsConcatenatedWord accepts an argument str.
The string str contains multiple words separated by a space.

The function/method containsConcatenatedWord must return 1 if the given str contains a word which is equal to the concatenation of any two words in any order.
Else, the function must return 0.

Input Format

A single line containing a string with multiple space-separated words.

Output Format

Print 1 if a concatenated word exists.

Otherwise, print 0.

Example 1

Input:
rat lion cat ratcat tiger

Output:
1

Explanation:
rat + cat = ratcat, which exists in the string.

Example 2

Input:
rat lion cat ratcatpig tiger

Output:
0

Example 3

Input:
zebra fox monkey donkey wolf donkeyfox

Output:
1

import java.util.*;

public class Main {

    public static int containsConcatenatedWord(String str) {
        String[] words = str.split("\\s+");
        int n = words.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    String combined = words[i] + words[j];
                    for (int k = 0; k < n; k++) {
                        if (combined.equals(words[k])) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(containsConcatenatedWord(str));
    }
}


- Time complexity: O(n^3 * m)
- Space complexity: O(n * m)
