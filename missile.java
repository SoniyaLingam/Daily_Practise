City Missiles

There are N cities arranged in a row and each city has a missile that will destroy another city to its left or right.

The program must accept N pairs of integers (X, Y) as input.

X represents the position of a city.

Y represents the number of positions that the missile can travel.

The sign of Y indicates the direction:

If Y > 0, the missile travels to the right.

If Y < 0, the missile travels to the left.

It is guaranteed that Y ≠ 0.

The missile will land exactly at position X + Y.

🔹 Task

Print:

YES


If there exist any two cities that can destroy each other.

Otherwise, print:

NO

🔹 Boundary Conditions

2 ≤ N ≤ 1000

-1000 ≤ X ≤ 1000

-1000 ≤ Y ≤ 1000

Y ≠ 0

🔹 Input Format

The first line contains an integer N.

The next N lines each contain two integers X and Y separated by a space.

🔹 Output Format

Print YES if any two cities can destroy each other.

Otherwise print NO.

import java.util.*;
public class missile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] pos=new int[n];
        int[] m=new int[n];
        for(int u=0;u<n;u++){
            pos[u]=sc.nextInt();
            m[u]=sc.nextInt();
        }
        for(int u=0;u<n;u++){
            int l=pos[u];
            int y=m[u];
            for(int j=u+1;j<n;j++){
                int l1=pos[j];
                int y1=m[j];
                if(l+y==pos[j] && l1+y1==pos[u]){
                    System.out.print("YES");
                }
            }
        }
        System.out.print("No");
    }
}

- Time complexity: O(n^2)
- Space complexity: O(n)