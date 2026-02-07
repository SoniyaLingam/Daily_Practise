Next Immediate Larger Value

The program must accept N integers and for each integer, the program must print the next immediate larger integer on the right.
If there is no such immediate larger integer, then the current integer value itself must be printed as the output.

Boundary Condition(s):
1 ≤ N ≤ 10^5

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains N integers separated by a space.

Example Input:
7
10 45 20 40 60 50 100

Example Output:
45 60 40 60 100 100 100

Explanation:

The next immediate larger number for 10 is 45.

The next immediate larger number for 45 is 60 (20 and 40 are smaller).

For 20, it is 40.

For 40, it is 60.

For 60, it is 100 (50 is smaller).

For 50, it is 100.

For 100, there is no larger integer on the right, so 100 itself is printed.


import java.util.*;
public class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]res=new int[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            res[u]=arr[u];
        }
        Stack<Integer> st=new Stack<>();
        for(int u=0;u<n;u++){
            while(!st.isEmpty()&& arr[u]>arr[st.peek()]){
                res[st.pop()]=arr[u];
            }
            st.push(u);

        }
        for(int u=0;u<n;u++){
            System.out.print(res[u]+" ");
        }
    }}


- Time Complexity: O(n)
- Space Complexity: O(n)