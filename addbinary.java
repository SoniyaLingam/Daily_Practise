Given an integer N and N binary strings, write a program to add all the binary numbers and print their sum in binary format.

Input Format

First line: Integer N (number of binary values)

Next N lines: Each line contains a binary string

Output Format
Print the binary sum of all the given binary strings.

Example

Input

2
10001
11001

Output

101010

Explanation

10001 (17 in decimal)
11001 (25 in decimal)

17 + 25 = 42
42 in binary = 101010



import java.util.*;
public class addbinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int n=sc.nextInt();
        String[]mat=new String[n];
        for(int u=0;u<n;u++){
            mat[u]=sc.next();
        }
        for(int u=0;u<n;u++){
            String a=mat[u];
            int b=Integer.parseInt(a,2);
            num+=b;
            
        }
        String c=Integer.toBinaryString(num);
        System.out.println(c);
    }
}

Time complexity: O(n * k)
Space complexity: O(n * k)