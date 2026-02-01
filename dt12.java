Consecutive Words – Beginning/End

The program must accept a string S containing multiple words as the input.
The program must print YES if each word (except the first word) is formed from the previous word by adding exactly one character to the beginning or the end of the previous word.
Else, the program must print NO as the output.

Boundary Conditions

4 ≤ Length of S ≤ 1000

Input Format

The first line contains the string S.

Output Format

The first line contains YES or NO.

Example Input/Output 1

Input:

an and cand candl candle


Output:

YES


Explanation:
Here, S = "an and cand candl candle"

2nd word: and → (an + d)

3rd word: cand → (c + and)

4th word: candl → (cand + l)

5th word: candle → (candl + e)

So, YES is printed as the output.

Example Input/Output 2

Input:

i it bit bite biter bitter


Output:

NO

import java.util.*;

public class dt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        boolean ok = true;

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];

            if (curr.length() != prev.length() + 1) {
                System.out.println("NO");
                ok = false;
                break;
            }

            if (curr.substring(1).equals(prev) ||
                curr.substring(0, curr.length() - 1).equals(prev)) {
                continue;
            } else {
                System.out.println("NO");
                ok = false;
                break;
            }
        }

        if (ok) {
            System.out.println("YES");
        }
    }
}

time complexity is O(N)
space complexity is O(N)

