Group Words – Combinations

The program must accept a string S containing multiple words as the input. The program must group the words where each word is a combination of the other words. Then the program must print the groups of words in separate lines in the order of their occurrence.

Boundary Condition(s):

3 ≤ Length of S ≤ 1000

Input Format:

The first line contains the string S.

Output Format:

The lines contain the groups of words separated by a space based on the given conditions.

Example Input:
neon nose ones race none noes care

Example Output:
neon none
nose ones noes
race care

Explanation:

Here S = "neon nose ones race none noes care".

1st group: neon none

2nd group: nose ones noes

3rd group: race care

In each group, each word is a combination of the other words in the group.
Hence the output is:

neon none
nose ones noes
race care

import java.util.*;

public class group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        boolean[] used = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue;

            String w1 = words[i];
            char[] a = w1.toCharArray();
            Arrays.sort(a);

            System.out.print(w1);
            used[i] = true;

            for (int j = i + 1; j < words.length; j++) {
                if (used[j]) continue;

                char[] b = words[j].toCharArray();
                Arrays.sort(b);

                if (Arrays.equals(a, b)) {
                    System.out.print(" " + words[j]);
                    used[j] = true;
                }
            }
            System.out.println();
        }
    }
}

- Time complexity: approximately O(N^2 * M log M)
- Space complexity: approximately O(N * M)