The program must accept an integer N and a 2 × N integer matrix as input.

The program must determine the maximum possible sum by selecting numbers from the matrix such that no two selected numbers are adjacent.

Two numbers are considered adjacent if they are:

Vertically adjacent (same column)

Horizontally adjacent (neighboring columns)

Diagonally adjacent

Boundary Conditions
2 ≤ N ≤ 100
1 ≤ Matrix element value ≤ 10^5
Input Format

The first line contains the integer N.

The second line contains N integers (first row of the matrix).

The third line contains N integers (second row of the matrix).

Output Format

Print a single integer representing the maximum possible sum such that no two chosen numbers are adjacent.

Example Input
3
2 5 6
3 1 1
Example Output
9
Explanation

Matrix:

2 5 6
3 1 1

Possible valid selections:

(1,1) and (1,3) → 2 + 6 = 8
(1,1) and (2,3) → 2 + 1 = 3
(2,1) and (1,3) → 3 + 6 = 9
(2,1) and (2,3) → 3 + 1 = 4

Maximum sum:

9


import java.util.*;

public class diagnolsum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] r1 = new int[n];
        int[] r2 = new int[n];

        for(int i = 0; i < n; i++)
            r1[i] = sc.nextInt();

        for(int i = 0; i < n; i++)
            r2[i] = sc.nextInt();

        int[] col = new int[n];

        for(int i = 0; i < n; i++)
            col[i] = Math.max(r1[i], r2[i]);

        if(n == 1){
            System.out.println(col[0]);
            return;
        }

        int prev2 = col[0];
        int prev1 = Math.max(col[0], col[1]);

        for(int i = 2; i < n; i++){
            int curr = Math.max(prev1, prev2 + col[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(prev1);
    }
}

time complexity is O(n)
space complexity is O(n)