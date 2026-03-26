Given an array of integers A of size N, find the equilibrium index of the array.

An index i is said to be an equilibrium index if:

Sum of elements at indices 0 to i-1 = Sum of elements at indices i+1 to N-1

👉 The element at index i is not included in either sum.

📌 Input Format
First line: Integer N (size of array)
Second line: N space-separated integers
📌 Output Format
Print the equilibrium index
If no such index exists, print -1
📌 Example 1

Input:

7
-7 1 5 2 -4 3 0

Output:

3




import java.util.*;
public class equilibiriumindex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int t=0;
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            t+=arr[u];
        }
        int ls=0;
        for(int j=0;j<n;j++){
            int r=t-ls-arr[j];
            if(ls==r){
                System.out.print(j);
                return;
            }
            ls+=arr[j];
        }
        System.out.print("-1");
        
    }
}


Time complexity: O(n)
Space complexity: O(n)