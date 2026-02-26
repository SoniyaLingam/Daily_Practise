Given an integer SIZE and an integer array arr of size SIZE, write a function:

sortBasedOnDigits(int SIZE, int[] arr)

that sorts the elements of the array based on their digits starting from the most significant digit (leftmost digit).

The sorting must be done by comparing digits from left to right (similar to dictionary or lexicographical order).

Do not use normal numeric sorting.

Input Format

First line contains an integer SIZE.

Second line contains SIZE space-separated integers.

Output Format

Print the sorted array based on digit-wise comparison.

Example 1

Input

6
200 2 22 32 3 4

Output

2 200 22 3 32 4
Example 2

Input

5
124 1201 204 230 104

Output

104 1201 124 204 230


import java.util.*;

public class arrangeintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int SIZE = sc.nextInt();
        int[] arr = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = sc.nextInt();
        }

        
        String[] strArr = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        
        Arrays.sort(strArr);

       
        for (int i = 0; i < SIZE; i++) {
            System.out.print(strArr[i] + " ");
        }
    }
}

Time complexity is approximately O(SIZE * log(SIZE)).
Space complexity is dominated by the string array, which is O(SIZE * L).