Maximum Rectangular Area

You are given N positions, where each position contains some number of boxes stacked vertically.

Your task is to find the maximum number of boxes that can form a continuous rectangular area.

🔹 Input Format

The first line contains an integer N — the number of positions.

The second line contains N space-separated integers, representing the number of boxes at each position.

🔹 Output Format

Print a single integer — the maximum rectangular area that can be formed using continuous positions.

🔹 Constraints

1
≤
𝑁
≤
1000
1≤N≤1000

0
≤
𝑏
𝑜
𝑥
𝑒
𝑠
[
𝑖
]
≤
10
6
0≤boxes[i]≤10
6

🔹 Explanation

You can choose any continuous sequence of positions.

The height of the rectangle is the minimum number of boxes in that chosen sequence.

The width is the number of positions selected.

Area = width × minimum height.

Find and print the maximum possible area.

🔹 Example

Input

12
6 5 4 5 7 9 1 9 2 6 7 8


Output

24


import java.util.*;
public class book{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]s=new int[n];
        for(int u=0;u<n;u++){
            s[u]=sc.nextInt();
        }
        int m=0;
        for(int u=0;u<n;u++){
            int min=s[u];
            for(int j=u;j<n;j++){
                if(s[j]<min){
                    min=s[j];
                }

            
            int width=j - u + 1;
            int a=width*min;
            if(a>m){
                m=a;
            }
        }
        }
        System.out.print(m);
    }
}

- Time complexity: O(n^2)
- Space complexity: O(n)