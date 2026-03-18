Write a program to:

👉 Read an integer N (number of boxes)
👉 For each box, read 3 integers:

Number of pens

Number of pencils

Number of erasers

👉 Calculate the total cost of each box using:

Total Cost = (pens × 10) + (pencils × 5) + (erasers × 3)

👉 Print the maximum cost among all boxes

🔹 Input Format

First line: Integer N

Next N lines: Each line contains 3 integers

pens pencils erasers
🔹 Output Format

Print a single integer → maximum cost

🔹 Example
Input
4
2 5 1
1 2 3
3 1 3
3 3 3
Output
54
🔹 Explanation

Box 1 → 2×10 + 5×5 + 1×3 = 48

Box 2 → 29

Box 3 → 44

Box 4 → 54

👉 Maximum = 54




import java.util.*;
public class priceofstationary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            int pe=sc.nextInt();
            int p=sc.nextInt();
            int e=sc.nextInt();
            int s=pe*10+p*5+e*3;
            arr[u]=s;
        }
        int max=arr[0];
        for(int u=1;u<n;u++){
            max=Math.max(max,arr[u]);
            
        }
        
        System.out.print(max);
    }
}

Time and Space Complexity:O(n)