Rod Cutting Problem

The program must accept N integers representing the lengths of N rods. A boy cuts the rods into smaller rods based on the following conditions:

He finds the length of the shortest rod.

Then he cuts that length from each of the longer rods.

He removes all the rods of the shortest length.

When all the remaining rods have the same length, they cannot be shortened further, so he removes them.

He repeats the above process until there are no rods left.

The program must print the number of rods remaining before each cutting process.

📌 Boundary Conditions

1 ≤ N ≤ 1000

1 ≤ Length of each rod ≤ 1000

📥 Input Format

The first line contains N.

The second line contains N space-separated integers representing the rod lengths.

📤 Output Format

Print the number of rods remaining before each cutting operation.

Each value must be printed on a new line.

📘 Example
Input
6
8 4 2 2 7 8
Output
6
4
3
2


import java.util.*;
public class rod {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]mat=new int[n];
        for(int u=0;u<n;u++){
            mat[u]=sc.nextInt();
        }
        Arrays.sort(mat);
        int u=0;
        int r=n;
        while(u<n){
            System.out.println(r);
            int s=mat[u];
            while((u<n)&& mat[u]==s){
                u++;
                r--;
            }
        }
        
    }
}

Time complexity: O(n log n)
Space complexity: O(n)