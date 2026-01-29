function maximizeInteger

The function/method maximizeInteger accepts four arguments – M, arr1, N, and arr2.
The integer M represents the size of the integer array arr1.
The integer N represents the size of the integer array arr2.
Both arrays contain only digits.
The digits in the array arr1 represent an integer value X.

The function/method maximizeInteger must maximize the value of X by replacing its digits with the digits in the array arr2.

Your task is to implement the function maximizeInteger so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

5
1 0 3 5 6
3
1 9 7


Output:

9 7 3 5 6

Explanation:

The value of M is 5 and the given 5 integers are 1, 0, 3, 5, and 6.
The value of N is 3 and the given 3 integers are 1, 9, and 7.

After replacing the digit 1 in arr1 with the digit 9 from arr2, the array becomes:

9 0 3 5 6


After replacing the digit 0 in arr1 with the digit 7 from arr2, the array becomes:

9 7 3 5 6

void maximizeInteger(int M, int arr1[M], int N, int arr2[N]) {
    // Sort arr2 in descending order (simple bubble sort)
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            if (arr2[i] < arr2[j]) {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
            }
        }
    }
    
    int j = 0;
    for (int i = 0; i < M; i++) {
        if (j < N && arr2[j] > arr1[i]) {
            arr1[i] = arr2[j];
            j++;
        }
    }
}


Time complexity: O(N^2 + M)
Space complexity: O(1)