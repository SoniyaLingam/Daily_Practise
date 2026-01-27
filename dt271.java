Print Ranges - Array

The program must accept N integers and print the unique ranges in ascending order.

Boundary Condition(s):
1 <= N <= 1000
0 <= Each integer value <= 1000

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the ranges separated by a space.

Example Input/Output 1:
Input:
8
4 6 1 9 7 0 2 3

Output:
0-4 6-7 9-9

Explanation:
The integers in the range 0-4 are 0, 1, 2, 3 and 4.
The integers in the range 6-7 are 6 and 7.
The only integer in the range 9-9 is 9.

Example Input/Output 2:
Input:
8
4 8 7 5 6 3 3 5

Output:
3-8

import java.util.*;
public class dt271{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)a[i]=sc.nextInt();
Arrays.sort(a);
int start=a[0],prev=a[0];
for(int i=1;i<n;i++){
if(a[i]==prev||a[i]==prev+1){
prev=a[i];
}else{
System.out.print(start+"-"+prev+" ");
start=prev=a[i];
}
}
System.out.print(start+"-"+prev);
sc.close();
}
}

Time complexity: O(n log n)
Space complexity: O(n)
