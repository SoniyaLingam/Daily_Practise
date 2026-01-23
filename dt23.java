In a room, the R × C boxes are arranged as a matrix where each box contains gold coins. A set of instructions are given to a boy to pick the boxes in the room.
The initial position of the boy is (1, 1). He can move around the room based on the following instructions:
If it is N, then he can move 1 step towards North.
If it is E, then he can move 1 step towards East.
If it is W, then he can move 1 step towards West.
If it is S, then he can move 1 step towards South.
The boy is allowed to take gold coins from the room based on the following conditions:
He must take all the coins out of the box when he picks a box the first time.
Whenever he picks up the same box a second time or more, he must put 1 gold coin back into that box using the same gold coins that he collected from the same box.
If there are no coins to put in the box when picking multiple times, then he ignores the box.
The program must accept:
An integer matrix of size R × C representing the boxes
A string S representing the set of instructions
The program must print the total number of gold coins he can collect as the output.
Note:
The given instructions are always valid (i.e., there is no instruction that will take him out of the room).
Boundary Conditions:
2≤𝑅,𝐶≤25
2≤R,C≤25

1
≤
1≤ Number of gold coins in each box 
≤
100
≤100

1
≤
1≤ Length of S 
≤
50
≤50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contain C integers separated by a space.

The (R + 2)ᵗʰ line contains the string S.

Output Format:

The first line contains an integer representing the total number of gold coins he can collect.

Example Input:
3 3
5 4 6
2 5 1
1 2 3
EESWNNW

output:19

import java.sql.Time;
import java.util.*;

public class dt23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] mat = new int[R][C];
        for(int i = 0; i < R; i++)
            for(int j = 0; j < C; j++)
                mat[i][j] = sc.nextInt();

        String S = sc.next();

        int r = 0, c = 0;
        int total = 0;

        int[][] collected = new int[R][C];

        total += mat[0][0];
        collected[0][0] = mat[0][0];
        mat[0][0] = 0;

        Map<Character, int[]> move = new HashMap<>();
        move.put('N', new int[]{-1, 0});
        move.put('S', new int[]{1, 0});
        move.put('E', new int[]{0, 1});
        move.put('W', new int[]{0, -1});

        for(char ch : S.toCharArray()) {
            r += move.get(ch)[0];
            c += move.get(ch)[1];

            if(mat[r][c] > 0) {
                total += mat[r][c];
                collected[r][c] = mat[r][c];
                mat[r][c] = 0;
            } else if(collected[r][c] > 0) {
                collected[r][c]--;
                total--;
            }
        }

        System.out.print(total);
    }
}

Time Complexity:O(R×C+∣S∣)
Space Complexity:O(R×C)

