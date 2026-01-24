The program must accept a string S containing multiple words as the input. The words in a given string are always connected by at least one character at the ends (i.e., some characters at the end of each word occur at the beginning of the next word). The program must form the shortest string by connecting the words from left to right (i.e., removing the duplicate characters in the overlap). Finally, the program must print the shortest string as the output.

Boundary Condition(s):
3 <= Length of S <= 1000

Input Format:
The first line contains S.

Output Format:
The first line contains the shortest string.

Example Input/Output 1:
Input:
water terminator ortho holly yellow owl

Output:
waterminatorthollyellowl

Explanation:
Here S = "water terminator ortho holly yellow owl". The shortest string is formed by connecting the words as given below. water + terminator -> waterminator waterminator + ortho -> waterminatortho waterminatortho + holly -> waterminatortholly waterminatortholly + yellow -> waterminatorthollyellow waterminatorthollyellow + owl -> waterminatorthollyellowl

Example Input/Output 2:
Input:
cat tap pig gun

Output:
catapigun

import java.util.*;

public class dt24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        String[] words = S.split(" ");

        String result = words[0];

        for (int i = 1; i < words.length; i++) {
            String nextWord = words[i];
            int overlap = 0;

            int limit = Math.min(result.length(), nextWord.length());
            for (int k = 1; k <= limit; k++) {
                if (result.substring(result.length() - k).equals(nextWord.substring(0, k))) {
                    overlap = k;
                }
            }

            result += nextWord.substring(overlap);
        }

        System.out.print(result);
    }
}


- Time complexity: O(W * M^2) in the worst case, where W is the number of words and M is the maximum length of a word.
- Space complexity: O(N), where N is the total length of the input string.