Problem Statement

The program must accept a string S denoting the name of a text file and an integer N as the input. The program must read the first N lines from the given file. Then the program must print the N lines in reverse order as the output.

Note: The given file is always present in the same folder where the program executes.

Boundary Condition(s):

5 ≤ Length of S ≤ 20

1 ≤ N ≤ Number of lines in the file ≤ 100

1 ≤ Length of each line in the file ≤ 100

Input Format:

The first line contains S.

The second line contains N.

Output Format:

The first N lines contain the first N lines of the given file in reverse order.

Example Input:

input1.txt
5

File Content (input1.txt):

You
pluck
the
red
rose
and
go

Output:

rose
red
the
pluck
You




import java.util.*;
import java.io.*;
public class files1 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt();
        BufferedReader br=new BufferedReader(new Filereader(a));
        String[] lines=new String[n];
        for(int u=0;u<n;u++){
            lines[u]=br.readLine();
            
        }
        for(int j=n-1;j>=0;j--){
            System.out.println(lines[j]);
        }
        br.close();
    }
}

Time complexity: O(n)
Space complexity: O(n * m)