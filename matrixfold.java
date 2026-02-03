Merge Columns – Fold to the Left

An integer matrix with R rows and C columns is given as input.
The program must fold the matrix towards the left starting from the Nᵗʰ column and merge (add) the overlapping column values.
After folding, the program must print the resulting matrix.

Boundary Conditions

2 ≤ R, C ≤ 50

1 ≤ Matrix element value ≤ 10⁴

1 ≤ N ≤ C

Input Format

The first line contains R and C separated by a space.

The next R lines, each contain C integers separated by a space.

The (R + 2)ᵗʰ line contains N.

Output Format

The first R lines contain the folded matrix based on the given conditions.

Example Input/Output 1

Input

3 5
10 20 30 40 50
99 77 55 44 11
1 3 5 6 9
4


Output

10 70 70
99 88 99
1 12 11


Explanation

Folding starts from the 4ᵗʰ column towards the left.

4ᵗʰ column merges with 3ʳᵈ column.

5ᵗʰ column merges with 2ⁿᵈ column.

Remaining left columns stay unchanged.

import java.util.*;

public class matrixfold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int w = sc.nextInt();

        int[][] l = new int[q][w];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < w; j++) {
                l[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < q; i++) {
            ArrayList<Integer> p = new ArrayList<>();
            int k = n - 1;
            int j = n - 2;

            while (true) {
                if (j >= 0 && k < w) {
                    p.add(l[i][k] + l[i][j]);
                } else if (k < w) {
                    p.add(l[i][k]);
                } else if (j >= 0) {
                    p.add(l[i][j]);
                } else {
                    break;
                }
                j--;
                k++;
            }

            for (int x = p.size() - 1; x >= 0; x--) {
                System.out.print(p.get(x));
                if (x != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


- Time complexity: O(q * w)
- Space complexity: O(q * w)