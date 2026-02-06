Problem Statement

The program must accept an integer X and N pairs as the input.
Each pair contains a string and an integer.

The program must form a string S of length X based on the following conditions:

Initially, all the characters in the string must be hyphens (-).

For each string–integer pair (string str, integer P), the program must insert the string str into the string S starting from position P if the string S contains L consecutive hyphens starting from position P (where L represents the length of string str).

Otherwise, the program must not modify the string S.

Finally, the program must print the modified string S as the output.

Boundary Conditions

1 ≤ P ≤ X ≤ 100

1 ≤ N ≤ 100

1 ≤ length of each string ≤ 30

Input Format

The first line contains X.

The second line contains N.

The next N lines each contain a string value str and an integer P.

Output Format

The first line contains the string S.

Example Input
9
4
Skill 1
Program 4
Rack 7
Rack 6

Example Output
SkillRack

import java.util.*;

public class position
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] res = new int[x];

        for (int u = 0; u < x; u++) {
            res[u] = '-';
        }

        for (int u = 0; u < n; u++) {
            String s = sc.next();
            int p = sc.nextInt() - 1;
            int l = s.length();

            if (l + p > x) {
                continue;
            }

            boolean flag = true;
            for (int uo = 0; uo < l; uo++) {
                if (res[p + uo] != '-') {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (int j = 0; j < l; j++) {
                    res[p + j] = s.charAt(j);
                }
            }
        }

        for (int u = 0; u < x; u++) {
            System.out.print((char) res[u]);
        }
    }
}




time complexity: O(x + n * L).
space complexity is O(x).