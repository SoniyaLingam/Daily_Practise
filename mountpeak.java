The program must accept an integer N representing the number of test cases. For each test case, an integer S representing the size of an array is given followed by S integers. The program must count and print the number of mountain peaks in the array.

A mountain peak is an element that is greater than both its immediate left and right elements.

For each test case, print the count of mountain peaks.

Input Format
The first line contains N.
For each test case:
The first line contains S.
The second line contains S space-separated integers.

Output Format
The output contains N lines, where each line represents the number of mountain peaks in the corresponding array.

Boundary Conditions
1 ≤ N ≤ 100
3 ≤ S ≤ 1000
1 ≤ Array elements ≤ 10⁶

Example

Input

1
6
1 3 2 4 3 5

Output

2

Explanation

Peaks are 3 and 4 because each is greater than its neighbors.




import java.util.*;
public class mountpeak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            int s=sc.nextInt();
            int[]mat=new int[s];
            int c=0;
            for(int u=0;u<s;u++){
                mat[u]=sc.nextInt();
            }
            for(int u=1;u<s-1;u++){
            if(mat[u]>mat[u-1] && mat[u]>mat[u+1]){
                c++;
            }
            }
            
            
            System.out.println(c);
        }
    }
}

- Time complexity: O(n * s)
- Space complexity: O(s)