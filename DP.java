A special alphabet series can be formed using three alphabets A, B, and C.

An integer K is given as input. The program must print the count of all possible alphabet series of length K.

📌 Rules for forming the series:

A can be followed by B or C

B can be followed by A or C

C can be followed by only B

📊 Boundary Condition:

1
≤
𝐾
≤
40
1≤K≤40

📥 Input Format:

A single integer K

📤 Output Format:

Print the count of all possible valid series of length K

🔍 Example 1:

Input:

3

Output:

8

Explanation:
Valid sequences:

ABA
ABC
ACB
BAB
BAC
BCB
CBA
CBC
🔍 Example 2:

Input:

5

Output:

21





import java.util.*;
public class DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]dpa=new int[n];
        int[]dpb=new int[n];
        int[]dpc=new int[n];
        dpa[0]=1;
        dpb[0]=1;
        dpc[0]=1;
        for(int u=1;u<n;u++){
            dpa[u]=dpb[u-1]+dpc[u-1];
            dpb[u]=dpa[u-1]+dpc[u-1];
            dpc[u]=dpb[u-1];
        }
        System.out.print(dpa[n-1]+dpb[n-1]+dpc[n-1]);
        
    }
}

 time complexity: O(n).
 space complexity: O(n).